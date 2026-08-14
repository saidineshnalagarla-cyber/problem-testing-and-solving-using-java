import java.util.*;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> salaries = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            salaries.add(sc.nextInt());
        }

        salaries.stream()
                .map(s -> s + s / 10)
                .forEach(s -> System.out.print(s + " "));
    }
}

//Sample Input:
//5
//1000 2000 3000 4000 5000
//Sample Output:
//1100 2200 3300 4400 5500

