import java.util.*;

public class Task01_StringHalvesAlike {
    static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int half = s.length() / 2;
        int first = 0, second = 0;

        for (int i = 0; i < half; i++) {
            if (isVowel(s.charAt(i))) first++;
        }

        for (int i = half; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) second++;
        }

        System.out.println(first == second);
    }
}

/*
INPUT:
book

OUTPUT:
true
*/