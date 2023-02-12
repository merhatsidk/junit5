package org.example;

public class BankAccount {

    private int balance;
    private int minimumBalance;

    public BankAccount(int balance, int minimumBalance){
        this.balance = balance;
        this.minimumBalance = minimumBalance;
    }

    public int getBalance() {
        return balance;
    }


    public int getMinimumBalance() {
        return minimumBalance;
    }


    public int withDraw(int amount){
        if(balance - amount > minimumBalance){
            balance-= amount;
            return balance;
        }else{
            throw new RuntimeException();
        }
    }

    public int deposit(int amount){
        return this.balance += amount;
    }

}
