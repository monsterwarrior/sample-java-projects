/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bank.model;

/**
 *
 * @author suraj ganti
 */
public class Address {
    private String state;
    private String city;
    private String contact;
    private String pincode;

    public Address(){
    
    }
    
    public Address(String state, String city, String contact, String pincode) {
        this.state = state;
        this.city = city;
        this.contact = contact;
        this.pincode = pincode;
    }

  

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" + "state=" + state + ", city=" + city + ", contact=" + contact + ", pincode=" + pincode + '}';
    }
    
    
    
}
