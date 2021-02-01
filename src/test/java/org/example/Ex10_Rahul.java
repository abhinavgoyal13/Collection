package org.example;

import java.util.Scanner;

/*
Ask user to enter two number (int) a and b, return true if a:) either one is 6 b:) Or if their sum is 6 c:) or difference is 6.
Ex condition [a:] (6,10), (5,6), (9,6) - True
Ex condition [b:] (1,5), (3,3), (-4,10) - True
Ex condition [c:] (90,84), (18,12), (-14,20) - True
 */
public class Ex10_Rahul {
    public static void main(String[] args)
    {
        System.out.println("Enter a number");
Scanner si= new Scanner(System.in);
int x=si.nextInt();
        System.out.println( "Enter another number");
        Scanner si1= new Scanner(System.in);
        int y=si.nextInt();

        if((x==6) ||(y==6) ||(x+y==6) ||(x>y && x-y==6) ||(y>x && y-x==6))

        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

    }
}
