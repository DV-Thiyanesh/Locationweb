package com.thiyanu.locationfinder.respository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.thiyanu.locationfinder.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
