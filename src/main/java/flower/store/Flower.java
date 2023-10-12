package flower.store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter @AllArgsConstructor @ToString @NoArgsConstructor
public class Flower {
    private FlowerType flowerType;
    private double price;
    public double sepalLength;
    private String color;

    public Flower(Flower flower) {
        /*
         * Copy constructor for Flower()
         */
        this.flowerType = flower.flowerType;
        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
        this.color = flower.color;
    }

    public void setPrice(int price) {
        this.price = Math.max(0, price);  // avoid setting negative price
    }

    public void setColor(FlowerColor color) {
        this.color = color.toString();
    }
}
