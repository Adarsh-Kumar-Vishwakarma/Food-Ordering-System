package Adarsh;
import java.util.*;

public class FoodOrdermain {
    // Variables for storing user choices, orders, and total bill
    int choice, quantity, total = 0;
    String again, orders = "";
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        FoodOrdermain fm = new FoodOrdermain();
        fm.displayMenu();
    }

    public void displayMenu() {
        // Display the restaurant menu
        System.out.println("************ Welcome To J.B's Restaurant ************");
        System.out.println("=====================================================");
        System.out.println("                  1.STARTERS           ");
        System.out.println("                  2.MAINCOURSE         ");
        System.out.println("                  3.DESSERTS           ");
        System.out.println("                  4.Drinks             ");
        System.out.println("=====================================================");
        System.out.println("          What Do you Want to Order Today??");

        System.out.println("Enter your choice :");
        choice = sc.nextInt();// Read the user's choice from the console input.

        // Process user's choice
        switch (choice) {
            case 1:
                Starters st = new Starters();
                st.Starter();
                orders = orders + st.orders;
                total = total + st.total;
                break;

            case 2:
                MainCourse ma = new MainCourse();
                ma.Maincourse();
                orders = orders + ma.orders;
                total = total + ma.total;
                break;

            case 3:
                Desserts de = new Desserts();
                de.Dessert();
                orders = orders + de.orders;
                total = total + de.total;
                break;

            case 4:
                Drinks dr = new Drinks();
                dr.Drink();
                orders = orders + dr.orders;
                total = total + dr.total;
                break;

            default:
                System.out.println();
                System.out.println("Invalid Choice Please Order Again");
                System.out.println();
                displayMenu();
                break;
        }

        // Ask if the user wants to order anything else
        System.out.println();
        System.out.print("Do you wish to order anything else (Y/N) : \n");
        again = sc.next();// Read the user's choice from the console input.
        
        if (again.equalsIgnoreCase("Y")) {
            displayMenu();// If the user enters Y, ask them to order again.
        } else if (again.equalsIgnoreCase("N")) {
            GenerateBill();// If the user enters N, it wiil generate bill.
        } else {
            System.out.println();
            System.out.println("Invalid Choice Please Order Again");
            displayMenu();// If the user enters an invalid choice, ask them to order again.
        }
    }

    public void GenerateBill() {
        // Display the final bill with ordered items and total amount
        System.out.println();
        System.out.println("***************** Thankyou for Ordering ******************");
        System.out.println("\nItem You Ordered Today:- \n");
        System.out.println("     |ITEMS|          |AMOUNT|      |QUANTITY|\n");
        System.out.println(orders);
        System.out.println("****************Your Total Bill is : " + total + "******************");
    }
}
