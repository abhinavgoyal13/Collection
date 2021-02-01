package org.example;
/*
Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.
Ex1: [10, 3, 5, 6] → 7
Ex2: [7, 2, 10, 9] → 8
Ex3: [2, 10, 7, 2] → 8
 */
public class Ex25_Rahul {
    public static void main(String[] args)
    {
            int[] arr = {1,2,3,4,5,6,7,8,9,10};
int max=arr[0];
int min =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]> max)
            {
                max= arr[i];
            }
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        System.out.println(max-min);
    }
}
