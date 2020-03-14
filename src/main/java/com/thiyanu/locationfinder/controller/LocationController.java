package com.thiyanu.locationfinder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.thiyanu.locationfinder.entities.Location;
import com.thiyanu.locationfinder.service.ILocationService;
import com.thiyanu.locationfinder.util.EmailUtil;

@Controller
public class LocationController {

    @Autowired
	private ILocationService locationservice;
	
	@Autowired
    EmailUtil emailutil;
    
    @RequestMapping("/createpage")
	public String createLocationPage() {
    	
    	return "createlocation";
		
	}
//  This can be used through post method but both work  @RequestMapping(value="savelocation", method= RequestMethod.POST)
    @RequestMapping("/savelocation")
    public String createLocation(@ModelAttribute("location") Location location, ModelMap map) {
    	Location savedlocation= locationservice.createLocation(location);
    	String msg="The Location has been saved by using id:"+ savedlocation.getId();
    	map.addAttribute("msg", msg);
    	emailutil.sendEmail("thiyanu13@gmail.com", "Location Saved", "Location Saved Successfully");	
    	return "createlocation";
    }
    
    @RequestMapping("/viewlocation")
    public String findAllLocation(ModelMap map) {
    	List<Location> location = locationservice.findAllLocation();
    	map.addAttribute("location", location);
    	return "viewlocation";
    }

    @RequestMapping("/deletelocation")
    public String deleteLocation(@RequestParam("id") int id, ModelMap map) {
//   this can be used to delete using location b getting id by requestparam   	Location location= new Location();
//    	location.setId(id);
//    	Below line will directly delete by using id or we can send location directly to delete
         locationservice.deleteLocation(id);   
         List<Location> locations = locationservice.findAllLocation();
     	map.addAttribute("location", locations);
    	return "viewlocation";
    }
    
    @RequestMapping("/editlocation")
    public String updateLocationpage(@RequestParam("id") int id, ModelMap map) {
    	Location location=locationservice.getLocationById(id);
    	
    	map.addAttribute("location", location);
    	
    	return "updatelocation";
    }
    
    @RequestMapping("/updatelocation")
    public String updateLocation(@ModelAttribute("location") Location location, ModelMap map) {
    	 locationservice.updateLocation(location);
    	 
    	List<Location> locations=locationservice.findAllLocation();
    	map.addAttribute("location", locations);
    	return "viewlocation"; 
    }
    
}



