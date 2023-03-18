package com.driver.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity



public class Driver{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int DriverId;

    private String mobNumber;

    private String Password;

    @OneToOne(mappedBy = "driver" ,cascade = CascadeType.ALL)
    Cab cab;

    @OneToMany(mappedBy = "driver",cascade = CascadeType.ALL)
    List<TripBooking> tripBookings = new ArrayList<>();

    public Driver() {
    }

    public int getDriverId() {
        return DriverId;
    }

    public void setDriverId(int driverId) {
        DriverId = driverId;
    }

    public String getMobNumber() {
        return mobNumber;
    }

    public void setMobNumber(String mobNumber) {
        this.mobNumber = mobNumber;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Cab getCab() {
        return cab;
    }

    public void setCab(Cab cab) {
        this.cab = cab;
    }

    public List<TripBooking> getTripBookings() {
        return tripBookings;
    }

    public void setTripBookings(List<TripBooking> tripBookings) {
        this.tripBookings = tripBookings;
    }

    public Driver(int driverId, String mobNumber, String password, Cab cab, List<TripBooking> tripBookings) {
        DriverId = driverId;
        this.mobNumber = mobNumber;
        Password = password;
        this.cab = cab;
        this.tripBookings = tripBookings;
    }
}