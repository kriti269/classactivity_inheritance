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

import java.util.ArrayList;

public class CollegeSystem {
    public static void main(String[] args){
        ArrayList<Person> personArrayList = new ArrayList<>();
        Person fullTimeStudent, partTimeStudent, fullTimeEmp, partTimeEmp;

        Vehicle car = new Car("1", "Volkswagen Polo", true, Color.WHITE);
        Vehicle bike = new MotorCycle("10", "Royal Enfield", true, 2);

        try{
            fullTimeStudent = new FullTime(123, "Kriti","Kriti",
                    Gender.FEMALE, car, "Lambton College",
                    "CSAT", "A+",98);
            personArrayList.add(fullTimeStudent);
        }
        catch (InvalidFirstName ex){
            System.out.println(ex.getMessage());
        }



        try{
            partTimeStudent = new PartTime(245, "John","Doe",
                    Gender.MALE, bike, "Conestoga College",
                    "CSAT", "A",45);
            personArrayList.add(partTimeStudent);
        }
        catch (InvalidFirstName ex){
            System.out.println(ex.getMessage());
        }


        try{
            fullTimeEmp = new com.lambton.employee.FullTime(123, "Pritesh", "Patel", Gender.MALE,
                    car, 1200, "CSAT", 10);
            personArrayList.add(fullTimeEmp);
        }
        catch (InvalidSalaryException ex){
            System.out.println(ex.getMessage());
        }
        catch (InvalidFirstName ex){
            System.out.println(ex.getMessage());
        }

        try{
            partTimeEmp = new com.lambton.employee.PartTime(123, "Javeria", "Aamir", Gender.FEMALE,
                    car, 1020, "CSAT", 10, 20);
            personArrayList.add(partTimeEmp);
        }
        catch (InvalidSalaryException ex){
            System.out.println(ex.getMessage());
        }
        catch (InvalidFirstName ex){
            System.out.println(ex.getMessage());
        }

        for(Person person: personArrayList){
            if(person instanceof FullTime){
                System.out.println("---------------- Full Time Student ------------------");
            }
            else if(person instanceof PartTime){
                System.out.println("---------------- Part Time Student ------------------");
            }
            else if(person instanceof com.lambton.employee.FullTime){
                System.out.println("---------------- Full Time Employee ------------------");
            }
            else if(person instanceof com.lambton.employee.PartTime){
                System.out.println("---------------- Part Time Employee ------------------");
            }
            person.display();
            System.out.println("---------------- --------------------- ------------------");
        }

    }
}
