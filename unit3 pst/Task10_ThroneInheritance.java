import java.util.*;

public class Task10_ThroneInheritance {
    static class Person {
        String name;
        boolean alive = true;
        List<Person> children = new ArrayList<>();

        Person(String name) {
            this.name = name;
        }
    }

    static class ThroneInheritance {
        Map<String, Person> people = new HashMap<>();
        Person king;

        ThroneInheritance(String kingName) {
            king = new Person(kingName);
            people.put(kingName, king);
        }

        void birth(String parentName, String childName) {
            Person parent = people.get(parentName);
            Person child = new Person(childName);
            parent.children.add(child);
            people.put(childName, child);
        }

        void death(String name) {
            people.get(name).alive = false;
        }

        void dfs(Person person, List<String> order) {
            if (person.alive)
                order.add(person.name);

            for (Person child : person.children)
                dfs(child, order);
        }

        List<String> getInheritanceOrder() {
            List<String> order = new ArrayList<>();
            dfs(king, order);
            return order;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ThroneInheritance throne = new ThroneInheritance(sc.next());

        int q = sc.nextInt();

        while (q-- > 0) {
            String operation = sc.next();

            if (operation.equals("birth")) {
                throne.birth(sc.next(), sc.next());
            } else if (operation.equals("death")) {
                throne.death(sc.next());
            } else {
                System.out.println(throne.getInheritanceOrder());
            }
        }
    }
}

/*
INPUT:
king
7
birth king andy
birth king bob
birth andy matt
getOrder
death andy
getOrder
birth bob alex

OUTPUT:
[king, andy, matt, bob]
[king, matt, bob]
*/