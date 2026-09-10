import java.util.*;

public class Task20_JavaExceptionHandlingTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        }
    }
}

/*
INPUT:
10 0

OUTPUT:
java.lang.ArithmeticException: / by zero
*/