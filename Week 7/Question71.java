
/**
 *Question 7.1 :
 *  
 * Complete the following code fragment to read three integer values from the
 * keyboard and find the sum of the values. Declare a variable "sum" of type int
 * and store the result in it.
 */
// Write the appropriate statement(s) to import the package(s) you need in your program
import java.util.*;

public class Question1 {
    public static void main(String[] args) {

        // Write the appropriate code to read the 3 integer values and find their sum.
        Scanner j = new Scanner(System.in);
        int j1 = j.nextInt();
        int j2 = j.nextInt();
        int j3 = j.nextInt();
        int sum = j1 + j2 + j3;
        System.out.println(sum);
    }
}