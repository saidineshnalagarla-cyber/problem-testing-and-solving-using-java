import java.util.*;

public class Task29_LongestPalindromicSubstring {
    static String longestPalindrome(String s) {
        if (s.length() < 2) return s;

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
        int maxLength = 0, maxCenter = 0;

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

            if (p[i] > maxLength) {
                maxLength = p[i];
                maxCenter = i;
            }
        }

        int start = (maxCenter - maxLength) / 2;
        return s.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(longestPalindrome(s));
    }
}

/*
INPUT:
babad

OUTPUT:
bab
*/