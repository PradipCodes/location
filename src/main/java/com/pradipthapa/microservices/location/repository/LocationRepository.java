package com.pradipthapa.microservices.location.repository;

import com.pradipthapa.microservices.location.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LocationRepository extends JpaRepository<Location, Integer> {

}
