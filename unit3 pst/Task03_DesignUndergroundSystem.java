import java.util.*;

public class Task03_DesignUndergroundSystem {
    static class CheckIn {
        String station;
        int time;

        CheckIn(String station, int time) {
            this.station = station;
            this.time = time;
        }
    }

    static class Stats {
        double totalTime;
        int count;

        void add(int time) {
            totalTime += time;
            count++;
        }

        double average() {
            return totalTime / count;
        }
    }

    static class UndergroundSystem {
        Map<Integer, CheckIn> checkIns = new HashMap<>();
        Map<String, Stats> trips = new HashMap<>();

        void checkIn(int id, String stationName, int t) {
            checkIns.put(id, new CheckIn(stationName, t));
        }

        void checkOut(int id, String stationName, int t) {
            CheckIn in = checkIns.remove(id);
            String key = in.station + "->" + stationName;

            trips.putIfAbsent(key, new Stats());
            trips.get(key).add(t - in.time);
        }

        double getAverageTime(String startStation, String endStation) {
            return trips.get(startStation + "->" + endStation).average();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UndergroundSystem system = new UndergroundSystem();

        int q = sc.nextInt();

        while (q-- > 0) {
            String operation = sc.next();

            if (operation.equals("checkIn")) {
                system.checkIn(sc.nextInt(), sc.next(), sc.nextInt());
            } else if (operation.equals("checkOut")) {
                system.checkOut(sc.nextInt(), sc.next(), sc.nextInt());
            } else {
                System.out.printf("%.5f%n",
                    system.getAverageTime(sc.next(), sc.next()));
            }
        }
    }
}

/*
INPUT:
5
checkIn 1 A 3
checkIn 2 A 8
checkOut 1 B 15
checkOut 2 B 20
getAverage A B

OUTPUT:
12.00000
*/