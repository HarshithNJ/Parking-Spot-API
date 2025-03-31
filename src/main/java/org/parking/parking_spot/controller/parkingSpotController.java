package org.parking.parking_spot.controller;

import java.util.List;

import org.parking.parking_spot.dto.parkingSpot;
import org.parking.parking_spot.service.parkingSpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class parkingSpotController {
    
    @Autowired
    parkingSpotService service;


    //Post the parking spot data
    @PostMapping("/parkingSpots")
    public ResponseEntity<Object> postParkingSpot(@RequestBody parkingSpot spot){
        return service.postParkingSpot(spot);
    }

    @PostMapping("/parkingSpots/multiple")
    public ResponseEntity<Object> postMultipleParkingSpots(@RequestBody List<parkingSpot> spots){
        return service.postMultipleParkingSpots(spots);
    }
}
