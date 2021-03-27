package com.lambton.employee;

import com.lambton.Gender;
import com.lambton.vehicle.Vehicle;

public class PartTime extends Faculty{
    private float noOfHoursWorked;
    private float payPerHour;

    public PartTime(int id, String firstName, String lastName, Gender gender, Vehicle vehicle, float totalSalary, String department, float noOfHoursWorked, float payPerHour) {
        super(id, firstName, lastName, gender, vehicle, totalSalary, department);
        this.noOfHoursWorked = noOfHoursWorked;
        this.payPerHour = payPerHour;
    }

    public float getNoOfHoursWorked() {
        return noOfHoursWorked;
    }

    public void setNoOfHoursWorked(float noOfHoursWorked) {
        this.noOfHoursWorked = noOfHoursWorked;
    }

    public float getPayPerHour() {
        return payPerHour;
    }

    public void setPayPerHour(float payPerHour) {
        this.payPerHour = payPerHour;
    }
}
