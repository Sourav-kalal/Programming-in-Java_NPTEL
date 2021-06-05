
/**
 * 
 * Question 7.5 :
 * 
 * A string "s1" is already initialized. You have to read the index "n" from the
 * keyboard. Complete the code segment to catch the exception in the following,
 * if any. On the occurrence of such an exception, your program should print
 * “exception occur” .If there is no such exception, your program should replace
 * the char "a" at the index value "n" of the "s1" ,then it will print the
 * modified string.
 */
import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        try {
            String s1 = "NPTELJAVA";
            Scanner inr = new Scanner(System.in);
            int n = inr.nextInt();
            char c = 'a';
            // Replace the char in string "s1" with the char 'a' at index "n" and print the
            // modified string
            StringBuilder j = new StringBuilder(s1);
            j.setCharAt(n, c);
            System.out.print(j);
        }

        catch (Exception e) {
            System.out.println("exception occur");
        }
    }
}