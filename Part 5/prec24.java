
import java.util.Scanner;

class calculate
{
    void divide(int a,int b)
    {
        int c;

        try {
            c=a/b;
            System.out.println("Division = " + c);
        } catch (Exception e) {
            System.out.println("Dividing By Zero Is Invalid");
        }
    }
}

public class prec24{
    public static void main(String[] args) {
        calculate c = new calculate();
        int a,b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 2 Number : ");
        a=s.nextInt();
        b=s.nextInt();

        c.divide(a, b);
    }
}