package org.example;
/*
Ask user to enter a positive integer and then display the Fibonacci series of numbers from 0 to user-specified number .
Ex1: Fib(5)  → [0, 1, 1, 2, 3, 5]
Ex2: Fib(13) → [0, 1, 1, 2, 3, 5, 8, 13]
Ex3: Fib(34) → [0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ]
 */
public class Ex35_rahul {
    public static void main(String[] args)
    {
       int n=5;
       int n1=0,n2=1,n3=0;
        System.out.println(n1 + " "+ n2);
        int i=2;
       while(n3<n)
       {
           n3=n1+n2;
           System.out.println(n3);
           n1=n2;
           n2=n3;

       }
    }
}
