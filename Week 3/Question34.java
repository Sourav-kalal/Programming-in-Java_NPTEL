/*
Question 3.3 :
 This program to exercise the call of static and non-static methods. A partial code is given defining two methods, namely sum( ) and multiply ( ). You have to call these methods to find the sum and product of two numbers. Complete the code segment as instructed.  
 */
import java.util.Scanner;
class QuestionScope {
    int sum(int a, int b){ //non-static method
        return a + b;
    }
    static int multiply(int a, int b){ //static method
        return a * b;
    }
}
public class Question34{
   public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();

        QuestionScope obj = new QuestionScope();
        System.out.println(obj.sum(n1,n2));

        System.out.println(QuestionScope.multiply(n1,n2));
    }     
}
