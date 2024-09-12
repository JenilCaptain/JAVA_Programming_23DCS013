import java.util.*;

class Rectangle{
    public float length;
    public float breadth;

    Rectangle(){
        length=0;
        breadth=0;
    }

    Rectangle(float l, float b){
        length=l;
        breadth=b;
    }

    public float area()
    {
        return (length*breadth);
    }

    public float perimeter()
    {
      return (2*(length+breadth));
    }
}

class Square extends Rectangle{

    Square(float s, float w){
        super(s,w);
    }

}

public class prac_19 {
    public static void main(String[] args) {
        float len,bre,side;

        Scanner s= new Scanner(System.in);
        System.out.print("\nEnter the length of rectangle: ");
        len=s.nextFloat();
        System.out.print("\nEnter the breadth of rectangle: ");
        bre=s.nextFloat();
        Rectangle obj=new Rectangle(len,bre);

        System.out.print("\nEnter the side of square: ");
        side=s.nextFloat();
        Square obj1=new Square(side,side);

        // System.out.println("Area of rectangle: " + obj.area());
        // System.out.println("Perimeter of rectangle: " + obj.perimeter());

        // System.out.println("Area of square: " + obj1.area());
        // System.out.println("Perimeter of square: " + obj1.perimeter());

        // creating array of objects
        Rectangle[] shapes= new Rectangle[2];
        shapes[0]=obj;
        shapes[1]=obj1;

        for(int i=0;i<2;i++)
        {
            if (shapes[i]==obj)
            {
                System.out.println("Area of rectangle: " + shapes[i].area());
                System.out.println("Perimeter of rectangle: " + shapes[i].perimeter());
            }
            else{
                System.out.println("Area of square: " + shapes[i].area());
                System.out.println("Perimeter of square: " + shapes[i].perimeter());
            }
        }
    }
}