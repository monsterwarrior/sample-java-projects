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
public class Account {
    private String accountNumber;
    private String ifscode;
    private String dateOfAccountCreation;

    public Account() {
    }

    
    public Account(String accountNumber, String ifscode, String dateOfAccountCreation) {
        this.accountNumber = accountNumber;
        this.ifscode = ifscode;
        this.dateOfAccountCreation = dateOfAccountCreation;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getIfscode() {
        return ifscode;
    }

    public void setIfscode(String ifscode) {
        this.ifscode = ifscode;
    }

    public String getDateOfAccountCreation() {
        return dateOfAccountCreation;
    }

    public void setDateOfAccountCreation(String dateOfAccountCreation) {
        this.dateOfAccountCreation = dateOfAccountCreation;
    }

    @Override
    public String toString() {
        return "Account{" + "accountNumber=" + accountNumber + ", ifscode=" + ifscode + ", dateOfAccountCreation=" + dateOfAccountCreation + '}';
    }
    
    
    
}
