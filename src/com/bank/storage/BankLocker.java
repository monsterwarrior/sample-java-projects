/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bank.storage;

import com.bank.model.Account;
import com.bank.model.Customer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author suraj ganti
 */
public class BankLocker {
    
    Map<String, Customer> locker=new HashMap();
    
    public String createAccount(Customer customer){
        locker.put(customer.getAccount().getAccountNumber(), customer);
        
        return customer.getName();
    }
    
    public Customer deposit(Customer customer){
        
        locker.put(customer.getAccount().getAccountNumber(), customer);
        return customer;
    }
    
    public Customer withdraw(Customer customer){
        locker.put(customer.getAccount().getAccountNumber(), customer);
        return customer;
    }
    
    public Customer getcustomerByAccountNumber(String accountNumber){
       return  locker.get(accountNumber);
        
    }
     public Map getAllCustomers(){
         
       return  locker;
        
    }
    
}
