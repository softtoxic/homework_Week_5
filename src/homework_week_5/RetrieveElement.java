package homework_week_5;
/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */

import java.util.ArrayList;
import java.util.Scanner;

public class RetrieveElement {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of element to retrieve : ");
        int number = scanner.nextInt();
        if (number >= 0 && number< numbers.size()){
            int element = numbers.get(number);
            System.out.println("Element at number " + number+ " : " + element);
        }else {
            System.out.println("Invalid number ");
        }
        scanner.close();
    }
}
