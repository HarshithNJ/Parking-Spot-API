package org.parking.parking_spot.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class parkingSpot {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private long spotNumber;
    private String VehicleType;
    private String location;
    private boolean isOccupied;
    private String reservedFor;
}
