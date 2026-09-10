import java.util.*;

public class Task05_TimeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.next();

        int hour = Integer.parseInt(time.substring(0, 2));
        String ampm = time.substring(8);

        if (ampm.equals("AM")) {
            if (hour == 12) hour = 0;
        } else {
            if (hour != 12) hour += 12;
        }

        System.out.printf("%02d%s%n", hour, time.substring(2, 8));
    }
}

/*
INPUT:
07:05:45PM

OUTPUT:
19:05:45
*/