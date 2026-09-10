import java.util.*;

public class Task15_JavaIterator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Object> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String value = sc.next();

            try {
                list.add(Integer.parseInt(value));
            } catch (NumberFormatException e) {
                list.add(value);
            }
        }

        Iterator<Object> iterator = list.iterator();

        while (iterator.hasNext()) {
            Object value = iterator.next();

            if (value instanceof String)
                System.out.println(value);
        }
    }
}

/*
INPUT:
5
1 2 Hello 3 World

OUTPUT:
Hello
World
*/