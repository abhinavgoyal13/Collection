package org.example;
/*
Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1.
The given n may be 0, in which case just return a length 0 array.
Ex1:(4) → [0, 1, 2, 3]
Ex2:(1) → [0]
Ex3:(10) → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
Ex4:(0) → [0]
 */
public class Ex21_rahul {
    public static void main(String[] args)
    {
        int n=4;
        int[] retar= arr(n);
        for (int i = 0; i < retar.length; i++) {
            System.out.println(retar[i]);
        }

    }

    public static int[] arr(int n)
    {
        int[] arr1= new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i]=i;

        }
        return arr1;
    }
}
