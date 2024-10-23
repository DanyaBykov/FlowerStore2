/**
 * PayPal payment strategy
 */
package ucu.edu.ua.flower.store.payment;

import java.util.List;

import ucu.edu.ua.flower.store.flowers.Item;

/**
 * PayPal payment strategy
 */
public class PayPalPaymentStrategy implements Payment {
    private String name;
    private String description;
    private boolean paid = false;

    public PayPalPaymentStrategy() {
        name = "PayPal";
        description = "PayPal payment";
    }

    @Override
    public boolean isPaid() {
        return paid;
    }

    @Override
    public double pay(final List<Item> items) {
        double price = 0;
        for (Item item: items) {
            price += item.getPrice();
        }
        System.out.println("Paid " + price + " with PayPal");
        paid = true;
        return price;
    }
}
