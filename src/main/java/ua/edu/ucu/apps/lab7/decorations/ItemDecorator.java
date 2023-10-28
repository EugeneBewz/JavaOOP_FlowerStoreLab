package ua.edu.ucu.apps.lab7.decorations;

import ua.edu.ucu.apps.lab7.items.Item;

public abstract class ItemDecorator extends Item {
    protected ItemDecorator(String description) {
        super(description);
    }

    public abstract String getDescription();
}
