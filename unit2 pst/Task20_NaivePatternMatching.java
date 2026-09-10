import java.util.*;

public class Task20_NaivePatternMatching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String pattern = sc.nextLine();

        boolean found = false;

        for (int i = 0; i <= text.length() - pattern.length(); i++) {
            int j = 0;

            while (j < pattern.length() &&
                   text.charAt(i + j) == pattern.charAt(j)) {
                j++;
            }

            if (j == pattern.length()) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) System.out.print("-1");
    }
}

/*
INPUT:
AABAACAADAABAABA
AABA

OUTPUT:
0 9 12
*/