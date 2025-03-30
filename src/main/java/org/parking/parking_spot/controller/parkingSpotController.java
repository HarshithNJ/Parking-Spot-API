package org.parking.parking_spot.controller;

import org.parking.parking_spot.service.parkingSpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class parkingSpotController {
    
    @Autowired
    parkingSpotService service;
}
