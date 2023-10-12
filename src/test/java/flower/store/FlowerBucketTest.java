package flower.store;

import flowers_part1.Rose;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Random;

public class FlowerBucketTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;
    private static final int MAX_PRICE = 100;

    private FlowerBucket flowerBucket;

    @BeforeEach
    public void init() {
        flowerBucket = new FlowerBucket();
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        Flower flower = new Rose();

        // Msg to teacher: there is no way flower.setPrice(10) will be equal to price*quantity.
        // We have 1 flower package with `quantity` flowers priced 10 in it. So the total price of
        // the flower pack is 10*quantity. Initial price isn't the same as flower price, so
        // price * quantity is not the price of the flower pack, if we keep flower.setPrice(10).

        // Or I'm just dumb and couldn't catch the idea :D
        flower.setPrice(price);
        FlowerPack flowerPack = new FlowerPack(flower, quantity);
        flowerBucket.addFlowerPack(flowerPack);
        Assertions.assertEquals(price * quantity, flowerBucket.getPrice());
    }
}
