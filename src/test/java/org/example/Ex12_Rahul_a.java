package org.example;

import java.util.Scanner;

/*
Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
Ex : ("WooHoo") → "Woo"
Ex : ("HelloThere") → "Hello"
Ex : ("abcdef") → "abc"
 */
public class Ex12_Rahul_a {
    public static void main(String[] args)
    {
        System.out.println("Enter even string");
        Scanner si = new Scanner(System.in);
        String s1= si.next();

        for(int i=0;i< s1.length()/2;i++)
        {
            System.out.print(s1.charAt(i));
        }
    }
}
