import java.util.*;

public class Task23_TwoStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        while (q-- > 0) {
            String a = sc.next();
            String b = sc.next();

            boolean[] seen = new boolean[256];

            for (char c : a.toCharArray())
                seen[c] = true;

            boolean common = false;

            for (char c : b.toCharArray()) {
                if (seen[c]) {
                    common = true;
                    break;
                }
            }

            System.out.println(common ? "YES" : "NO");
        }
    }
}

/*
INPUT:
2
hello
world
hi
world

OUTPUT:
YES
NO
*/