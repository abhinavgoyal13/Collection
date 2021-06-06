package Interview.permutations;

import java.util.Arrays;

public class Lexographic_Arrays_sort {

    public static void  method1(String[] arr)
    {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void  method2(String[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i].compareToIgnoreCase(arr[j])>0)
                {
                    String temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]= temp;
                }
            }
        }
        System.out.println(Arrays.asList(arr));

    }
    public static void main(String[] args)
    {
        String[] arr= {"abc","def","abcde","zxy","cde"};
       Lexographic_Arrays_sort.method1(arr);
        Lexographic_Arrays_sort.method2(arr);
    }
}
