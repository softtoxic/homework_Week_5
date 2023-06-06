package homework_week_5;
/**
 * Declare following two arrylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */

import java.util.ArrayList;

public class CompareArrayList {
    public static void main(String[] args) {
        ArrayList<String> color1 = new ArrayList<>();
        color1.add("Red");
        color1.add("Green");
        color1.add("Black");
        color1.add("White");
        color1.add("Pink");
        ArrayList<String> color2 = new ArrayList<>();
        color2.add("Red");
        color2.add("Green");
        color2.add("Black");
        color2.add("Pink");
        if (color1.equals(color2)) {
            System.out.println("The ArrayList color1 and color2 are equal");
        } else {
            System.out.println("The ArrayList color1 and color2 are not equal");
        }
    }
}
