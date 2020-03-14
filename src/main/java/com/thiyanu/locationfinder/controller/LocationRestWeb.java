package com.thiyanu.locationfinder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thiyanu.locationfinder.entities.Location;
import com.thiyanu.locationfinder.respository.LocationRepository;

@RestController
@RequestMapping("/location")
public class LocationRestWeb {

   @Autowired
	private LocationRepository locationrepository;
   
   
   @GetMapping
   public List<Location> getAllLocation(){
	   
	   return locationrepository.findAll();
   }
   
   @PostMapping
	public Location createLocation(@RequestBody Location location) {
		return locationrepository.save(location);
	}
   
   @PutMapping
   public Location updateLocation(@RequestBody Location location) {
	   return locationrepository.save(location);
   }
   
   @DeleteMapping("/{id}")
   public void deleteMapping(@PathVariable("id") int id) {
	   
	   locationrepository.deleteById(id);
   }
   
   @GetMapping("/{id}")
   public Location getLocationById(@PathVariable("id") int id) {
	   
   return locationrepository.findById(id).get();
}
   
}
