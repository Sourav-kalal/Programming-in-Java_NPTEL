
/**
 * Question 5.3 :
 * Complete the code segment to catch the ArithmeticException in the following,
 * if any. On the occurrence of such an exception, your program should print
 * “Exception caught: Division by zero.” If there is no such exception, it will
 * print the result of division operation on two integer values.
 */

import java.util.Scanner;

public class Question53 {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);

        int j;
        a = input.nextInt();
        b = input.nextInt();
        try {
            j = a / b;
            System.out.print(j);
        } catch (ArithmeticException e) {
            System.out.print("Exception caught: Division by zero.");
        }
        input.close();
    }
}
