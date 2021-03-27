package com.lambton.employee;

import com.lambton.Gender;
import com.lambton.vehicle.Vehicle;

public class Faculty extends Employee{
    protected String department;

    public Faculty(int id, String firstName, String lastName, Gender gender, Vehicle vehicle, float totalSalary, String department) {
        super(id, firstName, lastName, gender, vehicle, totalSalary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
