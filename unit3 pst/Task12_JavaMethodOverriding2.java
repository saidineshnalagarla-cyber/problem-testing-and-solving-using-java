import java.util.*;

public class Task12_JavaMethodOverriding2 {
    static class Sports {
        String getName() {
            return "Generic Sports";
        }

        void getNumberOfTeamMembers() {
            System.out.println("Each team has n players in " + getName());
        }
    }

    static class Soccer extends Sports {
        @Override
        String getName() {
            return "Soccer Class";
        }

        @Override
        void getNumberOfTeamMembers() {
            System.out.println("Each team has 11 players in " + getName());
        }

        void printSuperclassName() {
            System.out.println(super.getName());
        }
    }

    public static void main(String[] args) {
        Soccer soccer = new Soccer();

        System.out.println(soccer.getName());
        soccer.getNumberOfTeamMembers();
        soccer.printSuperclassName();
    }
}

/*
INPUT:
No input

OUTPUT:
Soccer Class
Each team has 11 players in Soccer Class
Generic Sports
*/