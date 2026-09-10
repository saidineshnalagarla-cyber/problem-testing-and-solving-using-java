import java.util.*;

public class Task02_Lapin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            int[] freq = new int[26];
            int n = s.length();

            for (int i = 0; i < n / 2; i++) {
                freq[s.charAt(i) - 'a']++;
                freq[s.charAt(n - 1 - i) - 'a']--;
            }

            boolean lapin = true;
            for (int x : freq) {
                if (x != 0) {
                    lapin = false;
                    break;
                }
            }

            System.out.println(lapin ? "YES" : "NO");
        }
    }
}

/*
INPUT:
3
gaga
abc
rotor

OUTPUT:
YES
NO
YES
*/