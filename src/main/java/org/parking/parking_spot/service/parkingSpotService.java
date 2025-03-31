package org.parking.parking_spot.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.parking.parking_spot.dto.parkingSpot;
import org.parking.parking_spot.repository.parkingSpotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class parkingSpotService {
    
    @Autowired
    parkingSpotRepository repository;

    public ResponseEntity<Object> postParkingSpot(parkingSpot spot) {

        if(repository.ExistsBySpotNumber(spot.getSpotNumber())) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("Error", "Spot already exists with the number " + spot.getSpotNumber());

            return new ResponseEntity<Object>(map, HttpStatus.BAD_REQUEST);
        } else {
            repository.save(spot);

            Map<String, Object> map = new HashMap<String, Object>();
            map.put("Success", "Spot added successfully");
            map.put("Parking Spot", spot);

            return new ResponseEntity<Object>(map, HttpStatus.CREATED);
        }
    }

    public ResponseEntity<Object> postMultipleParkingSpots(List<parkingSpot> spots) {

        for(parkingSpot spot : spots) {
            if(repository.ExistsBySpotNumber(spot.getSpotNumber())) {
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("Error", "One or more Spots already exists");
    
                return new ResponseEntity<Object>(map, HttpStatus.BAD_REQUEST);
            }
        }
        repository.saveAll(spots);

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("Success", "Spots added successfully");
        map.put("Parking Spots", spots);

        return new ResponseEntity<Object>(map, HttpStatus.CREATED);
    }
}
