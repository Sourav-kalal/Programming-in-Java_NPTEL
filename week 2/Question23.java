/*

Question2.3 :
Complete the code segment to call print() method of
class Question by creating a method named ‘studentMethod()’.

*/

public class Question23{ 
    public static void main(String[] args) { 
		Question23 q = new Question23();
		q.studentMethod();
    }
	
	void print(Question23 object){
		System.out.print("Well Done!");
	}
    public void studentMethod(){
    Question23 q = new Question23();
	print(q);
    }
}