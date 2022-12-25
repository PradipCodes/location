package com.pradipthapa.microservices.location.service;

import com.pradipthapa.microservices.location.entities.Location;
import com.pradipthapa.microservices.location.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationRepository locationRepository;

    @Override
    public Location saveLocation(Location location) {
        return locationRepository.save(location);
    }

    @Override
    public Location updateLocation(Location location) {
        return locationRepository.save(location);
    }

    @Override
    public void deleteLocation(Location location) {
        locationRepository.delete(location);

    }

    @Override
    public Location getLocationById(int id) {
        return locationRepository.findById(id).get();
    }

    @Override
    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }
}
