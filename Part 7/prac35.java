
class first extends Thread{
    public void run(){

        System.out.println(" first thread is running ");
    }
}

class second extends Thread{
    public void run(){

        System.out.println(" second thread is running ");
    }
}

class third extends Thread{
    public void run(){

        System.out.println(" Third thread is running ");
    }
}

public class prac35 {
    
    public static void main(String[] args) {
        
        first o1= new first();
        second o2= new second();
        third o3= new third();

        // System.out.println("Before setting priority: ");
        // o1.start();
        // o2.start();
        // o3.start();

        o1.setPriority(8);
        o2.setPriority(4);
        o3.setPriority(6);

        System.out.println("\nAfter setting priority: ");
        o1.start();
        o2.start();
        o3.start();

    }
}
