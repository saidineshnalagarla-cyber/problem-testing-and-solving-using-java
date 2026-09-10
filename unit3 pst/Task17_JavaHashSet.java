import java.util.*;

public class Task17_JavaHashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        Set<String> pairs = new HashSet<>();

        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();

            pairs.add(a + "#" + b);
            System.out.println(pairs.size());
        }
    }
}

/*
INPUT:
5
john tom
john mary
john tom
tom mary
john mary

OUTPUT:
1
2
2
3
3
*/