import java.util.*;

public class Task18_JavaFactory {
    interface Food {
        String getType();
    }

    static class Pizza implements Food {
        public String getType() {
            return "The factory returned class Pizza";
        }
    }

    static class Cake implements Food {
        public String getType() {
            return "The factory returned class Cake";
        }
    }

    static class FoodFactory {
        Food getFood(String order) {
            if (order.equalsIgnoreCase("pizza"))
                return new Pizza();
            return new Cake();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String order = sc.next();

        FoodFactory factory = new FoodFactory();
        Food food = factory.getFood(order);

        System.out.println("The factory returned class " + food.getClass().getSimpleName());
        System.out.println("Food is " + food.getType().split(" ")[3].toLowerCase());
    }
}

/*
INPUT:
pizza

OUTPUT:
The factory returned class Pizza
Food is pizza
*/