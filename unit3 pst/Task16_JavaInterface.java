import java.util.*;

public class Task16_JavaInterface {
    interface AdvancedArithmetic {
        int divisorSum(int n);
    }

    static class Calculator implements AdvancedArithmetic {
        public int divisorSum(int n) {
            int sum = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0)
                    sum += i;
            }

            return sum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        AdvancedArithmetic calculator = new Calculator();

        System.out.println("I implemented: " + calculator.getClass().getInterfaces()[0].getSimpleName());
        System.out.println(calculator.divisorSum(n));
    }
}

/*
INPUT:
6

OUTPUT:
I implemented: AdvancedArithmetic
12
*/