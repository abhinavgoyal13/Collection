package org.example;

import java.util.Scanner;

//: Ask user to enter a number and then print the factorial of the input number. example if user input 5, then print "factorial of 5 is = 120" i.e.  5*4*3*2*1
public class Ex06 {
    public static void main(String[] args)
    {
        Scanner si= new Scanner(System.in);
        System.out.println("Enter number 1");
        int x=si.nextInt();
        Long fact=1L;
        for(int i=1 ; i<=x;i++)
        {
            fact = fact *i;
        }
        System.out.println("fact of x is" + fact);
    }
}
