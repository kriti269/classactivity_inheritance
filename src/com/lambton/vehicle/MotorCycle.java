package com.lambton.vehicle;

public class MotorCycle extends Vehicle{
    private int noOfSeats;

    public MotorCycle(String vehicleId, String brand, boolean isInsured, int noOfSeats) {
        super(vehicleId, brand, isInsured);
        this.noOfSeats = noOfSeats;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }
}
