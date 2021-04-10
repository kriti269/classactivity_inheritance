package com.lambton;

import com.lambton.base.Person;
import com.lambton.exception.InvalidFirstName;
import com.lambton.exception.InvalidSalaryException;
import com.lambton.student.FullTime;
import com.lambton.student.PartTime;
import com.lambton.utils.Color;
import com.lambton.utils.Gender;
import com.lambton.vehicle.Car;
import com.lambton.vehicle.MotorCycle;
import com.lambton.vehicle.Vehicle;

public class CollegeSystem {
    public static void main(String[] args){
        Vehicle car = new Car("1", "Volkswagen Polo", true, Color.WHITE);
        try{
            Person fullTimeStudent = new FullTime(123, "Kriti","Kriti",
                    Gender.FEMALE, car, "Lambton College",
                    "CSAT", "A+",98);
            fullTimeStudent.display();
        }
        catch (InvalidFirstName ex){
            System.out.println(ex.getMessage());
        }


        Vehicle bike = new MotorCycle("10", "Royal Enfield", true, 2);
        try{
            Person partTimeStudent = new PartTime(245, "John","Doe",
                    Gender.MALE, bike, "Conestoga College",
                    "CSAT", "A",45);
            partTimeStudent.display();
        }
        catch (InvalidFirstName ex){
            System.out.println(ex.getMessage());
        }


        try{
            com.lambton.employee.FullTime fullTimeEmp = new com.lambton.employee.FullTime(123, "Pritesh", "Patel", Gender.MALE,
                    car, 120, "CSAT", 10);
        }
        catch (InvalidSalaryException ex){
            System.out.println(ex.getMessage());
        }
        catch (InvalidFirstName ex){
            System.out.println(ex.getMessage());
        }


    }
}
