package ua.edu.ucu.apps.lab7.decorations;

import ua.edu.ucu.apps.lab7.items.Item;

public class RibbonDecorator extends ItemDecorator {
    private final Item item;

    protected RibbonDecorator(String description, Item item) {
        super(description);
        this.item = item;
    }

    public double getPrice() {
        return 13 + item.price();
    }

    public String getDescription() {
        return item.getDescription();
    }

    @Override
    public double price() {
        return 40 + item.price();
    }
}
