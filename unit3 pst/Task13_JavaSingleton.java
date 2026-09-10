import java.util.*;

public class Task13_JavaSingleton {
    static class Singleton {
        private static Singleton instance;
        private Singleton() {}

        static Singleton getSingleInstance() {
            if (instance == null)
                instance = new Singleton();

            return instance;
        }

        String str;

        void setStr(String str) {
            this.str = str;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Singleton singleton = Singleton.getSingleInstance();
        singleton.setStr(input);

        System.out.println(singleton.str);
    }
}

/*
INPUT:
Hello Singleton

OUTPUT:
Hello Singleton
*/