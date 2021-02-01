package org.example;
/*
Given a string, compute a new string by moving the first char to come after the next two chars.
Repeat this process for each subsequent group of 3 chars.Ignore any group of fewer than 3 chars at the end.
Ex1: ("abc") → "bca"
Ex2: ("tca") → "cat"
Ex3: ("tcagdo") → "catdog"
Ex3: ("abcdef") → "bcaefd"
 */
public class Ex19_raahul {
    public static void main(String[] args)
    {
        String s1="abcdef";

        char[] ch= s1.toCharArray();


        for(int i=0;i<=ch.length-1;i=i+3)
        {

            char ch1= s1.charAt(i);
            char ch2= s1.charAt(i+1);
            char ch3= s1.charAt(i+2);

            ch[i+2]=ch1;
            ch[i+1]=ch3;
            ch[i]=ch2;




        }
        System.out.println(ch);
    }
}
