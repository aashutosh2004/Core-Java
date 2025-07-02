import java.util.HashMap;
import java.util.Scanner;

public class countryCapital_HashMap {
    public static void main(String[] args) {
        // Create a HashMap to store country-capital pairs
        HashMap<String, String> countryCapitalMap = new HashMap<>();

        // Adding some countries and their capitals to the map
        countryCapitalMap.put("India", "New Delhi");
        countryCapitalMap.put("USA", "Washington, D.C.");
        countryCapitalMap.put("France", "Paris");
        countryCapitalMap.put("Japan", "Tokyo");
        countryCapitalMap.put("Germany", "Berlin");

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Check if a specific country exists in the map
        System.out.print("Enter a country to check: ");
        String country = scanner.nextLine();

        if (countryCapitalMap.containsKey(country)) {
            System.out.println("Country exists! Capital: " + countryCapitalMap.get(country));
        } else {
            System.out.println("Country does not exist in the map.");
        }

        // Check if a specific capital exists in the map
        System.out.print("Enter a capital to check: ");
        String capital = scanner.nextLine();

        if (countryCapitalMap.containsValue(capital)) {
            System.out.println("Capital exists in the map!");
        } else {
            System.out.println("Capital does not exist in the map.");
        }

        scanner.close();
    }
}
