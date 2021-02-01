package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

//Ask the user to input a character and check whether it is an alphabet or not, then display the output on the screen.
//If input character is an Alphabets, print "AN ALPHABET! I can read your mind" and if its a number print "A NUMBER! I can read your mind".
public class Ex06_rahul {

    public static void main(String[] args)
    {
        System.out.println("Enter a character");
        Scanner si = new Scanner(System.in);

        char inp=si.next().charAt(0);

        if((inp>='a' && inp<='z') || (inp>='A' && inp <='Z'))
        {
            System.out.println("An APlhabet");
        }
        else if(inp>='0' && inp <='9')
        {
            System.out.println("nUmber");
        }
        else
        {
            System.out.println("Special character");
        }

    }
}
