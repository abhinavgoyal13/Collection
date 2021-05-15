package org.example;

import org.testng.annotations.Test;

import java.util.*;

public class StringInterviewQuestions {

   public static void main(String[] args)
    {
        String str="abcdeeefsabc";
Map<Character,Integer> hmap = new HashMap<>();

char[] ch= str.toCharArray();
        for (int i = 0; i < ch.length; i++) {

            if(hmap.containsKey(ch[i]))
            {
                hmap.put(ch[i],hmap.get(ch[i])+1);
            }
            else
            {
                hmap.put(ch[i],1);
            }
        }

        Set s= hmap.entrySet();
        Iterator i= s.iterator();

        while(i.hasNext())
        {
            Map.Entry mp =(Map.Entry)(i.next());
            System.out.println(mp.getKey());
            System.out.println(mp.getValue());
        }

    }
}
