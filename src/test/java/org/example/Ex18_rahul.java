package org.example;
/*
For the given below strings, Return true if the string "cat" and "dog" appear the same number of times.
Ex1: ("catdog") → true
Ex2:("catcat") → false
Ex3:("1cat1cadodog") → true
Ex4:("catnotdog") → true
 */
public class Ex18_rahul {
    public static void main(String[] args)
    {
        String str="catcat";
        String[] s1= str.split("cat",-1);
        String[] s2= str.split("dog",-1);

        int n1= s1.length-1;
        int n2= s2.length-1;

        if(n1==n2)
        {
            System.out.println("true");;

        }
        else
        {
            System.out.println("false");
        }

    }
}
