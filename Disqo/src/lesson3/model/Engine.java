package lesson3.model;

public class Engine {
    private int horsePower;
    private double weight;
    private int mileage;

    public Engine() {

    }

    public Engine(int horsePower, double weight, int mileage) {
        this.horsePower = horsePower;
        this.weight = weight;
        this.mileage = mileage;
    }

    public Engine copy(Engine engine) {
        Engine cloneEngine = new Engine();
        cloneEngine.setHorsePower(engine.getHorsePower());
        cloneEngine.setMileage(engine.getMileage());
        cloneEngine.setWeight(engine.getWeight());
        return cloneEngine;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
