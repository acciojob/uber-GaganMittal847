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
    private int Driverid;

    private String mobnumber;

    private String Password;

    @OneToOne(mappedBy = "driver" ,cascade = CascadeType.ALL)
    Cab cab;

    @OneToMany(mappedBy = "driver",cascade = CascadeType.ALL)
    List<TripBooking> tripBookings = new ArrayList<>();

    public Driver(int driverid, String mobnumber, String password, Cab cab, List<TripBooking> tripBookings) {
        Driverid = driverid;
        this.mobnumber = mobnumber;
        Password = password;
        this.cab = cab;
        this.tripBookings = tripBookings;
    }

    public int getDriverid() {
        return Driverid;
    }

    public Driver() {
    }

    public void setDriverid(int driverid) {
        Driverid = driverid;
    }

    public String getMobnumber() {
        return mobnumber;
    }

    public void setMobnumber(String mobnumber) {
        this.mobnumber = mobnumber;
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
}