package courses.oop;

public class CardBrands {

    private float maxSpeed;
    private int maxGear;
    private String brand;
    private String model;
    private FuelType fuelType;

    public CardBrands() {
        maxGear = 6;
        maxSpeed = 200;
    }

    public CardBrands(float maxSpeed, int maxGear, String brand, String model, FuelType fuelType) {
        this.maxSpeed = maxSpeed;
        this.maxGear = maxGear;
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public int getMaxGear() {
        return maxGear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "CardBrand{" +
                "maxSpeed=" + maxSpeed +
                ", maxGear=" + maxGear +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fuelType=" + fuelType +
                '}';
    }
}
