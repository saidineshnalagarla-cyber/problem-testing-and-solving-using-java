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

public class task6 {
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
