package lesson3.model;

public final class Car {
    private final int productionYear;
    private final String model;
    private final int mark;
    private final Engine engine;

    public Car(int productionYear, String model, int mark, Engine engine) {
        this.productionYear = productionYear;
        this.model = model;
        this.mark = mark;
        this.engine = engine.copy();
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getModel() {
        return model;
    }

    public int getMark() {
        return mark;
    }

    public Engine getEngine() {
        return engine.copy();
    }

}
