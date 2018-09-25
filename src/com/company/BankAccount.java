package com.company;

/**
 * Created by diwakarsharma on 9/24/18.
 */
public class BankAccount
{
    private  double balance;
    private double interestRate;
    private double interest;

     public BankAccount( double startBalance, double intRate)
     {
        balance=startBalance;
        interestRate= intRate;
        interest=0.0;
     }
     public void deposit(double amount)
     {
         balance += amount;
     }
     public void withdraw(double amount)
     {
         balance -= amount;
     }
     public void addInterest()
     {
         interest = interestRate*balance;
         balance += interest;
     }
     public  double getBalance()
     {
         return  balance;
     }
     public double getInterestRate()
     {
         return interest;
     }


}
