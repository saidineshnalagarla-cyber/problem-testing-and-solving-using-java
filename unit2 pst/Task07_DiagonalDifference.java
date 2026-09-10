import java.util.*;

public class Task07_DiagonalDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int primary = 0, secondary = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int x = sc.nextInt();
                if (i == j) primary += x;
                if (i + j == n - 1) secondary += x;
            }
        }

        System.out.println(Math.abs(primary - secondary));
    }
}

/*
INPUT:
3
11 2 4
4 5 6
10 8 -12

OUTPUT:
15
*/