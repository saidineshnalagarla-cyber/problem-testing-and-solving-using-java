import java.util.*;

public class Task02_JavaInstanceofKeyword {
    static class Student {}
    static class Rockstar {}
    static class Hacker {}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int students = 0;

        while (n-- > 0) {
            String type = sc.next();

            Object obj;

            if (type.equals("Student"))
                obj = new Student();
            else if (type.equals("Rockstar"))
                obj = new Rockstar();
            else
                obj = new Hacker();

            if (obj instanceof Student)
                students++;
        }

        System.out.println(students);
    }
}

/*
INPUT:
4
Student
Rockstar
Student
Hacker

OUTPUT:
2
*/