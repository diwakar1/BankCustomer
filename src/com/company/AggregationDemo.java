package com.company;

/**
 * Created by diwakarsharma on 9/24/18.
 */
public class AggregationDemo
{
    public static void main(String[] args) {
        PersonalInfo info= new PersonalInfo("Diwakar Sharma", "4 East Bend Court",
                                             "WindsorMill","MD","21244");
        BankAccount checking = new BankAccount(600, 0.25);
        BankAccount saving = new BankAccount(3000,.35);

        BankCustomer customer= new BankCustomer(info,checking,saving);
        System.out.println(customer);
    }
}
