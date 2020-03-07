package observer.classes;


import java.util.Random;

public class FakeDataSource {
    public static int getTemperature(){
        return getRandomNumberInRange(0, 35);
    }
    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
