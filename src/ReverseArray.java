import java.util.Scanner;

/**
 * Write a Java program to reverse an array of integer values
 */
public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.println("Enter the number of array : ");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        reverseArray(array);
        System.out.println("Reverse Array : ");
        for (int i = 0; i < length; i++) {
            System.out.println(array[i] + "  ");
        }
    }
    public static void reverseArray(int [] array){
        int start = 0;
        int end = array.length-1;
        while (start<end){
            int temp = array[start];
            array[start] = array [end];
            array [end] = temp;
            start++;
            end--;
        }
    }
}
