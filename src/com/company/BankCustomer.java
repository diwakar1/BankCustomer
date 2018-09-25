package com.company;

import java.text.DecimalFormat;

public class BankCustomer {

    private  PersonalInfo info;
    private  BankAccount checking;
    private  BankAccount savings;

    public BankCustomer( PersonalInfo i, BankAccount c , BankAccount s)
    {
        info=i;
        checking=c;
        savings=s;
    }

    public String toString()
    {
        String str;
        DecimalFormat dollar = new DecimalFormat("#,##0.00");
        str=info+ "\nChecking Account Balance: $"
            + dollar.format(checking.getBalance())
            + "\n Savings Account Balance: $"
            + dollar.format(savings.getBalance()) ;
        return str;
    }
}
