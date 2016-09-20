package com.example;

public class MyClass
{
    public static void main(String[] args)
    {
        int meters = 28;
        double feet = 0;
        int kilometers = 168;
        double miles = 0;
        int centimeters = 47;
        double inches = 0;
        int kph = 27;
        double fps = 0;
        int liters = 92;
        double gallons = 0;
        int kilograms = 200;
        double pounds = 0;

        System.out.println(meters + " meters is equal to " + (meters*3.28) + " feet");
        System.out.println(kilometers + " kilometers is equal to " + (kilometers*.621371) + " miles");
        System.out.println(centimeters + " centimeters is equal to " + (centimeters*.39) + " inches");
        System.out.println(kph + " kilometers per hour is equal to " + (kph/1.09728) + " feet per second");
        System.out.println(liters + "liters is equal to " + (liters*3.785411784) + " gallons");
        System.out.println(kilograms + " kilograms is equal to " + (kilograms*2.2046226218) + " Pounds");

    }
}
