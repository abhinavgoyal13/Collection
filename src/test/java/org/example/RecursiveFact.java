package org.example;

public class RecursiveFact {

    public static long recursiveFact(int n)
    {
        if(n <=1)
            return 1;
        else
        {
            return (n *(recursiveFact(n-1)));
        }
    }
    public static void main(String[] args)
    {
        System.out.println(recursiveFact(5));
    }
}
