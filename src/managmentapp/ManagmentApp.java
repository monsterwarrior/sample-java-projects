/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managmentapp;

import com.bank.acitivites.BankService;
import com.bank.acitivites.BankServiceImpl;
import com.bank.model.Account;
import com.bank.model.Address;
import com.bank.model.Customer;
import com.bank.model.Transactions;

/**
 *
 * @author suraj ganti
 */
public class ManagmentApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BankService service = new BankServiceImpl();
        Address address=new Address();
        Transactions transaction = new Transactions();
        Account account =new Account();
        
        Customer customer = new Customer();
        customer.setID("a412");
        customer.setName("abcc");
        customer.setSurName("bbbbb");
        
        address.setCity("Bangalore");
        address.setState("K");
        address.setContact("1234567890");
        address.setPincode("560037");
        
        account.setAccountNumber("30452789");
        account.setDateOfAccountCreation("23032017");
        account.setIfscode("SBIN003");
        
        transaction.setMinimumBalance(500.00);
//       transaction. = transaction.getMinimumBalance();
        transaction.setTotalBalance(transaction.getMinimumBalance());
        
        customer.setAddress(address);
        customer.setAccount(account);
        customer.setTransaction(transaction);
        
        System.out.println("Account has been created on this name:" +service.createAccount(customer));
        System.out.println("Account details on particular AccountHolder" + service.getcustomerByAccountNumber(customer.getAccount().getAccountNumber()));
        
        
        System.out.println("/////////////////////////");
                
        transaction.setDepoistAmount(1000000.00);
        transaction.setTotalBalance(transaction.getDepoistAmount()+transaction.getMinimumBalance());
        customer.setTransaction(transaction);
        Customer depositAmount = service.deposit(customer);
        
        System.out.println(+depositAmount.getTransaction().getTotalBalance()+" Rs..AMount Has been Credited to this account:" +depositAmount.getAccount().getAccountNumber());
        System.out.println("Deatsils ");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$");
        
        System.out.println("All Acustomers"+service.getAllCustomers());
        
        
    }
    
}
