import java.util.*; 

public class throws_keyword {
    
}

class Demo{
    public static void main(String[] args) throws InterruptedException {
        Test t1=new Test();
        t1.m1();
    }
}

class Test{
    void m1() throws InterruptedException
    {
        m2();
    }
    void m2() throws InterruptedException
    {
        // try{
        m3();
        // }
        // catch(InterruptedException e)
        // {
        //     System.out.println("Something wemt wrong..."+ e);
        // }
    }
    void m3() throws InterruptedException
    {
        System.out.println("Hi");
         Thread.sleep(2000);
        
        // try{
        //     Thread.sleep(2000);
        // }
        // catch(InterruptedException e)
        // {
        //     System.out.println("something went wrong.."+ e);
        // }

        System.out.println("Hello");
    }
}