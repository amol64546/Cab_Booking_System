package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;

    private String mobile;
    private String email;
    private String password;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<TripBooking> tripBookingList = new ArrayList<>();

    public Customer(){};

    public Customer(String mobile, String password, String email) {
        this.mobile = mobile;
        this.password = password;
        this.email = email;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<TripBooking> getTripBookingList() {
        return tripBookingList;
    }

    public void setTripBookingList(List<TripBooking> tripBookingList) {
        this.tripBookingList = tripBookingList;
    }
}