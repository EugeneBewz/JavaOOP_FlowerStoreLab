package ua.edu.ucu.apps.lab7.items.flowers;

import java.util.ArrayList;
import java.util.List;

import ua.edu.ucu.apps.lab7.items.Item;

public class FlowerBucket extends Item {
    private List<FlowerPack> flowerPacks = new ArrayList<>();

    public FlowerBucket() {
        super(description);
    }

    @Override
    public double price() {
        int price = 0;
        for (FlowerPack flowerPack : flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }

    public void addFlowerPack(FlowerPack flowerPack) {
        this.flowerPacks.add(flowerPack);
    }
}
