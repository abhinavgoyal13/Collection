package org.example;
//2: Generate a random number between 1 and 9 (including 1 and 9). Ask the user to guess the number, then tell them whether they guessed too low, too high, or exactly right
//Exp: If random no is 6 and user input 5 (print "Low"), if user enter 8 (print High), if user input 6 then print ('Right Guess').

import java.util.Random;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args)
    {
        int guessNum= (int) (Math.random() *9 +10);
        System.out.println(guessNum);

        Scanner si = new Scanner(System.in);
        int x= si.nextInt();

        if(x>guessNum)
        {
            System.out.println("High");
        }
        else if(x==guessNum)
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Low");
        }
    }
}
