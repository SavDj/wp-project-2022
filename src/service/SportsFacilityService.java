package service;

import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import dao.SportsFacilityDAO;
import model.SportsFacility;

@Path("facilities")
public class SportsFacilityService {
	
	@Context
	ServletContext ctx;
	
	public SportsFacilityService() {}
	
	@PostConstruct
	public void init() {
		if (ctx.getAttribute("sportsFacilityDao") == null) {
	    	String contextPath = ctx.getRealPath("");
			ctx.setAttribute("sportsFacilityDao", new SportsFacilityDAO(contextPath));
		}
	}
	
	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<SportsFacility> getSportsFacilities() {
		SportsFacilityDAO dao = (SportsFacilityDAO) ctx.getAttribute("sportsFacilityDao");
		return dao.getAllSportsFacilities();
	}
	
	@GET
	@Path("/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public SportsFacility getSportsFacility(@PathParam("name") String name) {
		SportsFacilityDAO dao = (SportsFacilityDAO) ctx.getAttribute("sportsFacilityDao");
		return dao.getFacilityByName(name);
	}
	
	@POST
	@Path("/search")
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<SportsFacility> search(String searchString, String searchType) {
		SportsFacilityDAO dao = (SportsFacilityDAO) ctx.getAttribute("sportsFacilityDao");
		switch(searchType) {
			case "name":
				return dao.searchByName(searchString);
			case "type":
				return dao.searchByType(searchString);
			case "location":
				return dao.searchByLocation(searchString);
			case "rating":
				return dao.searchByRating(searchString);
			default:
				return null;
		}
	}
}
