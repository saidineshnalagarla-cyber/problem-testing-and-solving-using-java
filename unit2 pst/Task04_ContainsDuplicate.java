import java.util.*;

public class Task04_ContainsDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Set<Integer> set = new HashSet<>();
        boolean duplicate = false;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (!set.add(x)) duplicate = true;
        }

        System.out.println(duplicate);
    }
}

/*
INPUT:
5
1 2 3 1 5

OUTPUT:
true
*/