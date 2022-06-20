package dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.TypeFactory;

import model.SportsFacility;

public class SportsFacilityDAO {
	private Map<String, SportsFacility> sportsFacilities = new HashMap<>();
	private String contextPath;
	
	public SportsFacilityDAO() {}

	public SportsFacilityDAO(String contextPath) {
		this.contextPath = contextPath;
		loadSportsFacilities();
	}
	
	public SportsFacility getFacilityByName(String name) {
		if (!sportsFacilities.containsKey(name)) {
			return null;
		}
		SportsFacility sportsFacility = sportsFacilities.get(name);
		return sportsFacility;
	}
	
	public List<SportsFacility> searchByName(String searchString) {
		List<SportsFacility> facilities = new ArrayList<>();
		for(SportsFacility facility : sportsFacilities.values()) {
			if(facility.getName().contains(searchString)) {
				facilities.add(facility);
			}
		}
		return facilities;
	}
	
	public List<SportsFacility> searchByType(String searchString) {
		List<SportsFacility> facilities = new ArrayList<>();
		for(SportsFacility facility : sportsFacilities.values()) {
			if(facility.getType().toString().contains(searchString)) {
				facilities.add(facility);
			}
		}
		return facilities;
	}
	
	public List<SportsFacility> searchByLocation(String searchString) {
		List<SportsFacility> facilities = new ArrayList<>();
		for(SportsFacility facility : sportsFacilities.values()) {
			if(facility.getLocation().getAddress().contains(searchString)) {
				facilities.add(facility);
			}
		}
		return facilities;
	}
	
	public List<SportsFacility> searchByRating(String searchString) {
		List<SportsFacility> facilities = new ArrayList<>();
		Double searchNumber = Double.parseDouble(searchString);
		for(SportsFacility facility : sportsFacilities.values()) {
			if(facility.getAverageRating() > searchNumber - 0.25 || facility.getAverageRating() < searchNumber + 0.25) {
				facilities.add(facility);
			}
		}
		
		if(facilities.size() >= 2) {
			for(int i = 1; i < facilities.size(); i++) {
				if(Math.abs(facilities.get(i).getAverageRating() - searchNumber) < Math.abs(facilities.get(i-1).getAverageRating() - searchNumber)) {
					SportsFacility temp = facilities.get(i-1);
					facilities.set(i-1, facilities.get(i));
					facilities.set(i, temp);
				}
			}
		}
		
		return facilities;
	}
	
	public Collection<SportsFacility> getAllSportsFacilities() {
		return sportsFacilities.values();
	}
	
	public void addSportsFacility(SportsFacility sportsFacility) {
		sportsFacilities.put(sportsFacility.getName(), sportsFacility);
		saveSportsFacilities();
	}
	
	public void saveSportsFacilities() {
		FileWriter fw = null;
		try {
			File file = new File(contextPath + "/sportsFacilities.txt");
			file.createNewFile();
			
			String json = new ObjectMapper().writeValueAsString(sportsFacilities);
			
			fw = new FileWriter(file);
			fw.write(json);
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (fw != null) {
				try {
					fw.close();
				}
				catch (Exception e) { }
				}
			}
		}
	
	public void loadSportsFacilities() {
		BufferedReader in = null;
		FileWriter fw = null;
		try {
			File file = new File(contextPath + "/sportsFacilities.txt");
			in = new BufferedReader(new FileReader(file));
			
			ObjectMapper mapper = new ObjectMapper();
			TypeFactory typeFactory = mapper.getTypeFactory();
			MapType mapType = typeFactory.constructMapType(HashMap.class, String.class, SportsFacility.class);
			sportsFacilities = mapper.readValue(file, mapType);
		} catch (FileNotFoundException fex) {
			try {
				File file = new File(contextPath + "/sportsFacilities.txt");
				file.createNewFile();
				
				String json = new ObjectMapper().writeValueAsString(sportsFacilities);
				
				fw = new FileWriter(file);
				fw.write(json);
			} catch (IOException ioex) {
				ioex.printStackTrace();
			} finally {
				if (fw != null) {
					try {
						fw.close();
					}
					catch (Exception e) { }
					}
				}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				}
				catch (Exception e) { }
				}
			}
		}
}
