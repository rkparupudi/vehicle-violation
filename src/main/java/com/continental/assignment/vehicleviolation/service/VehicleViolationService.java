package com.continental.assignment.vehicleviolation.service;

import com.continental.assignment.vehicleviolation.model.VehicleViolation;

import java.util.List;

public interface VehicleViolationService {

    public VehicleViolation save(VehicleViolation vehicleViolation);

    public List<VehicleViolation> getViolatedVehicles(List<String> vehicles);
}
