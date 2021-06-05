/**
 Question 4.5 : 
 Modify the code segment to print the following output.


-----------------OUTPUT-------------------

Circle: This is Shape1

Circle: This is Shape2

-------------------------------------------------
 */

interface ShapeX {
        public String baseX = "This is Shape1";
        public void display1();
   }
   
   interface ShapeY extends ShapeX {
        public String baseY = "This is Shape2";
        public void display2();
   }
   
   class ShapeG implements ShapeY {
        public String baseG = "This is Shape3";
        public void display1() {
        System.out.println("Circle: " + baseX);
    }
    
    public void display2() {
        System.out.print("Circle: " + baseY);
    }
}
   
public class Question45{
    public static void main(String[] args) {
        ShapeG circle = new ShapeG();
        circle.display1();
        circle.display2();
    }
}