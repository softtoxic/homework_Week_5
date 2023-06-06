package homework_week_5;
/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map
 */

import java.util.HashMap;
import java.util.Map;

public class Programme_9 {
    public static void main(String[] args) {
        Map<String, Integer> people = new HashMap<>();
        people.put("Jaydip", 10);
        people.put("Jenish", 20);
        people.put("Vipul", 30);
        people.put("Ketan", 40);
        System.out.println("Using for loop : ");
        for (Integer result : people.values()) {
            System.out.println(result);
        }
        System.out.println("Using while loop : ");
        java.util.Collection<Integer> values = people.values();
        java.util.Iterator<Integer> iterator = values.iterator();
        while (iterator.hasNext()) {
            Integer result = iterator.next();
            System.out.println(result);
        }
        System.out.println("Using if-else loop : ");
        for (Integer result : people.values()) {
            if (result < 20) {
                System.out.println(result + " is less than 20");
            } else {
                System.out.println(result + " is greater than or equal to 20 ");
            }
        }
    }
}
