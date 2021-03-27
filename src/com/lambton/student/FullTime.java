package com.lambton.student;

import com.lambton.Gender;
import com.lambton.vehicle.Vehicle;

public class FullTime extends Student{
    private float attendance;

    public FullTime(int id, String firstName, String lastName, Gender gender, Vehicle vehicle, String collegeName, String courseName, String result, float attendance) {
        super(id, firstName, lastName, gender, vehicle, collegeName, courseName, result);
        this.attendance = attendance;
    }

    public float getAttendance() {
        return attendance;
    }

    public void setAttendance(float attendance) {
        this.attendance = attendance;
    }
}
