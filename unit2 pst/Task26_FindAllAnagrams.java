import java.util.*;

public class Task26_FindAllAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String p = sc.next();

        List<Integer> result = new ArrayList<>();

        if (p.length() > s.length()) {
            System.out.println(result);
            return;
        }

        int[] need = new int[26];
        int[] window = new int[26];

        for (char c : p.toCharArray())
            need[c - 'a']++;

        for (int i = 0; i < s.length(); i++) {
            window[s.charAt(i) - 'a']++;

            if (i >= p.length())
                window[s.charAt(i - p.length()) - 'a']--;

            if (Arrays.equals(need, window))
                result.add(i - p.length() + 1);
        }

        System.out.println(result);
    }
}

/*
INPUT:
cbaebabacd
abc

OUTPUT:
[0, 6]
*/