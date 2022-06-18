package dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.TypeFactory;

import model.User;

public class UserDAO {
	
	private Map<String, User> users = new HashMap<>();
	
	public UserDAO() {}

	public UserDAO(String contextPath) {
		loadUsers(contextPath);
	}
	
	public User find(String username, String password) {
		if (!users.containsKey(username)) {
			return null;
		}
		User user = users.get(username);
		if (!user.getPassword().equals(password)) {
			return null;
		}
		return user;
	}
	
	public Collection<User> findAll() {
		return users.values();
	}
	
	public void saveUsers(String contextPath) {
		FileWriter fw = null;
		try {
			File file = new File(contextPath + "/users.txt");
			file.createNewFile();
			
			String json = new ObjectMapper().writeValueAsString(users);
			
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
		

	
	public void loadUsers(String contextPath) {
		BufferedReader in = null;
		FileWriter fw = null;
		try {
			File file = new File(contextPath + "/users.txt");
			in = new BufferedReader(new FileReader(file));
			
			ObjectMapper mapper = new ObjectMapper();
			TypeFactory typeFactory = mapper.getTypeFactory();
			MapType mapType = typeFactory.constructMapType(HashMap.class, String.class, User.class);
			users = mapper.readValue(file, mapType);
		} catch (FileNotFoundException fex) {
			try {
				File file = new File(contextPath + "/users.txt");
				file.createNewFile();
				
				String json = new ObjectMapper().writeValueAsString(users);
				
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

