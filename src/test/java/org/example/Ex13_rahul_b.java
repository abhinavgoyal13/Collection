package org.example;
/*
Given a string, count the number of words ending in 'y' or 'z' --
string "heavy" → Output 1 : As it has 1 y at end, so output should be 1.
string "Yellow"→ Output 0 : As it has 1 y but its not at the end, its at the beginning, so output should be 0.
string "fez"→ Output 1 : As it has 1 z at end, so output should be 1.
string "fez day"→ Output 2 : As it has 1 z and 1 y at the end, so output should be 2.
string "day fez"→ Output 2 : As it has 1 z and 1 y at the end, so output should be 2.
string "day fyyyz"→ Output 2 : As it has 1 z and 1 y at the end, so output should be 2.
string "sunday"→ Output 1 : As it has 1 y at the end, so output should be 1.
string "zero"→ Output 0 : As it has 1 z but its not at the end, its at the beginning, so output should be 0
 */
public class Ex13_rahul_b {

    public static void main(String[] args)
    {
        String s1="day fyyyz asdz";
        if(!s1.contains(" ")) {
            if ((s1.charAt(s1.length() - 1) == 'y') || (s1.charAt(s1.length() - 1) == 'z')) {
                System.out.println(1);
            }
        }
        else
        {
           String[] s2= s1.split(" ");
           int count =0;
           for(int i=0;i < s2.length;i++)
           {
               if ((s2[i].charAt(s2[i].length() - 1) == 'y') || (s2[i].charAt(s2[i].length() - 1) == 'z')) {
                   count = count +1;
               }

           }
            System.out.println(count);
        }
    }
}
