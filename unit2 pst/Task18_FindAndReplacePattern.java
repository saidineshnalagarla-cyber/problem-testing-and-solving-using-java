import java.util.*;

public class Task18_FindAndReplacePattern {
    static boolean matches(String word, String pattern) {
        if (word.length() != pattern.length()) return false;

        Map<Character, Character> forward = new HashMap<>();
        Map<Character, Character> backward = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char w = word.charAt(i);
            char p = pattern.charAt(i);

            if (forward.containsKey(w) && forward.get(w) != p) return false;
            if (backward.containsKey(p) && backward.get(p) != w) return false;

            forward.put(w, p);
            backward.put(p, w);
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] words = new String[n];
        for (int i = 0; i < n; i++) words[i] = sc.next();

        String pattern = sc.next();

        List<String> result = new ArrayList<>();

        for (String word : words)
            if (matches(word, pattern))
                result.add(word);

        System.out.println(result);
    }
}

/*
INPUT:
6
abc
deq
mee
aqq
dkd
ccc
abb

OUTPUT:
[mee, aqq]
*/