
/**
 * 
 * Question 1.3 :
 * 
 * Consider first n even numbers starting from zero(0).Complete the code segment to calculate sum of  all these numbers divisible by 3 . Print the sum.

 */

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 0;
        while (n != 0) {
            i = i + 2;
            if (i % 3 == 0) {
                sum += i;
            }
            n = n - 1;
            ;
        }
        System.out.print(sum);
    }
}