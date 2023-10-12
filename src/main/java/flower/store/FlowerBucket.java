package flower.store;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item {
    private List<FlowerPack> flowerPacks = new ArrayList<>();

    public double getPrice() {
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
