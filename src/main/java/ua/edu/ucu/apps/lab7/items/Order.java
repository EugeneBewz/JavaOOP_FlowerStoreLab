package ua.edu.ucu.apps.lab7.items;

import java.util.LinkedList;

import ua.edu.ucu.apps.lab7.delivery_strategies.Delivery;

import ua.edu.ucu.apps.lab7.payment_strategy.Payment;
import ua.edu.ucu.apps.lab7.payment_strategy.CreditCardPaymentStrategy;
import ua.edu.ucu.apps.lab7.payment_strategy.PayPalPaymentStrategy;

public class Order {
    private LinkedList<Item> items;
    private Payment payment;
    private Delivery delivery;

    public void setPaymentStrategy(Payment paymentStrategy) {
        this.payment = paymentStrategy;
    }

    public void setDeliveryStrategy(Delivery deliveryStrategy) {
        this.delivery = deliveryStrategy;
    }

    public double calculateTotalPrice() {
        if (this.payment instanceof PayPalPaymentStrategy) {
            // TODO
        } else if (this.payment instanceof CreditCardPaymentStrategy) {
            // TODO
        }
        return 0;
    }

    public void processOrder() {
        double price = calculateTotalPrice();
        System.out.println("You successfully paid $" + price);
        System.out.println("Your package is being delivered now");
        delivery.deliver(items);
    }

    public void addItem(Item item) {
        this.items.add(0, item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }
}