package org.example;

public class Ex01 {
    public static void main(String[] args)
    {
        String str="AHCECLWLXO";
        for(int i=1;i<= str.length()-1;i+=2) {
            //char cr = str.charAt(i);
            System.out.print(str.charAt(i));
        }
    }
}
