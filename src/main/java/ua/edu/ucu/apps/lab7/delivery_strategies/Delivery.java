package ua.edu.ucu.apps.lab7.delivery_strategies;

import java.util.List;
import ua.edu.ucu.apps.lab7.items.Item;

public interface Delivery {
    abstract void deliver(List<Item> items);
}
