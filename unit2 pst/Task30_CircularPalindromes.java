import java.util.*;

public class Task30_CircularPalindromes {
    static int longestPalindrome(String s) {
        if (s.length() < 2) return s.length();

        char[] t = new char[2 * s.length() + 3];
        t[0] = '^';
        t[t.length - 1] = '$';

        for (int i = 0; i < s.length(); i++) {
            t[2 * i + 1] = '#';
            t[2 * i + 2] = s.charAt(i);
        }
        t[t.length - 2] = '#';

        int[] p = new int[t.length];
        int center = 0, right = 0;
        int maxLength = 0;

        for (int i = 1; i < t.length - 1; i++) {
            int mirror = 2 * center - i;

            if (i < right)
                p[i] = Math.min(right - i, p[mirror]);

            while (t[i + 1 + p[i]] == t[i - 1 - p[i]])
                p[i]++;

            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }

            maxLength = Math.max(maxLength, p[i]);
        }

        return Math.min(maxLength, s.length());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        for (int start = 0; start < n; start++) {
            String rotated = s.substring(start) + s.substring(0, start);
            System.out.println(longestPalindrome(rotated));
        }
    }
}

/*
INPUT:
5
abcba

OUTPUT:
5
3
3
3
5
*/