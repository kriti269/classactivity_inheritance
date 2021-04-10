package com.lambton.exception;

public class InvalidFirstName extends Exception{
    public InvalidFirstName(String message){
        super(message);
    }

    public static boolean validateFirstName(String name){
        if(name.length()<2){
            return false;
        }
        else{
            return true;
        }
    }
}
