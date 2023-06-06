package homework_week_5;
/**
 * Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TrainStation {
    public static void main(String[] args) {
        Map<String, String[]> stations = new HashMap<>();
        stations.put("Piccadilly", new String[]{"Bakerloo Line", "Piccadilly Line"});
        stations.put("Baker Street", new String[]{"Bakerloo Line", "Circle Line", "Hammersmith & City Line", "Jubilee Line", "Metropolitan Line"});
        stations.put("Bank", new String[]{"Central Line", "Northern Line", "Waterloo & City Line"});
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the station name: ");
        String stationName = scanner.nextLine();

        if (stations.containsKey(stationName)) {
            String[] lines = stations.get(stationName);
            System.out.println("The following lines pass through " + stationName + ":");
            for (String line : lines) {
                System.out.println(line);
            }
        } else {
            System.out.println("Station not found.");
        }
    }
}
