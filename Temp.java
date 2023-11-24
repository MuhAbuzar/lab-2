import java.util.Scanner;

public class Temp {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the temperature in Celsius
        System.out.print("Enter the temperature in Celsius: ");

        // Read the temperature in Celsius from the user
        double celsius = sc.nextDouble();

        

        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Display the result
        System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit");
    }
}
