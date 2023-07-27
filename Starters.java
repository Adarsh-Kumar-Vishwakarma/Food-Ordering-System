package Adarsh;
import java.util.Scanner;

public class Starters {
    // Define variables to store the prices of different starters, the user's choice, quantity, and the total cost.
    Scanner sc = new Scanner(System.in);
    int a = 180, // Price for Dahi Papri Chaat
        b = 160, // Price for Sev Puri
        c = 150, // Price for Sweet Corn
        d = 160, // Price for Khaman Dhokla
        e = 120, // Price for Samosa Chaat
        choice, // Variable to store the user's choice of starter
        quantity, // Variable to store the desired quantity of the selected starter
        total = 0; // Variable to store the total cost of the order
   String orders = ""; // Variable to store the ordered items as a string.

    // Method to handle the starter selection and ordering process
    public void Starter() {
    	
        System.out.println("You have Selected Starters\n");
        System.out.println("1. Dahi Papri Chaat    " + a + "/-");
        System.out.println("2. Sev Puri            " + b + "/-");
        System.out.println("3. Sweet Corn          " + c + "/-");
        System.out.println("4. Khaman Dhokla       " + d + "/-");
        System.out.println("5. Samosa Chaat        " + e + "/-");
        System.out.print("\nEnter Your Choice :\n ");
        choice = sc.nextInt(); // Read the user's choice from the console input.

        switch (choice) {
            case 1: // Dahi Papri Chaat
                System.out.println("You have Selected Dahi Papri Chaat");
                System.out.println();
                System.out.println("Enter the desired Quantity : ");
                quantity = sc.nextInt(); // Read the quantity of the selected starter.
                total = total + quantity * a; // Calculate the cost for the selected quantity.
                orders += "Dahi Papri Chaat        " + total + "/-" + "           " + quantity + "\n";// Adding the order details to the 'orders' string

                break;

            case 2: // Sev Puri
                System.out.println("You have Selected Sev Puri");
                System.out.println();
                System.out.println("Enter the desired Quantity : ");
                quantity = sc.nextInt(); // Read the quantity of the selected starter.
                total = total + quantity * b; // Calculate the cost for the selected quantity.
                orders += "Sev Puri                " + total + "/-" + "           " + quantity + "\n";// Adding the order details to the 'orders' string

                break;

            case 3: // Sweet Corn
                System.out.println("You have Selected Sweet Corn");
                System.out.println();
                System.out.println("Enter the desired Quantity : ");
                quantity = sc.nextInt(); // Read the quantity of the selected starter.
                total = total + quantity * c; // Calculate the cost for the selected quantity.
                orders += "Sweet Corn              " + total + "/-" + "           " + quantity + "\n";// Adding the order details to the 'orders' string

                break;

            case 4: // Khaman Dhokla
                System.out.println("You have Selected Khaman Dhokla");
                System.out.println();
                System.out.println("Enter the desired Quantity : ");
                quantity = sc.nextInt(); // Read the quantity of the selected starter.
                total = total + quantity * d; // Calculate the cost for the selected quantity.
                orders += "Khaman Dhokla           " + total + "/-" + "           " + quantity + "\n";// Adding the order details to the 'orders' string

                break;

            case 5: // Samosa Chaat
                System.out.println("You have Selected Samosa Chaat");
                System.out.println();
                System.out.println("Enter the desired Quantity : ");
                quantity = sc.nextInt(); // Read the quantity of the selected starter.
                total = total + quantity * e; // Calculate the cost for the selected quantity.
                orders += "Samosa Chaat            " + total + "/-" + "           " + quantity + "\n";// Adding the order details to the 'orders' string

                break;

            default:
                System.out.println();
                System.out.println("Invalid Choice Please Order Again");
                System.out.println();
                Starter(); // If the user enters an invalid choice, ask them to order again.
                break;
        }
    }
}
