import java.util.*;

public class Task12_BirthdayBar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] s = new int[n];
        for (int i = 0; i < n; i++) s[i] = sc.nextInt();

        int d = sc.nextInt();
        int m = sc.nextInt();

        int count = 0;
        int sum = 0;

        for (int i = 0; i < m; i++) sum += s[i];
        if (sum == d) count++;

        for (int i = m; i < n; i++) {
            sum += s[i] - s[i - m];
            if (sum == d) count++;
        }

        System.out.println(count);
    }
}

/*
INPUT:
6
1 2 1 3 2 1
3 2

OUTPUT:
2
*/