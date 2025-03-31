package org.parking.parking_spot.repository;

import org.parking.parking_spot.dto.parkingSpot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface parkingSpotRepository extends JpaRepository<parkingSpot, Integer>{

    boolean ExistsBySpotNumber(long spotNumber);

}
