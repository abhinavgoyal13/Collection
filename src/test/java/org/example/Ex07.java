package org.example;
/*2: Given array ["A";"B";"C";"D";"E";"F";"G"]
A: Add item "NOW I KNOW MY ABCs" at the end. Output should be ["A";"B";"C";"D";"E";"F";"G";"NOW I KNOW MY ABCs"]
        B: Add item "123456" at the beginning. Output should be["123456";"A";"B";"C";"D";"E";"F";"G";"NOW I KNOW MY ABCs"]
        C: Remove ["D";"E";"F";"G"] from the array; Output should be ["123456";"A";"B";"C";"NOW I KNOW MY ABCs"]
        D: Remove ["123456"] from the array; Output should be ["A";"B";"C";"NOW I KNOW MY ABCs"]
        NOTE : Make sure the original array ["A";"B";"C";"D";"E";"F";"G"]should be intact and not modified. you can create any no. of new arrays.
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Ex07 {
    public static void main(String[] args)
    {
String[] arr= {"A","B","C","D","E","F","G"};
// converting array to arraylist
        ArrayList<String> as= new ArrayList<String>(Arrays.asList(arr));
        ArrayList<String> ds= (ArrayList<String>) as.clone();

        as.add(as.size(),"NOW I KNOW MY ABCs");
        System.out.println(as);
        as.add(0,"123456");
        System.out.println(as);
        as.remove("D");


        as.remove("E");
        as.remove("F");
        as.remove("G");
        System.out.println(as);

        as.remove(0);
        System.out.println(as);
        System.out.println(ds);
        String a=as.toString();
        System.out.println(a);}
}
