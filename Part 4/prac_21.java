import java.util.*;

class Degree{

    public void getDegree()
    {
        System.out.println("I got a degree");
    }
}

class Undergraduate extends Degree{
    public void getDegree()
    {
        System.out.println("I am an Undergraduate");
    }

    public void displayDegree()
    {
        super.getDegree();
    }
}

class PostGraduate extends Degree{
    public void getDegree()
    {
        System.out.println("I am a PostGraduate");
    }
    public void displayDegree()
    {
        super.getDegree();
    }
}
public class prac_21 {
    
    public static void main(String[] args) {
        
        Undergraduate obj= new Undergraduate();
        obj.getDegree();
        obj.displayDegree();

        PostGraduate obj1= new PostGraduate();
        obj1.getDegree();
        obj1.displayDegree();
    }
}
