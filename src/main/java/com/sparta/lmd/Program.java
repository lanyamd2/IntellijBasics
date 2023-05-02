package com.sparta.lmd;

public class Program {

    //principles that makes a good code: readability, maintainability, testability
    public static void main(String[] args) {
        int timeOfDay = 21;
       // String greeting = getGreeting(timeOfDay); //refactor -> introduce variable (ctrl+alt+v)
        System.out.println(getGreeting(timeOfDay));
    }

    private static String getGreeting(int timeOfDay) {
        String greeting="";
        if (timeOfDay >= 5 && timeOfDay <= 12) {
           greeting= "Good morning!";
        } else if (timeOfDay >= 12 && timeOfDay <= 18) {
            greeting= "Good afternoon!";
        } else {
            greeting= "Good evening!";
        }
        return greeting;
    }
}
