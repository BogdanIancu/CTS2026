package ro.ase.acs.classes;

import ro.ase.acs.interfaces.Taxable;

public final class Car extends Vehicle implements Taxable {
    private String producer;
    private int productionYear;
    private EngineType engineType;
    private final static float VAT_VALUE = 0.21f;
    private final static float TAX_VALUE=0.05f;

    public Car() {
        this(2000, "", 0);
    }

    public Car(int productionYear, String producer, float price) {
        super(null, price);
        this.productionYear = productionYear;
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public float computeTax() {
        return getPrice() * TAX_VALUE;
    }

    @Override
    public final float computeFinalPrice() {
        return getPrice() * (1 + VAT_VALUE);
    }
}
