package org.example;

import java.util.*;

public class HashMapPractice {
    public static void main(String[] args)
    {
        HashMap<Integer, String> hmap= new HashMap<Integer,String>();
        hmap.put(1,"abhinav");
        HashMap<Integer, String> hmap2= new HashMap<Integer,String>();
        hmap2.put(1,"abhinav");

        List<HashMap> list = new ArrayList<>();
        list.add(hmap);
        list.add(hmap2);

        Set s=hmap.entrySet();
        Iterator it =s.iterator();

        while(it.hasNext())
        {
            Map.Entry mp =(Map.Entry)it.next();
            mp.getKey();
            mp.getValue();
        }

    }

}
