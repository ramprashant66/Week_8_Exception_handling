package com.company.Model;

import com.company.View.justAView;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Operations
{
    public static int getNum1()
    {
        justAView.firstInt();                           //show prompt to enter the first integer
        Scanner input = new Scanner(System.in);         //take the input
        int number1;                                    //store input in this

        try
        {
            number1 = input.nextInt();                  //input validate
        }
        catch (InputMismatchException error)            //if the user entered something other than an integer
        {
           justAView.onlyInts();                        //show the error message
            number1 = getNum1();                        //recursively let them enter again
        }
        return number1;                                 //return the input
    }

    public static int getNum2()
    {
        justAView.secondInt();                          //show prompt to enter the second integer
        Scanner input = new Scanner(System.in);
        int number2;                                    //store input in this

        try
        {
            number2 = input.nextInt();               //input validate
        }
        catch (InputMismatchException error)        //if the user entered something other than an integer
        {
            justAView.onlyInts();                   //show the error message
            number2 = getNum2();                    //recursively let them enter again
        }
        return number2;                             //return the input
    }

    public static int getChoice()
    {
        justAView.choices();                        //display the operation choices
        Scanner input = new Scanner(System.in);
        int choice;                                 //store the choice in this

        try
        {
            choice = input.nextInt();               //get the choice
            while (choice < 1 || choice > 4)        //choice needs to be greater than 0 and less than 5
            {
                justAView.error();                  //if not, show the error message
                choice = input.nextInt();           //get the choice again
            }
        }
        catch (InputMismatchException error)        //catch anything other than an integer
        {
            justAView.error();                      //display the error message
            choice = getChoice();                   //recursively let them enter again
        }
        return choice;                              //return the input
    }

}
