import java.util.*;

public class Task28_FirstOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String haystack = sc.nextLine();
        String needle = sc.nextLine();

        System.out.println(haystack.indexOf(needle));
    }
}

/*
INPUT:
sadbutsad
sad

OUTPUT:
0
*/