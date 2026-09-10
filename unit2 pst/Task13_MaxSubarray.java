import java.util.*;

public class Task13_MaxSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            int current = 0;
            int maxSub = Integer.MIN_VALUE;
            int maxElement = Integer.MIN_VALUE;
            int positiveSum = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                maxElement = Math.max(maxElement, a[i]);
                positiveSum += Math.max(0, a[i]);

                current = Math.max(a[i], current + a[i]);
                maxSub = Math.max(maxSub, current);
            }

            int maxNonContiguous = positiveSum == 0 ? maxElement : positiveSum;

            System.out.println(maxSub + " " + maxNonContiguous);
        }
    }
}

/*
INPUT:
2
5
1 2 3 4
6
2 -1 2 3 4 -5

OUTPUT:
10 10
10 11
*/