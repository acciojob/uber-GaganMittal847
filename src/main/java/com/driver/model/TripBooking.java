package com.driver.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity



public class TripBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int TripId;

    private String fromlocation;

    private String tolocation;

    private int distanceInkm;

    @Enumerated(EnumType.STRING)
    private TripStatus tripStatus;

    private int bill;

    @ManyToOne
    @JoinColumn
    Driver driver;

    public int getTripId() {
        return TripId;
    }

    public void setTripId(int tripId) {
        TripId = tripId;
    }

    public String getFromlocation() {
        return fromlocation;
    }

    public void setFromlocation(String fromlocation) {
        this.fromlocation = fromlocation;
    }

    public String getTolocation() {
        return tolocation;
    }

    public void setTolocation(String tolocation) {
        this.tolocation = tolocation;
    }

    public int getDistanceInkm() {
        return distanceInkm;
    }

    public void setDistanceInkm(int distanceInkm) {
        this.distanceInkm = distanceInkm;
    }

    public TripStatus getTripStatus() {
        return tripStatus;
    }

    public void setTripStatus(TripStatus tripStatus) {
        this.tripStatus = tripStatus;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @ManyToOne
    @JoinColumn
    Customer customer;

    public TripBooking() {
    }

    public TripBooking(int tripId, String fromlocation, String tolocation, int distanceInkm, TripStatus tripStatus, int bill, Driver driver, Customer customer) {
        TripId = tripId;
        this.fromlocation = fromlocation;
        this.tolocation = tolocation;
        this.distanceInkm = distanceInkm;
        this.tripStatus=tripStatus;
        this.bill = bill;
        this.driver = driver;
        this.customer = customer;
    }
}