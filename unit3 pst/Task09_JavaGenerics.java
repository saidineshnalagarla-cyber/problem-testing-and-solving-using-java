import java.util.*;

public class Task09_JavaGenerics {
    static class Printer {
        <T> void printArray(T[] array) {
            for (T value : array)
                System.out.println(value);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Integer[] integers = new Integer[n];

        for (int i = 0; i < n; i++)
            integers[i] = sc.nextInt();

        int m = sc.nextInt();
        String[] strings = new String[m];

        for (int i = 0; i < m; i++)
            strings[i] = sc.next();

        Printer printer = new Printer();

        printer.printArray(integers);
        printer.printArray(strings);
    }
}

/*
INPUT:
3
1 2 3
3
Hello World Java

OUTPUT:
1
2
3
Hello
World
Java
*/