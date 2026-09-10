import java.util.*;

public class Task22_RepeatedSubstringPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String doubled = s + s;
        boolean result = doubled.substring(1, doubled.length() - 1).contains(s);

        System.out.println(result);
    }
}

/*
INPUT:
abab

OUTPUT:
true
*/