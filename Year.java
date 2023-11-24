import java.util.Scanner;

public class Year {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of years
        System.out.print("Enter the number of years: ");

        // Read the number of years from the user
        float years = sc.nextFloat();

       

        // Define constants for days in a year and months in a year
        final int DAYS_IN_YEAR = 365;

        // Convert years into months and days
        int totalDays = (int) (years * DAYS_IN_YEAR);
        int months = totalDays / 30;  // Assuming an average of 30 days per month
        

        // Display the result
        System.out.println(years + " years is approximately equal to:");
        System.out.println("Months: " + months);
        System.out.println("Days: " + totalDays);
    }
}
