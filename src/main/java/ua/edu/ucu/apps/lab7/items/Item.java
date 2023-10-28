package ua.edu.ucu.apps.lab7.items;

import lombok.Getter;

@Getter
public abstract class Item {
    private final String description;

    protected Item(String description) {
        this.description = description;
    }

    public abstract double price();

}
