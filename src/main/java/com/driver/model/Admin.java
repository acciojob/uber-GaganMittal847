package com.driver.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity





@Table(name="admin")
public class Admin{

    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private int adminid;

    private String username;

    private String password;


    public Admin(int adminid, String username, String password) {
        this.adminid = adminid;
        this.username = username;
        this.password = password;
    }

    public Admin() {
    }

    public int getAdminid() {
        return adminid;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setAdminid(int adminid) {
        this.adminid = adminid;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

