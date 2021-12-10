package com.company.Controller;
import com.company.View.justAView;
import com.company.Model.Operations;

public class Main
{
    public static void main(String[] args)
    {
        justAView.title();          //displays the app title

       int num1 = Operations.getNum1(),             //gets the first integer
               num2 = Operations.getNum2();         //gets the second integer

        justAView.userInputs(num1, num2);           //show the two integers

        int option = Operations.getChoice();        //select an operation to perform on the two operands

        if (option == 1)
        {
            justAView.sum(num1, num2);              //add the two
        }

        else if (option == 2)
        {
            justAView.subtraction(num1, num2);      //subtract the two
        }

        else if (option == 3)
        {
            justAView.product(num1, num2);          //multiply the two
        }

        else if (option == 4)
        {
            justAView.quotient(num1, num2);         //divide the two
        }

    }

}
