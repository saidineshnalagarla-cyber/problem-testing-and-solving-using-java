import java.util.*;

public class Task14_MaximumSumCircularSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        int total = nums[0];
        int currentMax = nums[0];
        int maxSum = nums[0];
        int currentMin = nums[0];
        int minSum = nums[0];

        for (int i = 1; i < n; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            maxSum = Math.max(maxSum, currentMax);

            currentMin = Math.min(nums[i], currentMin + nums[i]);
            minSum = Math.min(minSum, currentMin);

            total += nums[i];
        }

        if (maxSum < 0)
            System.out.println(maxSum);
        else
            System.out.println(Math.max(maxSum, total - minSum));
    }
}

/*
INPUT:
3
5 -3 5

OUTPUT:
10
*/