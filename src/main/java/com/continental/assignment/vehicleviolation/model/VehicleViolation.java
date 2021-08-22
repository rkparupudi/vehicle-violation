package com.continental.assignment.vehicleviolation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="vehicleviolation")
public class VehicleViolation {

    @Id
    @Column(name = "violationId")
    private String violationId;

    @Column(name = "vehicleId")
    private String vehicleId;

    @Column(name = "isViolated")
    private boolean isViolated;

    @Column(name = "description")
    private String description;

    @Column(name = "violationDate")
    private Date violationDate;

    @Column(name = "penalty")
    private String penalty;

    public String getViolationId() {
        return violationId;
    }

    public void setViolationId(String violationId) {
        this.violationId = violationId;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public boolean isViolated() {
        return isViolated;
    }

    public void setViolated(boolean violated) {
        isViolated = violated;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getViolationDate() {
        return violationDate;
    }

    public void setViolationDate(Date violationDate) {
        this.violationDate = violationDate;
    }

    public String getPenalty() {
        return penalty;
    }

    public void setPenalty(String penalty) {
        this.penalty = penalty;
    }
}