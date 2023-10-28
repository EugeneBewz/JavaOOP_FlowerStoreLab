package ua.edu.ucu.apps.lab7.delivery_strategies;

import java.util.List;

import ua.edu.ucu.apps.lab7.items.Item;

public class DHLDeliveryStrategy implements Delivery {
    private final String address;

    public DHLDeliveryStrategy(String address) {
        this.address = address;
    }

    @Override
    public void deliver(List<Item> items) {
        System.out.println("Your order is being delivered via DHL.");
        System.out.println("Destination: " + address);
        System.out.println("Your order: " + items.toString());
    }
}
