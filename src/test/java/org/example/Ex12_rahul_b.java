package org.example;
/*
Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.
Ex : ("Hello", "There") → "ellohere"
Ex : ("java", "code") → "avaode"
Ex : ("shotl", "java") → "hotlava"
 */
public class Ex12_rahul_b {
    public static void main(String[] args)
    {
        String s1="Hello";
        String s2="There";

        StringBuilder sb1= new StringBuilder(s1);
        StringBuilder sb2= new StringBuilder(s2);

        sb1.deleteCharAt(0);
        sb2.deleteCharAt(0);

        s1= sb1.toString();
        s2=sb2.toString();
        System.out.println(s1+s2);

    }
}
