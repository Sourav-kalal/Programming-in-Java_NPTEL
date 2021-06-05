/**
 Question 3.5 :
 Complete the code segment to swap two numbers using call by object reference.
 
*/

import java.util.Scanner;
class Question {  
  Scanner sc = new Scanner(System.in);
  int e1 = sc.nextInt();  //Read e1
  int e2 = sc.nextInt();  //Read e2
 }
public class Question35{
    static void swap(Question t){
        int obj;
        obj=t.e1;
        t.e1=t.e2;
        t.e2=obj;
    }
    public static void main(String[] args) {
        Question t = new Question();
        swap(t);

        System.out.println(t.e1+" "+ t.e2);     
    }
 
}