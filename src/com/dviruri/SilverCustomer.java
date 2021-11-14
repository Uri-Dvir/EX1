package com.dviruri;

public class SilverCustomer extends Customer{

    public SilverCustomer(int id,String name)
    {
        super(id,name);
        discount = 0.15;
    }


    @Override
    public double getPriceForProduct(double fullPrice) {
        if (fullPrice > 500)
        {
            return super.getPriceForProduct(fullPrice);
        }
        else
        {
            return fullPrice;
        }
    }
}
