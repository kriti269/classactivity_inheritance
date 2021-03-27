package com.lambton.student;

import com.lambton.Gender;
import com.lambton.vehicle.Vehicle;

public class PartTime extends Student{
    int noWeeklyClasses;

    public PartTime(int id, String firstName, String lastName, Gender gender, Vehicle vehicle, String collegeName, String courseName, String result, int noWeeklyClasses) {
        super(id, firstName, lastName, gender, vehicle, collegeName, courseName, result);
        this.noWeeklyClasses = noWeeklyClasses;
    }

    public int getNoWeeklyClasses() {
        return noWeeklyClasses;
    }

    public void setNoWeeklyClasses(int noWeeklyClasses) {
        this.noWeeklyClasses = noWeeklyClasses;
    }
}
