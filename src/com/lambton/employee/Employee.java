package com.lambton.employee;

import com.lambton.Gender;
import com.lambton.Person;
import com.lambton.vehicle.Vehicle;

public class Employee extends Person {
    protected float totalSalary;

    public Employee(int id, String firstName, String lastName, Gender gender, Vehicle vehicle, float totalSalary) {
        super(id, firstName, lastName, gender, vehicle);
        this.totalSalary = totalSalary;
    }

    public float getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(float totalSalary) {
        this.totalSalary = totalSalary;
    }
}
