package ua.edu.ucu.apps.lab7.decorations;

import ua.edu.ucu.apps.lab7.items.Item;

public class PaperDecorator extends ItemDecorator {
    private Item item;

    public double getPrice() {
        return 13 + item.price();
    }

    public String getDescription() {
        return item.getDescription();
    };

    @Override
    public double price() {
        return 13 + item.price();
    }
}
