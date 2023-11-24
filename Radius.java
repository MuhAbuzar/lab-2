import java.util.Scanner;

public class Radius {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the radius of the circle
        System.out.print("Enter the radius of the circle: ");

        // Read the radius from the user
        double radius = sc.nextDouble();

        

        // Calculate the circumference and area
        double circumference = 2 * 3.1417 * radius;
        double area = 3.1417 * radius*radius ;

        // Display the results
        System.out.println("Radius: " + radius);
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);
    }
}
