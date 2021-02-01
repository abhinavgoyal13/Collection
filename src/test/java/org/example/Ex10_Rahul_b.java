package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
Given two strings,
a: First string has a fixed length of 4, such as "[[]]"
b: Second string is a word and can be of any length, such as "Yay", OR "WooHoo"  OR "Word"
Write a program to return a new string where the second string is in the middle of the first string.
Ex1: ("<<>>", "Yay") → "<<Yay>>"
Ex2: ("<<>>", "WooHoo") → "<<WooHoo>>"
Ex3: ("[[]]", "word") → "[[word]]"
 */
public class Ex10_Rahul_b {
    public static void main(String[] args)
    {
      String s1="[[]]";
        Scanner si = new Scanner(System.in);
        System.out.println("Enetr a string");
        String s2= si.next();

        System.out.println(s1.substring(0,2)+ s2+ s1.substring(2,4));
    }
}
