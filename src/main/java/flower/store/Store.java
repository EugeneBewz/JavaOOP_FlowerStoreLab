package flower.store;

import java.util.ArrayList;
import java.util.List;

import flower.store.filters.MaxPrice;
import flower.store.filters.SearchFilter;
import flowers_part1.Rose;

public class Store {
    private List<Item> items = new ArrayList<>();

    public List<Item> search(SearchFilter filter) {
        List<Item> foundItems = new ArrayList<>();
        for (Item item : this.items) {
            if (filter.match(item)) {
                foundItems.add(item);
            }
        }
        return foundItems;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public static void main(String[] args) {
        Store store = new Store();

        FlowerBucket flowerBucket = new FlowerBucket();
        Flower flower = new Rose();
        flower.setPrice(15);
        FlowerPack flowerPack = new FlowerPack(flower, 10);
        flowerBucket.addFlowerPack(flowerPack);

        FlowerBucket flowerBucket_2 = new FlowerBucket();
        Flower flower_2 = new Flower();
        flower_2.setPrice(30);
        FlowerPack flowerPack_2 = new FlowerPack(flower_2, 15);
        flowerBucket_2.addFlowerPack(flowerPack_2);

        store.addItem(flowerBucket);
        store.addItem(flowerBucket_2);

        SearchFilter filter = new MaxPrice(450);
        System.out.println(store.search(filter));
    }
}
