package courses.oop;

import java.awt.*;

public class Car {
    private CardBrands brand;
    private Color color;
    private float speed;
    private float fuelLevel;
    private boolean engineOn;


    public Car(CardBrands brand, Color color, float fuelLevel) {
        this.brand = brand;
        this.color = color;
        this.fuelLevel = fuelLevel;
    }

    public void startEngine() {
        if (!isEngineOn())
            engineOn = true;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void setFuelLevel(float fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public CardBrands getBrand() {
        return brand;
    }

    public Color getColor() {
        return color;
    }

    public float getSpeed() {
        return speed;
    }

    public float getFuelLevel() {
        return fuelLevel;
    }

    public boolean isEngineOn() {
        return engineOn;
    }

    @Override
    public String toString() {
        return "Car{" +
                brand +
                ", color=" + color +
                ", fuelLevel=" + fuelLevel +
                '}';
    }
}
