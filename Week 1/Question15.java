/* Question 1.5

Complete the code segment to find the highest mark and average mark secured by Hari in "s" number of subjects.
*/

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mark_avg;
        int result;
        int i;
        int s;
        s = input.nextInt();
        int[] arr = new int[s];

        for (i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        int max = arr[0];

        for (i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        result = max;
        System.out.println(result);
        mark_avg = 0.0;

        for (i = 0; i < arr.length; i++) {
            mark_avg += arr[i];
        }

        mark_avg = mark_avg / (arr.length);
        System.out.print(mark_avg);
    }
}