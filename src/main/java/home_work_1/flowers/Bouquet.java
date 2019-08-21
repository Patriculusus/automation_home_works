package home_work_1.flowers;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    public static void main(String[] args) {
        List<Flower> bouquet = new ArrayList<>();
        int bouquetPrice = 0;

        bouquet.add(new Rose());
        bouquet.add(new Rose());
        bouquet.add(new Clove());
        bouquet.add(new Tulip());
        bouquet.add(new Tulip());
        bouquet.add(new Narcissus());
        bouquet.add(new Narcissus());

        for(Flower f:bouquet){
            bouquetPrice += f.getPrice();
        }

        System.out.println("bouquet price is " + bouquetPrice);
    }
}
