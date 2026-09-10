import java.util.*;

public class Task25_MarsExploration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String message = "SOS";
        int changed = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != message.charAt(i % 3))
                changed++;
        }

        System.out.println(changed);
    }
}

/*
INPUT:
SOSSPSSQSSOR

OUTPUT:
3
*/