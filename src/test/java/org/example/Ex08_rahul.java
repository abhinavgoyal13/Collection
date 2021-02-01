package org.example;
/*2: Ask user to input the electricity consumption and calculate the amount based on below parameters...
1 to 100 units – Rs. 10/unit
100 to 200 units – Rs. 15/unit
200 to 300 units – Rs. 20/unit
above 300 units – Rs. 25/unit
Examples 1:
Input: U = 250
Output: 3500
Explanation:
Charge for the first 100 units – 10*100 = 1000
Charge for the 100 to 200 units – 15*100 = 1500
Charge for the 200 to 250 units – 20*50 = 1000
Total Electricity Bill = 1000 + 1500 + 1000 = 3500
*/

import java.util.Scanner;

public class Ex08_rahul {

    public static void main(String[] args) {
        Scanner si = new Scanner(System.in);
        System.out.println("Enter neter reading");
        int reading = si.nextInt();
        int amount;
        if (reading < 100) {
    amount = reading*10;
        } else if (reading >= 100 && reading < 200) {
            amount = (reading-100)*15+10*100;
        } else if (reading >= 200 && reading < 300) {
amount=10*100+15*100+(reading-200)*20;
        } else {
amount = 10*100+15*100+20*100+(reading-300)*25;
        }
        System.out.println(amount);
    }

}
