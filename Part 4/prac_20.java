
import java.util.*;

class Shape {
    public void show() {
        System.out.println("This is a Shape");
    }
}

class Rectangle1 extends Shape {

    public void show() {
        System.out.println("This is a Rectangle");
    }
    public void showShape()
    {
        super.show();
    }
   
}

class Circle extends Shape {

    
    public void show() {
        System.out.println("This is a Circle");
    }
}

class Square1 extends Rectangle1 {

    public void show() {
        System.out.println("Square is a Rectangle");
    }

    public void showRectangle()
    {
        super.show();
    }

    public void showShape()
    {
        super.showShape();
    }

}

public class prac_20 {
    public static void main(String[] args) {
        Square1 obj = new Square1();

       obj.show();
       obj.showRectangle();
       obj.showShape();
    }

}
