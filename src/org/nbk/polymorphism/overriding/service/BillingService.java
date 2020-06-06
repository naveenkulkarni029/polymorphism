package org.nbk.polymorphism.overriding.service;

import java.util.List;

import org.nbk.polymorphism.model.Customer;
import org.nbk.polymorphism.model.Item;

public class BillingService {

    public double calculateBill(Customer customer, int gst) {
	System.out.println("Int calculator");
	return calculate(customer, gst);
    }

    public double calculateBill(Customer customer, float gst) {
	System.out.println("float calculator");
	return calculate(customer, gst);
    }

    public double calculateBill(Customer customer, long gst) {
	System.out.println("long calculator");
	return calculate(customer, gst);
    }

    public double calculateBill(Customer customer, double gst) {
	System.out.println("double calculator");
	return calculate(customer, gst);
    }

    private double calculate(Customer customer, double gst) {
	double bill = 0;
	List<Item> items = customer.getItems();
	for (Item item : items) {
	    bill += (item.getPrice() * item.getQuantity());
	}

	bill = bill + (bill * gst) / 100;
	return bill;
    }

}
