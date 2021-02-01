package org.example;

import java.util.ArrayList;

/*
Given a non-empty string and an int n, return a new string where the char at index n has been removed.
Note : The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).

Ex : Input ("TESTER", 0) → Output "ESTER"
Ex : Input ("TESTER", 2) → "TETER"
Ex : Input ("TESTER", 5) → "TESTE"
 */
public class Ex11_Rahul {
    public static void main(String[] args)
    {
        String str="Tester";
        int x=5;

        ArrayList<Character> as = new ArrayList<Character>();
        for(char ch: str.toCharArray())
        {
            as.add(ch);
        }

        as.remove(x);
        StringBuilder sb = new StringBuilder();
        for(char ch:as)
        {
            sb.append(ch);

        }
      String s1=sb.toString();
        System.out.println(s1);

    }
}
