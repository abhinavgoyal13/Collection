package org.example;

public class prime {

    public static void main(String[] args) {
        int x = 12;
        int flag = 0;
        for (int i = 2; i<= x/2; i++) {

            if (x % i == 0  ) {
                flag = 1;
                break;
            } else {
                flag = 0;
            }

        }

        if (flag == 1) {
            System.out.println("Not a prime");

        } else {
            System.out.println("Prime number");
        }

    }

}
