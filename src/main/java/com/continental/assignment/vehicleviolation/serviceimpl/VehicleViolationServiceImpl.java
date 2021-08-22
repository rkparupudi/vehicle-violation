package com.continental.assignment.vehicleviolation.serviceimpl;

import com.continental.assignment.vehicleviolation.model.VehicleViolation;
import com.continental.assignment.vehicleviolation.repository.VehicleViolationRepository;
import com.continental.assignment.vehicleviolation.service.VehicleViolationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleViolationServiceImpl implements VehicleViolationService {

    @Autowired
    VehicleViolationRepository repository;

    @Override
    public VehicleViolation save(VehicleViolation vehicleViolation) {
        return repository.save(vehicleViolation);
    }

    @Override
    public List<VehicleViolation> getViolatedVehicles(List<String> vehicles) {
        return repository.getViolatedVehicles(vehicles);
    }
}
