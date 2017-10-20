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
public class Customer {
    
    private String ID;
    private String name;
    private String surName;
    private Address address;
    private Account account;
    private Transactions transaction;

    public Customer() {
    }

    
    
    public Customer(String ID, String name, String surName, Address address, Account account, Transactions transaction) {
        this.ID = ID;
        this.name = name;
        this.surName = surName;
        this.address = address;
        this.account = account;
        this.transaction = transaction;
    }

    
    public Customer(String ID, String name, String surName) {
        this.ID = ID;
        this.name = name;
        this.surName = surName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Transactions getTransaction() {
        return transaction;
    }

    public void setTransaction(Transactions transaction) {
        this.transaction = transaction;
    }

    @Override
    public String toString() {
        return "Customer{" + "ID=" + ID + ", name=" + name + ", surName=" + surName + ", address=" + address + ", account=" + account + ", transaction=" + transaction + '}';
    }
    
    

  
    
   
    
    
    
    
}
