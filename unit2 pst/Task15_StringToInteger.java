import java.util.*;

public class Task15_StringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();

        int i = 0;
        int sign = 1;
        long result = 0;

        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') sign = -1;
            i++;
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');

            long value = result * sign;
            if (value > Integer.MAX_VALUE) {
                System.out.println(Integer.MAX_VALUE);
                return;
            }
            if (value < Integer.MIN_VALUE) {
                System.out.println(Integer.MIN_VALUE);
                return;
            }

            i++;
        }

        System.out.println((int)(result * sign));
    }
}

/*
INPUT:
   -42

OUTPUT:
-42
*/