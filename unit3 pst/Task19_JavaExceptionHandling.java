import java.util.*;

public class Task19_JavaExceptionHandling {
    static int power(int n, int p) throws Exception {
        if (n < 0 || p < 0)
            throw new Exception("n or p should not be negative");

        if (n == 0 && p == 0)
            throw new Exception("n and p should not be zero");

        return (int)Math.pow(n, p);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int p = sc.nextInt();

        try {
            System.out.println(power(n, p));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

/*
INPUT:
-1 2

OUTPUT:
n or p should not be negative
*/