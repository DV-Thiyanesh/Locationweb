package com.thiyanu.locationfinder.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiyanu.locationfinder.entities.Location;
import com.thiyanu.locationfinder.respository.LocationRepository;

@Service
public class LocationServiceImpl implements ILocationService {

	@Autowired
	private LocationRepository locationrepository;
	
	@Override
	public Location createLocation(Location location) {
		
		return locationrepository.save(location);
	}

	@Override
	public Location getLocationById(int id) {

		return locationrepository.findById(id).get();
	}

	@Override
	public Location updateLocation(Location location) {
		return locationrepository.save(location);
	}

	@Override
	public void deleteLocation(int id) {
		locationrepository.deleteById(id);

	}

	@Override
	public List<Location> findAllLocation() {
		
		return locationrepository.findAll();
	}

	public LocationRepository getLocationrepository() {
		return locationrepository;
	}

	public void setLocationrepository(LocationRepository locationrepository) {
		this.locationrepository = locationrepository;
	}

}
