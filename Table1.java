import java.util.Scanner;

public class Table1 {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to display its multiplication table: ");

        // Read the number from the user
        int number = sc.nextInt();

        

        // Display the multiplication table
        System.out.println("Multiplication Table for " + number + ":");

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }
}
