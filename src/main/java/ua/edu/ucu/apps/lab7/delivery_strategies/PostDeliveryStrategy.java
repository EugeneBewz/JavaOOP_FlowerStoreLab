package ua.edu.ucu.apps.lab7.delivery_strategies;

import java.util.List;

import ua.edu.ucu.apps.lab7.items.Item;

public class PostDeliveryStrategy implements Delivery{
    private String address;
    private String postOfficeNo;

    @Override
    public void deliver(List<Item> items) {
        System.out.println("Your order is being delivered via DHL");
        System.out.println("Destination: " + address);
        System.out.println("Your package will be delivered to post office №" + postOfficeNo);
        System.out.println("Your order: " + items.toString());
    }
}