package org.nbk.polymorphism.orverloading.service;

import java.util.List;

import org.nbk.polymorphism.overloading.model.Customer;
import org.nbk.polymorphism.overloading.model.Item;

public class BillingService {

    public int calculateBill(Customer customer, int gst) {
	System.out.println("Int calculator");
	return (int) calculate(customer, gst);
    }

    public float calculateBill(Customer customer, float gst) {
	System.out.println("float calculator");
	return (float) calculate(customer, gst);
    }

    public long calculateBill(Customer customer, long gst) {
	System.out.println("long calculator");
	return (long) calculate(customer, gst);
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
