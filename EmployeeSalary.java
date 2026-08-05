import java.util.*;
import java.util.stream.*;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        List<Integer> salaries = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            salaries.add(sc.nextInt());
        }

        List<Integer> updated = salaries.stream()
                .map(salary -> salary + salary / 10)
                .collect(Collectors.toList());

        updated.forEach(salary -> System.out.print(salary + " "));
    }
}