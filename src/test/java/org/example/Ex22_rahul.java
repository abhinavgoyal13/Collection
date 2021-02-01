package org.example;
/*
Given an array of integers, return true if the array contains either 3 even or 3 odd values.
The odd or even values must be occurring in a sequence i.e. next to each other.
Ex1:[2, 1, 3, 5] → true
Ex2:[2, 4, 2, 5] → true
Ex3:[5, 7, 9, 1] → true
Ex4:[2, 4, 2, 2] → true
Ex5:[1, 4, 2, 3] → false
Ex6:[2, 1, 2, 5] → false
Ex7:[2, 1, 3, 4, 1, 7, 6] → false
Ex8:[2, 1, 3, 4, 2, 6, 9] → true
 */
public class Ex22_rahul {
    public static void main(String[] args)
    {
        int[] arr= {2, 1, 3, 4, 1, 7, 6};
        int flag=0;
        for (int i = 0; i < arr.length; i++) {

            if((arr.length>i+3) && ((((arr[i]%2==0) && (arr[i+1]%2==0) && (arr[i+2]%2==0)) || ((arr[i]%2!=0) && (arr[i+1]%2!=0) && (arr[i+2]%2!=0)))))
            {
                System.out.println("true");
                flag=1;
                break;
            }



        }
        if(flag==0)
        {
            System.out.println("false");
        }
    }
}
