package org.nbk.polymorphism.orverloading.demo;

import java.util.ArrayList;
import java.util.List;

import org.nbk.polymorphism.model.Customer;
import org.nbk.polymorphism.model.Item;
import org.nbk.polymorphism.orverloading.service.BillingService;

public class ResturantExample {

    private Customer customer;
    private double gst;

    {

	Item item1 = new Item("Alu Biriyani", 2, 185);
	Item item2 = new Item("Paneer Biriyani", 1, 200);
	Item item3 = new Item("Chicken Biriyani", 2, 250);

	List<Item> items = new ArrayList<>();
	items.add(item1);
	items.add(item2);
	items.add(item3);

	this.customer = new Customer("1", "Naveen", "25");
	this.gst = 18;

	customer.setItems(items);
    }

    public void demoRun() {
	BillingService billingService = new BillingService();
	double bill = billingService.calculateBill(customer, gst);
	System.out.println("Total Bill amount with GST " + bill);
	customer.setBillAmount(bill);

	System.out.println(customer);
    }

}
