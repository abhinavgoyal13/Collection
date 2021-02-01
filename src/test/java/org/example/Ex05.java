package org.example;

import java.util.Scanner;

//:Ask user to enter the starting number and ending number and Print all the prime numbers between starting and ending number.
public class Ex05 {

    public static void main(String[] args) {
        Scanner si = new Scanner(System.in);
        System.out.println("Enter first number");
        int x = si.nextInt();
        System.out.println("Enter second number");
        int y = si.nextInt();

        if (x < y) {
            prime(x, y);
        } else {
            prime(y, x);
        }
    }

    public static void prime(int a, int b) {
        for (int j = a; j <= b; j++) {
            int flag = 0;
            for (int i = 2; i <= j / 2; i++) {
                if (j % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {

                System.out.println(j);
            }
        }

    }
}
