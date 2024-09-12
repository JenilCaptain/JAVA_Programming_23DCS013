import java.util.*;

public class finally_keywaord {
    
    public static void main(String[] args) {
        
        int a,b,c;
        a=5;
        b=0;
        System.out.println(10/0); // finally won't be executed.
        try{
            c=a/b;
            System.out.println(" c " + c);
          //  System.exit(0); // exits the programm 
        }
        catch(Exception o) 
        {
            System.out.println("" + o);
            // System.exit(0);
        }
        finally{System.out.println("doing");
        
    }
        System.out.println(" bye");

    }
};


