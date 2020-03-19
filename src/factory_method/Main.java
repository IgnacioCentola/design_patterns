package factory_method;

import factory_method.concrete_factory.TechProductFactory;
import factory_method.factory.IFactory;
import factory_method.product_interface.IProduct;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        IFactory techProductFactory = new TechProductFactory();
        IProduct techProduct = techProductFactory.getProduct(
                getRandomNumberInRange(1, 150),
                "ASUS 3500",
                getRandomNumberInRange(10000000, 99999999));

        System.out.println(techProduct);
    }

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
