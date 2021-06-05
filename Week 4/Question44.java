/**
 Question 4.4 :
 Complete the code segment to call the default method in the interface First and Second.
 */

interface First{ 
    // default method 
    default void show(){ 
        System.out.println("Default method implementation of First interface."); 
    } 
} 
  
interface Second{ 
    // Default method 
    default void show(){ 
        System.out.println("Default method implementation of Second interface."); 
    } 
} 
  
// Implementation class code 
class Question44 implements First, Second{  
    public void show(){

    First.super.show();
    Second.super.show();
    } 
  
    public static void main(String args[]){ 
        Question44 q = new Question44(); 
        q.show(); 
    } 
}
