package com.continental.assignment.vehicleviolation.repository;

import com.continental.assignment.vehicleviolation.model.VehicleViolation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleViolationRepository extends JpaRepository<VehicleViolation, String> {

    @Query( "select v from VehicleViolation v where v.vehicleId in (:vehicleId)" )
    List<VehicleViolation> getViolatedVehicles(@Param("vehicleId") List<String> vehicleId);
}
