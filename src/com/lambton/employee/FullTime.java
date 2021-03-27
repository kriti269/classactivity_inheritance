package com.lambton.employee;

import com.lambton.Gender;
import com.lambton.vehicle.Vehicle;

public class FullTime extends Faculty{
    private float bonus;

    public FullTime(int id, String firstName, String lastName, Gender gender, Vehicle vehicle, float totalSalary, String department, float bonus) {
        super(id, firstName, lastName, gender, vehicle, totalSalary, department);
        this.bonus = bonus;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }
}
