package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NagarroQuestion {

    public static void main(String[] args)
    {
        String str="abc d 1234567890pqr 54897";
        //String nums = str.replaceAll("[^0-9 ]", "").replaceAll(" +", " ").trim();
       // System.out.println(nums);
        String[] s1= str.replaceAll("[^0-9 ]", "").trim().split(" ");
        int sum =0;
        for(String s:s1)
        {
            sum = sum + Integer.parseInt(s);
        }
        System.out.println(sum);
    }

}
