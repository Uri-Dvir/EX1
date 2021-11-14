package com.dviruri;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<ICustomer> customers = new ArrayList<ICustomer>();
        customers.add(new Customer(1,"John Doe 1"));
        customers.add(new SilverCustomer(2,"John Doe 2"));
        customers.add(new Customer(3,"John Doe 3"));
        customers.add(new GoldCustomer(4,"John Doe 4"));
        customers.add(new SilverCustomer(5,"John Doe 5"));
        customers.add(new Customer(6,"John Doe 6"));
        customers.add(new Customer(7,"John Doe 7"));
        customers.add(new SilverCustomer(8,"John Doe 8"));
        customers.add(new Customer(9,"John Doe 9"));
        customers.add(new GoldCustomer(10,"John Doe 10"));

        for (ICustomer customer : customers ) {

            System.out.println("For 300 product, " + customer.getCustomerName() + " Pays " + customer.getPriceForProduct(300));
            System.out.println("For 3800 product, " + customer.getCustomerName() + " Pays " + customer.getPriceForProduct(3800));
        }
    }
}
