
/**
 Question 5.1 :
 An interface Number is defined in the following program.  You have to declare a class A, which will implement the interface Number. Note that the method findSqr(n) will return the square of the number n.
 */

import java.util.Scanner;

interface Number {
  int findSqr(int i); // Returns the square of n
}

class A implements Number {
  public int findSqr(int j) {
    return j * j;
  }
}

public class Question51 {
  public static void main(String[] args) {
    A a = new A();
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    System.out.println(a.findSqr(i));
    sc.close();
  }
}
