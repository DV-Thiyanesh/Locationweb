package com.thiyanu.locationfinder.service;

import java.util.List;

import com.thiyanu.locationfinder.entities.Location;


public interface ILocationService {

	Location createLocation(Location location);
    Location getLocationById(int id);
    Location updateLocation(Location location);
    void deleteLocation(int id);
    List<Location> findAllLocation();
	
}
