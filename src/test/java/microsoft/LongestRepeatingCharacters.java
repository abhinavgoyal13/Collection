package microsoft;

import java.util.HashMap;
        import java.util.HashSet;
        import java.util.Map;

//str="23345633333345633"
//find longest repeating characters and return it
public class LongestRepeatingCharacters {

    public static void main(String[] args)
    {
        String str1="23345633333345633";
        String str2 = "123456789";
        String str3 = "1234444567899999";
        String str4 = "1234444566666666666667899999";
        System.out.println(longestRepeatingSequence(str1));
        System.out.println(longestRepeatingSequence(str2));
        System.out.println(longestRepeatingSequence(str3));
        System.out.println(longestRepeatingSequence(str4));
    }

    public static int longestRepeatingSequence(String s){

        int j=0, start=0;
        int maxCount = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            int localCount=1;
            while(j< s.length()-1 && s.charAt(j)==s.charAt(j+1) )
            {

                j++;
                localCount=localCount+1;
            }

            if(localCount>=maxCount)
            {
                maxCount=localCount;
                start=i;
            }

            i=j;
            j=j+1;


        }
        if(maxCount==1)
        {
            System.out.println(" No duplicates");
        }
        else
        {
            System.out.println(s.substring(start,start+maxCount));
        }


        return maxCount;
    }





}
