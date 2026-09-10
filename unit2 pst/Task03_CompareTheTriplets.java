import java.util.*;

public class Task03_CompareTheTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[3];
        int[] b = new int[3];

        for (int i = 0; i < 3; i++) a[i] = sc.nextInt();
        for (int i = 0; i < 3; i++) b[i] = sc.nextInt();

        int alice = 0, bob = 0;

        for (int i = 0; i < 3; i++) {
            if (a[i] > b[i]) alice++;
            else if (a[i] < b[i]) bob++;
        }

        System.out.println(alice + " " + bob);
    }
}

/*
INPUT:
5 6 7
3 6 10

OUTPUT:
1 1
*/