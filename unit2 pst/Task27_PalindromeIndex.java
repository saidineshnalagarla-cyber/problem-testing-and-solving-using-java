import java.util.*;

public class Task27_PalindromeIndex {
    static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--))
                return false;
        }
        return true;
    }

    static int palindromeIndex(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                if (isPalindrome(s, left + 1, right)) return left;
                if (isPalindrome(s, left, right - 1)) return right;
                return -1;
            }
            left++;
            right--;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0)
            System.out.println(palindromeIndex(sc.next()));
    }
}

/*
INPUT:
3
aaab
baa
aaa

OUTPUT:
3
0
-1
*/