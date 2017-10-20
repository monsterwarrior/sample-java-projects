/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bank.acitivites;

import com.bank.model.Customer;
import java.util.Map;

/**
 *
 * @author suraj ganti
 */
public abstract class BankService {
    
    public void bankDetails(){
        System.out.println("@@@@@@@@@@@@@@@@/////////////////@@@@@@@@@@@@@@@");
         System.out.println("Branch: Kadapa, Badvel, Pincode:6575634. Near to Busstand");
          System.out.println("MainBRanch: Hyd");
           System.out.println("State Bank OF India..(SBI)");
            System.out.println("@@@@@@@@@@@@@@@@/////////////////@@@@@@@@@@@@@@@");
    }
    
    
  public abstract String createAccount(Customer customer);
  public abstract Customer deposit(Customer customer);
  public abstract Customer withdraw(Customer customer);
  public abstract Customer getcustomerByAccountNumber(String accountNumber);
  public abstract Map getAllCustomers();
  
}
