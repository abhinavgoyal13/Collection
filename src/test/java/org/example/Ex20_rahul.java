package org.example;
/*
Return the sum of the numbers in the array,
a: Return 0 for an empty array.
b: Number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.
Ex1: [1, 2, 2, 1] → 6
Ex2: [1, 1] → 2
Ex3: [1, 2, 2, 1, 13] → 6
Ex4: [1, 5, 13, 5] → 6
Ex5: [1, 5, 13, 13, 5] → 6
Ex6: [13, 2, 5, 8, 13, 4] → 13
Ex7: [1,2,2,1,13,13,5] → 6
 */
public class Ex20_rahul {

    public static void main(String[] args)
    {

        int[] arr ={1, 5, 13, 5};
        int sum=0;

        if(arr.length>0)
        {
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] !=13) {
                    sum = sum + arr[i];
                }
                else
                {
                    break;
                }
            }
        }
        else if(arr.length==0)
        {
            sum =0;
        }

        System.out.println(sum);
    }
}
