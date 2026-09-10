import java.util.*;

public class Task07_JavaInheritance1 {
    static class Animal {
        void walk() {
            System.out.println("I am walking");
        }
    }

    static class Bird extends Animal {
        void fly() {
            System.out.println("I am flying");
        }
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
    }
}

/*
INPUT:
No input

OUTPUT:
I am walking
I am flying
*/