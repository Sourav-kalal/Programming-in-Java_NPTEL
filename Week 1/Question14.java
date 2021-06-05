
/***
 * 
 * Question 1.4 :
 * 
 * Complete the code segment to check whether the number is an Armstrong number or not.
 */

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        int num, times = 0, rem;
        double temp = 0.0;
        num = n;
        while (num != 0) {
            times = times + 1;
            num = num / 10;
        }
        num = n;
        while (num > 0) {
            rem = num % 10;
            temp = temp + Math.pow(rem, times);
            num = num / 10;
        }
        // store the output(1 or 0) in result variable.
        if (temp == n) {
            System.out.print("1");
        } else {
            System.out.print("0");
        }
    }
}