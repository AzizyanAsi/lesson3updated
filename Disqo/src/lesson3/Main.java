package lesson3;

import lesson3.model.Car;
import lesson3.model.Engine;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(100, 25.5, 300_000);
        Car car = new Car(2000, "bmw", 2_0000_000, engine);
        System.out.println(car.getEngine().getHorsePower());
        engine.setHorsePower(90);
        engine.setWeight(3);
        System.out.println(car.getEngine().getHorsePower());
        System.out.println(car.getEngine().getWeight());

    }
}
