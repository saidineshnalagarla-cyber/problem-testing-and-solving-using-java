import java.util.*;

public class Task11_MaximumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        int current = nums[0];
        int best = nums[0];

        for (int i = 1; i < n; i++) {
            current = Math.max(nums[i], current + nums[i]);
            best = Math.max(best, current);
        }

        System.out.println(best);
    }
}

/*
INPUT:
9
-2 1 -3 4 -1 2 1 -5 4

OUTPUT:
6
*/