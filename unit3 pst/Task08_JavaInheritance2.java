import java.util.*;

public class Task08_JavaInheritance2 {
    static class Arithmetic {
        int add(int a, int b) {
            return a + b;
        }
    }

    static class Adder extends Arithmetic {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        Adder adder = new Adder();

        System.out.println("My superclass is: " + Arithmetic.class.getSimpleName());
        System.out.println(adder.add(a, b));
    }
}

/*
INPUT:
2 3

OUTPUT:
My superclass is: Arithmetic
5
*/