package com.company;

/**
 * Created by diwakarsharma on 9/24/18.
 */
public class PersonalInfo
{
    private String customerName,
               customerAsddress,
               customerCity,
               customerState,
               customerZip;


    public PersonalInfo(String customerName, String customerAsddress, String customerCity, String customerState, String customerZip) {
        this.customerName = customerName;
        this.customerAsddress = customerAsddress;
        this.customerCity = customerCity;
        this.customerState = customerState;
        this.customerZip = customerZip;
    }

    @Override
    public String toString() {
        String str;
        str= "Name: " + customerName+
                " \ncustomerAddress:" + customerAsddress +
                 " \ncustomerCity: " + customerCity +
                " customerState: " + customerState +
                " customerZip: " + customerZip;
             return str;
    }
}
