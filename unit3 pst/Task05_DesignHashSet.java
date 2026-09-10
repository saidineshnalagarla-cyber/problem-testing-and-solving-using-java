import java.util.*;

public class Task05_DesignHashSet {
    static class MyHashSet {
        boolean[] set = new boolean[1_000_001];

        void add(int key) {
            set[key] = true;
        }

        void remove(int key) {
            set[key] = false;
        }

        boolean contains(int key) {
            return set[key];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyHashSet set = new MyHashSet();

        int q = sc.nextInt();

        while (q-- > 0) {
            String op = sc.next();
            int key = sc.nextInt();

            if (op.equals("add"))
                set.add(key);
            else if (op.equals("remove"))
                set.remove(key);
            else
                System.out.println(set.contains(key));
        }
    }
}

/*
INPUT:
5
add 1
add 2
contains 1
remove 1
contains 1

OUTPUT:
true
false
*/