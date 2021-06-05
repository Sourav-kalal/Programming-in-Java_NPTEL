
/**
 * Question 5.5
 * In the following program, there may be multiple exceptions. You have to
 * complete the code using only one try-catch block to handle all the possible
 * exceptions.
 * 
 * For example, if user’s input is 1, then it will throw and catch
 * “java.lang.NullPointerException“.
 */

import java.util.Scanner;

public class Question55 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        // Put the following code under try-catch block to handle exceptions
        try {
            int j;
            switch (i) {
            case 0:
                int zero = 0;
                j = 92 / zero;
                break;
            case 1:
                int b[] = null;
                j = b[0];
                break;
            default:
                System.out.println("No exception");
            }

        } catch (Exception e) {
            System.out.print(e);
        }
        scan.close();
    }
}