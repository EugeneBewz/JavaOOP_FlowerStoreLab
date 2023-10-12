package flower.store.filters;

import flower.store.Item;

public class MaxPrice implements SearchFilter{
    private int price;

    public MaxPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean match(Item item) {
        return item.getPrice() <= this.price;
    }

}
