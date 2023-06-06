package homework_week_5;
/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ColourOfArray {
    public ArrayList<String> colour;
    public ColourOfArray(){
        colour = new ArrayList<>();
    }
    public void addColours(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of colours : ");
        int numColours = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i<numColours; i++){
            System.out.println("Enter colour " +(i+1)+ " : ");
            String colors = scanner.nextLine();
            colour.add(colors);
        }
        scanner.close();
    }
    public void printColours(){
        System.out.println("Colours in the collection : ");
        for (String colours : colour){
            System.out.println(colours);
        }
    }

    public static void main(String[] args) {
        ColourOfArray obj = new ColourOfArray();
        obj.addColours();
        obj.printColours();
    }
}
