import java.util.*;

interface AdvancedArithmetic {
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
    
    @Override
    public int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
            { 
                sum += i;     
            }
        }
        return sum;
    }
}

public class prac_22 {
    public static void main(String[] args) {
        MyCalculator obj = new MyCalculator();

        int n ;
        Scanner s=new Scanner(System.in);

        System.out.print("Enter the number: ");
        n=s.nextInt();
        int sum= obj.divisor_sum(n);
        System.out.println("Sum of divisors: " + sum); // Output: 12
 
    }
}

