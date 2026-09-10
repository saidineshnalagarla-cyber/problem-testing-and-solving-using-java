import java.util.*;

public class Task01_DesignParkingSystem {
    static class ParkingSystem {
        int[] slots = new int[4];

        ParkingSystem(int big, int medium, int small) {
            slots[1] = big;
            slots[2] = medium;
            slots[3] = small;
        }

        boolean addCar(int carType) {
            if (slots[carType] > 0) {
                slots[carType]--;
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int big = sc.nextInt();
        int medium = sc.nextInt();
        int small = sc.nextInt();
        int q = sc.nextInt();

        ParkingSystem parking = new ParkingSystem(big, medium, small);

        while (q-- > 0)
            System.out.println(parking.addCar(sc.nextInt()));
    }
}

/*
INPUT:
1 1 0
3
1
2
3

OUTPUT:
true
true
false
*/