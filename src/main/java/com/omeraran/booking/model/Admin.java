package com.omeraran.booking.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin extends User{

    private String adminKey;

    public Admin(String adminKey) {
        this.adminKey = adminKey;
    }

    public Admin() {

    }

    public String getAdminKey() {
        return adminKey;
    }

    public void setAdminKey(String adminKey) {
        this.adminKey = adminKey;
    }
}
