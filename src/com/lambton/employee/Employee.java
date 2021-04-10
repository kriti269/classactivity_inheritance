package com.lambton.employee;

import com.lambton.exception.InvalidFirstName;
import com.lambton.exception.InvalidSalaryException;
import com.lambton.utils.Gender;
import com.lambton.base.Person;
import com.lambton.vehicle.Vehicle;

public abstract class Employee extends Person {
    protected float baseSalary;

    public Employee(int id, String firstName, String lastName, Gender gender, Vehicle vehicle, float baseSalary) throws InvalidSalaryException, InvalidFirstName {
        super(id, firstName, lastName, gender, vehicle);
        if(InvalidSalaryException.validateSalary(baseSalary)){
            this.baseSalary = baseSalary;
        }
        else{
            throw new InvalidSalaryException("Invalid Salary:" + baseSalary);
        }
    }

    public float getTotalSalary() {
        return baseSalary;
    }

    public void setTotalSalary(float baseSalary) throws InvalidSalaryException{
        if(InvalidSalaryException.validateSalary(baseSalary)){
            this.baseSalary = baseSalary;
        }
        else{
            throw new InvalidSalaryException("Invalid Salary:" + baseSalary);
        }
    }

    public abstract double calculateTotalSalary();
}
