package com.dviruri;

public class Customer implements ICustomer{

    protected int Id;
    protected String Name;
    protected double discount;

    public Customer(int id,String name)
    {
        this.Id = id;
        this.Name = name;
        this.discount = 0;
    }

    @Override
    public String getCustomerName() {
        return Name;
    }

    @Override
    public double getPriceForProduct(double fullPrice) {
        return fullPrice - (fullPrice*discount);
    }
}
