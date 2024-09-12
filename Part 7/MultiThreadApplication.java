public class practice {
    
}
import java.util.Random;

class NumberGenerator extends Thread {
    private final SharedData sharedData;

    public NumberGenerator(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    public void run() {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int randomNum = rand.nextInt(100); // Generate a random integer
            sharedData.setNumber(randomNum);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class SquareCalculator extends Thread {
    private final SharedData sharedData;

    public SquareCalculator(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (sharedData) {
                if (sharedData.getNumber() % 2 == 0) {
                    System.out.println("Square of " + sharedData.getNumber() + " is " + (sharedData.getNumber() * sharedData.getNumber()));
                }
            }
        }
    }
}

class CubeCalculator extends Thread {
    private final SharedData sharedData;

    public CubeCalculator(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (sharedData) {
                if (sharedData.getNumber() % 2 != 0) {
                    System.out.println("Cube of " + sharedData.getNumber() + " is " + (sharedData.getNumber() * sharedData.getNumber() * sharedData.getNumber()));
                }
            }
        }
    }
}

class SharedData {
    private int number;

    public synchronized void setNumber(int number) {
        this.number = number;
    }

    public synchronized int getNumber() {
        return number;
    }
}

public class MultiThreadApplication {
    public static void main(String[] args) {
        SharedData sharedData = new SharedData();

        NumberGenerator numGen = new NumberGenerator(sharedData);
        SquareCalculator squareCalc = new SquareCalculator(sharedData);
        CubeCalculator cubeCalc = new CubeCalculator(sharedData);

        numGen.start();
        squareCalc.start();
        cubeCalc.start();
    }
}
