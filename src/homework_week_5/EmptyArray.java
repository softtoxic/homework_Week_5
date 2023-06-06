package homework_week_5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a Java program to test if an array list is empty or not.
 */
public class EmptyArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter elements (type 'done' to stop): ");

        String input = scanner.nextLine();
        while (!input.equalsIgnoreCase("done")) {
            list.add(input);
            input = scanner.nextLine();
        }

        if (list.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty. It contains " + list.size() + " elements.");
        }
    }
}








