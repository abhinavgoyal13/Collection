package org.example;

public class Ex02 {
    public static void main(String[] args)
    {
        String str= "ahceclwlxo";

        for(int i=1;i<= str.length()-1;i+=2)
        {
            System.out.print((char)(str.charAt(i) - 32));
        }
    }
}
