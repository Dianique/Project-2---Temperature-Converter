package com.teamtreehouse;

import java.util.Scanner; // java.util.Scanner allows you to see user input fed back to you one at a time.

public class Main {

    // package > class > method

    public static void main(String[] args) {
        Scanner userTemp = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Welcome to our unit converter! Enter the requested numerical values.");
        System.out.println("Enter a fahrenheit degree and a celsius degree like this ie., 30 and 49.");


        double user = userTemp.nextDouble();  // NextDouble is a method of the Scanner.
        double tempCel = (user - 32) * 5 / 9; // This line gives Celsius result.
        System.out.println("tempCel: " + tempCel);  // Output user input

        userTemp.next();
        double degreeCel = userTemp.nextDouble(); //NextDouble is a method of the Scanner.
        double tempFar = (degreeCel * 9 / 5) + 32; // This line gives Fahrenheit result.
        System.out.println("tempFar :" + tempFar); // Output user input


        Scanner userWeight = new Scanner(System.in);
        System.out.println("Then, enter a weight in pounds and a weight in kilograms.");

        double heavyLbs = userWeight.nextDouble();
        double weighKilograms = (heavyLbs / 2.2046);
        System.out.println("weighKilograms:" + weighKilograms);

        userWeight.next();
        double lessKg = userWeight.nextDouble();
        double weighPounds = (lessKg * 2.2046);
        System.out.println("weighPounds:" + weighPounds);

    }
}
