import java.util.*;

public class Task17_LongestSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] last = new int[128];
        Arrays.fill(last, -1);

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (last[c] >= left)
                left = last[c] + 1;

            last[c] = right;
            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println(maxLength);
    }
}

/*
INPUT:
abcabcbb

OUTPUT:
3
*/