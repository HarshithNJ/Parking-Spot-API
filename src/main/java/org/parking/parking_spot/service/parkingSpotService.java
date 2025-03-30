package org.parking.parking_spot.service;

import org.parking.parking_spot.repository.parkingSpotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class parkingSpotService {
    
    @Autowired
    parkingSpotRepository repository;
}
