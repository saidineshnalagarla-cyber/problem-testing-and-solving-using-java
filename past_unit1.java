```java
// ==================== TASK 1 ====================

import java.util.*;

public class Main {
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


// ==================== TASK 2 ====================

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Map<String, List<Double>> data = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String id = sc.next();
            double temp = sc.nextDouble();

            if (temp > 50) {
                data.computeIfAbsent(id, k -> new ArrayList<>()).add(temp);
            }
        }

        data.entrySet()
                .stream()
                .map(e -> new AbstractMap.SimpleEntry<>(
                        e.getKey(),
                        e.getValue().stream()
                                .mapToDouble(Double::doubleValue)
                                .average()
                                .orElse(0)
                ))
                .sorted((a, b) -> Double.compare(b.getValue(), a.getValue()))
                .forEach(e -> System.out.println(
                        e.getKey() + " " + e.getValue()
                ));
    }
}


// ==================== TASK 3 ====================

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int current = arr[0];
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            current = Math.max(arr[i], current + arr[i]);
            max = Math.max(max, current);
        }

        System.out.println(max);
    }
}


// ==================== TASK 4 ====================

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String pattern = sc.nextLine();

        int[] lps = new int[pattern.length()];

        for (int i = 1, len = 0; i < pattern.length();) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                lps[i++] = ++len;
            } else if (len > 0) {
                len = lps[len - 1];
            } else {
                lps[i++] = 0;
            }
        }

        for (int i = 0, j = 0; i < text.length();) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;

                if (j == pattern.length()) {
                    System.out.print((i - j) + " ");
                    j = lps[j - 1];
                }
            } else if (j > 0) {
                j = lps[j - 1];
            } else {
                i++;
            }
        }
    }
}


// ==================== TASK 5 ====================

import java.util.*;

class BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        BankAccount account = new BankAccount();

        for (int i = 0; i < n; i++) {
            String[] operation = sc.nextLine().split(" ");
            double amount = Double.parseDouble(operation[1]);

            if (operation[0].equals("Deposit")) {
                account.deposit(amount);
            } else {
                account.withdraw(amount);
            }
        }

        System.out.println((int) account.getBalance());
    }
}


// ==================== TASK 6 ====================

import java.util.*;

abstract class Vehicle {
    abstract int calculateFare(int distance);
}

class Bike extends Vehicle {
    int calculateFare(int distance) {
        return distance * 5;
    }
}

class Auto extends Vehicle {
    int calculateFare(int distance) {
        return distance * 12;
    }
}

class Cab extends Vehicle {
    int calculateFare(int distance) {
        return distance * 12;
    }
}

class Driver {
    String name;

    Driver(String name) {
        this.name = name;
    }
}

class Rider {
    String name;

    Rider(String name) {
        this.name = name;
    }
}

class Trip {
    private Vehicle vehicle;

    Trip(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    int getFare(int distance) {
        return vehicle.calculateFare(distance);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Map<String, Vehicle> vehicles = new HashMap<>();
        vehicles.put("Bike", new Bike());
        vehicles.put("Auto", new Auto());
        vehicles.put("Cab", new Cab());

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int distance = sc.nextInt();

            Trip trip = new Trip(vehicles.get(type));

            System.out.println(trip.getFare(distance));
        }
    }
}


// ==================== TASK 7 ====================

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
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


// ==================== TASK 8 ====================

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            graph.put(i, new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        int source = sc.nextInt();
        int destination = sc.nextInt();

        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.add(source);
        visited.add(source);

        while (!queue.isEmpty()) {
            int current = queue.poll();

            graph.get(current)
                    .stream()
                    .filter(node -> !visited.contains(node))
                    .forEach(node -> {
                        visited.add(node);
                        queue.add(node);
                    });
        }

        System.out.println(
                visited.contains(destination) ? "YES" : "NO"
        );
    }
}


// ==================== TASK 9 ====================

import java.util.*;

class Calculator {
    static int add(int a, int b) {
        return a + b;
    }

    static int divide(int a, int b) {
        return a / b;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String operator = sc.next();
        int b = sc.nextInt();

        boolean result;

        if (operator.equals("+")) {
            result = Calculator.add(a, b) == a + b;
        } else {
            try {
                result = Calculator.divide(a, b) == a / b;
            } catch (ArithmeticException e) {
                result = false;
            }
        }

        System.out.println(
                result ? "Test Passed" : "Test Failed"
        );
    }
}


// ==================== TASK 10 ====================

import java.util.*;
import java.util.stream.*;

class LoginSystem {
    static boolean validate(String username, String password) {
        return username.length() >= 3 &&
                username.length() <= 20 &&
                password.length() >= 6 &&
                password.length() <= 20 &&
                username.equals("admin") &&
                password.equals("admin123");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        IntStream.range(0, n)
                .mapToObj(i -> new String[]{
                        sc.next(),
                        sc.next()
                })
                .forEach(login -> {
                    try {
                        boolean valid = LoginSystem.validate(
                                login[0],
                                login[1]
                        );

                        System.out.println(
                                valid ? "SUCCESS" : "FAILURE"
                        );
                    } catch (Exception e) {
                        System.out.println("FAILURE");
                    }
                });
    }
}
```
