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
public class Transactions {
    private double minimumBalance;
    private double depoistAmount;
    private double withdrawAmount;
    private double totalBalance;

    public Transactions() {
    }

    
    
    public Transactions(double minimumBalance, double depoistAmount, double withdrawAmount, double totalBalance) {
        this.minimumBalance = minimumBalance;
        this.depoistAmount = depoistAmount;
        this.withdrawAmount = withdrawAmount;
        this.totalBalance = totalBalance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public double getDepoistAmount() {
        return depoistAmount;
    }

    public void setDepoistAmount(double depoistAmount) {
        this.depoistAmount = depoistAmount;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    @Override
    public String toString() {
        return "Transactions{" + "minimumBalance=" + minimumBalance + ", depoistAmount=" + depoistAmount + ", withdrawAmount=" + withdrawAmount + ", totalBalance=" + totalBalance + '}';
    }
    
    
}
