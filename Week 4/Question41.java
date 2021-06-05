/**
 Question 4.1 :
 Complete the code segment to execute the following program successfully. You should import the correct package(s) and/or class(s) to complete the code.
 */

import static java.lang.System.out;
import java.util.Scanner;

public class Question41{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String courseName = scanner.nextLine(); 
        out.println("Course: " + courseName); 
    }
}