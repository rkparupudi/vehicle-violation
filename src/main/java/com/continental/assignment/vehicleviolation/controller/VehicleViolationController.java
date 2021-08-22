package com.continental.assignment.vehicleviolation.controller;

import com.continental.assignment.vehicleviolation.model.VehicleViolation;
import com.continental.assignment.vehicleviolation.service.VehicleViolationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/violation")
public class VehicleViolationController {
    @Autowired
    VehicleViolationService service;

    @PostMapping("/add")
    public ResponseEntity<VehicleViolation> addVehicleViolation(@RequestBody VehicleViolation vehicleViolation){
        service.save(vehicleViolation);
        return new ResponseEntity<VehicleViolation>(vehicleViolation, HttpStatus.CREATED);
    }

    @GetMapping("/violatedVehicles")
    public ResponseEntity<List<VehicleViolation>> getViolatedVehicles(List<String> vehicles){
        return new ResponseEntity<List<VehicleViolation>>(service.getViolatedVehicles(vehicles), HttpStatus.OK);
    }
}
