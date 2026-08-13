import java.util.*;

class Calculator {
    static int add(int a, int b) {
        return a + b;
    }

    static int divide(int a, int b) {
        return a / b;
    }
}

public class task9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String operator = sc.next();
        int b = sc.nextInt();

        boolean result;

        if (operator.equals("+")) {
            result = Calculator.add(a, b) == a + b;
        } else {
            try {
                result = Calculator.divide(a, b) == a / b;
            } catch (ArithmeticException e) {
                result = false;
            }
        }

        System.out.println(
                result ? "Test Passed" : "Test Failed"
        );
    }
}
