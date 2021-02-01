package org.example;
/*
create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n}
Note that the length of the array will be n*(n + 1)/2.
Ex1: Array(2) → [1, 1, 2]
Ex2: Array(3) → [1, 1, 2, 1, 2, 3]
Ex3: Array(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
 */
public class Ex33_rahul {
    public static void main(String[] args)
    {
        int n=4,k=0;
        int[] arr= new int[n*(n+1)/2];
        for(int i=1;i<=n;i++)
        {
            for (int j = 1; j <=i; j++) {
               arr[k++]=j;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
