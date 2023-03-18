package com.driver.model;

import lombok.*;

import javax.persistence.*;

@Entity



@Table(name="cab")
public class Cab{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cabid;

    private int perkmrate;

    public Cab() {
    }

    private boolean available;

    @OneToOne
    @JoinColumn
    Driver driver;

    public Cab(int cabid, int perkmrate, boolean available, Driver driver) {
        this.cabid = cabid;
        this.perkmrate = perkmrate;
        this.available = available;
        this.driver = driver;
    }

    public int getCabid() {
        return cabid;
    }

    public void setCabid(int cabid) {
        this.cabid = cabid;
    }

    public int getPerkmrate() {
        return perkmrate;
    }

    public void setPerkmrate(int perkmrate) {
        this.perkmrate = perkmrate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}