package org.example;
/*
Given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's separated by one element.
Ex1: [1, 7, 7] → true
Ex1: [1, 7, 1, 7] → true
Ex1: [1, 7, 1, 1, 7] → false
Ex1: [7, 7, 1, 1, 7] → true
Ex1: [9, 0, 5, 1, 7] → false
Ex1: [7, 7, 7, 7, 7] → true
 */
public class Ex28_rahul {

    public static void main(String[] args)
    {
        int[] arr={9, 0, 5, 1, 7};

        for (int i = 0; i <=arr.length-2; i++) {
            if(((arr[i]==7) && (arr[i+1]==7)) || ((arr[i]==7) && (arr[i+2]==7)))
            {
                System.out.println("true");
                break;
            }
            else
            {
                System.out.println("false");

            }

        }
    }
}
