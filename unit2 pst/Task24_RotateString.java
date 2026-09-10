import java.util.*;

public class Task24_RotateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String goal = sc.next();

        boolean result = s.length() == goal.length() &&
                         (s + s).contains(goal);

        System.out.println(result);
    }
}

/*
INPUT:
abcde cdeab

OUTPUT:
true
*/