/*
Question 2.2 : 
Complete the code segment to call the method 
print() of class Student first and then call print() method of class School.

*/
class School { 
    public void print() { 
		System.out.println("Hi! I am class SCHOOL."); 
    } 
} 
class Student { 
	public void print() { 
		System.out.println("Hi! I am class STUDENT"); 
    } 
}

public class Question22{ 
    public static void main(String args[]){
    Student c = new Student();
    c.print();
    School k = new School();
    k.print();
    }
}