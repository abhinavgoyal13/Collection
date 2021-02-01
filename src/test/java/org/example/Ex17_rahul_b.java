package org.example;
/*
Return the number of times that the string "code" appears anywhere in the given string
Ex1: ("aaacodebbb") → 1
Ex2: ("codexxcode") → 2
Ex3: ("codexxcodexxcode") → 3
 */
public class Ex17_rahul_b {
    public static void main(String[] args)
    {
        String s1= "codexxcodexxcode";
        String s2="code";

        String[] s3=s1.split(s2,-1);
        System.out.println(s3.length-1);
    }
}
