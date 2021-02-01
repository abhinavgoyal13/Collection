package org.example;

import java.util.HashMap;
import java.util.Scanner;

/*1: Ask user to input starting day and the number of days in a month. Find the number of times every day occurs in that month.
        Ex: Input : Number of days in month = 30 , First day = Tuesday
        Output : Monday=4, Tuesday=5, Wednesday=5, Thursday=4, Friday=4, Saturday=4, Sunday=4;
       */
public class Ex07_rahul {
    public static void main(String[] args) {
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat","Sun"};
        Scanner si = new Scanner(System.in);
        System.out.println("Enter input starting day");
        String sday = si.next();
        Scanner si1 = new Scanner(System.in);
        System.out.println("Enter number of days");
        int NoOfDays= si1.nextInt();
        int[] count= new int[7];
        for (int i = 0; i < 7; i++) {
            count[i]=4;

        }
        int pos=0;

        for (int i = 0; i < 7; i++) {
            if(days[i].equals(sday))
            {
                pos=i;
                break;
            }

        }

        int dif= NoOfDays-28;
        for (int i = pos; i <pos+dif ; i++) {
            if(i>6)
            {
              count[i%6]=5;
            }
            else
            {
                count[i]=5;
            }
        }


        for (int i = 0; i < 7; i++) {
            System.out.println(days[i] + "---->"+ count[i]);
        }

    }
}
