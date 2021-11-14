package com.dviruri;

public class GoldCustomer extends Customer{

    public GoldCustomer(int id,String name) {
        super(id,name);
        discount = 0.2;
    }

}
