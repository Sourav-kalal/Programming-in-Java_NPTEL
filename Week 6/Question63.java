/**
 * Question 6.3 :
 * 
 * A part of the Java program is given, which can be completed in many ways, for
 * example using the concept of thread, etc. Follow the given code and complete
 * the program so that your program prints the message "NPTEL Java".
 * 
 * Note: Your program should utilize the given interface/ class.
 * 
 * 
 */

interface A {
    public abstract void run();
}

class B implements A {
    public void run() {
    }
}

class MyThread extends B {
    @Override
    public void run() {
        System.out.print("NPTEL Java");
    }
}

// Main class Question is defined
public class Question63 {
    public static void main(String[] args) {
        // An object of MyThread class is created
        MyThread t = new MyThread();
        // run() of class MyThread is called
        t.run();
    }
}