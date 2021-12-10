package com.company.View;

public class justAView
{
    public static void title()
    {
        System.out.println("Welcome to CISP 401 Simple Calculator");
    }

    public static void userInputs(int numA, int numB)
    {
        System.out.println("You input " + numA  + " and "+ numB + ".");
    }

    public static void firstInt()
    {
        System.out.println("Please enter the first integer:");
    }

    public static void secondInt()
    {
        System.out.println("Please enter second integer:");
    }

    public static void choices()
    {
        System.out.println("What do you want to do with those numbers? Enter 1=+, 2=-, 3=*, 4=/:");
    }

    public static void onlyInts()
    {
        System.out.println("!!! Enter only integers !!!");
    }

    public static void error()
    {
        System.out.println("!!! Enter only the characters displayed !!!");
    }

    public static void sum(int numA, int numB)
    {
        System.out.println("The sum of: " + numA + " and " + numB + " = " + (numA + numB));
    }

    public static void subtraction(int numA, int numB)
    {
        System.out.println("The subtraction of: " + numA + " from " + numB + " = " + (numA - numB));
    }

    public static void product(int numA, int numB)
    {
        System.out.println("The product of: " + numA + " and " + numB + " = " + (numA * numB));
    }

    public static void quotient(int numA, int numB)
    {
        if (numB != 0)
        {
            System.out.println("The quotient of: " + numA + " and " + numB + " = " + (numA / numB));
        }

        else
        {
            System.out.println("Error! Cannot divide by zero!");
        }
    }

}
