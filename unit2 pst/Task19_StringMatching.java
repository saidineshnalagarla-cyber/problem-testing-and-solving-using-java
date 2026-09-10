import java.util.*;

public class Task19_StringMatching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] words = new String[n];
        for (int i = 0; i < n; i++) words[i] = sc.next();

        List<String> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && words[j].contains(words[i])) {
                    result.add(words[i]);
                    break;
                }
            }
        }

        System.out.println(result);
    }
}

/*
INPUT:
4
mass
as
hero
superhero

OUTPUT:
[as, hero]
*/