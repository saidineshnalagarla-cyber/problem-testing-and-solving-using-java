import java.util.*;

public class Task06_MoveZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        int index = 0;

        for (int x : nums) {
            if (x != 0) nums[index++] = x;
        }

        while (index < n) nums[index++] = 0;

        for (int x : nums) System.out.print(x + " ");
    }
}

/*
INPUT:
5
0 1 0 3 12

OUTPUT:
1 3 12 0 0
*/