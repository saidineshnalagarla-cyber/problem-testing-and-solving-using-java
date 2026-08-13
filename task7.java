import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<String> hashtags = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            hashtags.add(sc.next());
        }

        hashtags.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .forEach((key, value) ->
                        System.out.println(key + " " + value));
    }
}
