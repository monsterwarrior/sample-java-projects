/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bank.acitivites;

import com.bank.model.Customer;
import com.bank.storage.BankLocker;
import java.util.Map;

/**
 *
 * @author suraj ganti
 */
public class BankServiceImpl extends BankService {

    BankLocker locker = new BankLocker();
    
    
    @Override
    public String createAccount(Customer customer) {
      String name= locker.createAccount(customer);
       return name;
    }

    @Override
    public Customer deposit(Customer customer) {
       Customer cum= locker.deposit(customer);
        return cum;
            }

    @Override
    public Customer withdraw(Customer customer) {
    return locker.withdraw(customer);
    }

    @Override
    public Customer getcustomerByAccountNumber(String accountNumber) {
        return locker.getcustomerByAccountNumber(accountNumber);
           }

    @Override
    public Map getAllCustomers() {
      return  locker.getAllCustomers();
       
        
      
    }
    
    
}
