package com.lambton.vehicle;

import com.lambton.Color;

public class Car extends Vehicle{
    private Color color;

    public Car(String vehicleId, String brand, boolean isInsured, Color color) {
        super(vehicleId, brand, isInsured);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
