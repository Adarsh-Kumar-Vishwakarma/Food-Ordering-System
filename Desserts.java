package Adarsh;

import java.util.Scanner;

public class Desserts {
    // Define variables to store the prices of different Desserts, the user's choice, quantity, and the total cost.
	Scanner sc = new Scanner(System.in);
	 int a = 150,// Price for Gulab_Jamun
		 b = 180,// Price for Rasmalai
		 c = 120,// Price for Jalebi
		 d = 100,// Price for Kulfi
		 e = 200,// Price for Kheer
		 choice,// Variable to store the user's choice of Dessert
		 quantity,// Variable to store the desired quantity of the selected Dessert
		 total=0;// Variable to store the total cost of the order
    String orders="";// Variable to store the ordered items as a string.
    
 // Method to handle the Dessert selection and ordering process     
	 public void Dessert() {
		
		 System.out.println("You have Selected Desserts\n"); 
		 System.out.println("1. Gulab_Jamun         " + a + "/-");
         System.out.println("2. Rasmalai            " + b + "/-");
         System.out.println("3. Jalebi              " + c + "/-");
         System.out.println("4. Kulfi               " + d + "/-");
         System.out.println("5. Kheer               " + e + "/-");
         System.out.print("\nEnter Your Choice :\n ");
         choice = sc.nextInt();// Read the user's choice from the console input.
         
         switch (choice) {
             case 1:// Gulab_Jamun
            	 System.out.println("You have Selected  Gulab_Jamun");
                 System.out.println(" ");
                 System.out.println("Enter the desiered Quantity : ");
                 quantity = sc.nextInt();// Read the quantity of the selected Dessert.
                 total = total + quantity * a;// Calculate the cost for the selected quantity.
                 orders+="Gulab_Jamun             " + total +"/-"+"           "+ quantity +"\n";// Adding the order details to the 'orders' string

                 break;

             case 2:// Rasmalai
                 System.out.println("You have Selected  Rasmalai");
                 System.out.println();
                 System.out.println("Enter the desiered Quantity : ");
                 quantity = sc.nextInt();// Read the quantity of the selected Dessert.
                 total = total + quantity * b;// Calculate the cost for the selected quantity.
                 orders+="Rasmalai                " + total +"/-"+"           "+ quantity +"\n";// Adding the order details to the 'orders' string

                 break;

             case 3:// Jalebi
                 System.out.println("You have Selected Jalebi");
                 System.out.println();
                 System.out.println("Enter the desiered Quantity : ");
                 quantity = sc.nextInt();// Read the quantity of the selected Dessert.
                 total = total + quantity * c;// Calculate the cost for the selected quantity.
                 orders+="Jalebi                  " + total +"/-"+"           "+ quantity +"\n";// Adding the order details to the 'orders' string

                 break;
                 
             case 4:// Kulfi
                 System.out.println("You have Selected Kulfi");
                 System.out.println();
                 System.out.println("Enter the desiered Quantity : ");
                 quantity = sc.nextInt();// Read the quantity of the selected Dessert.
                 total = total + quantity * d;// Calculate the cost for the selected quantity.
                 orders+="Kulfi                   " + total +"/-"+"           "+ quantity +"\n";// Adding the order details to the 'orders' string

                 break;
                 
             case 5:// Kheer
                 System.out.println("You have Selected Kheer");
                 System.out.println();
                 System.out.println("Enter the desiered Quantity : ");
                 quantity = sc.nextInt();// Read the quantity of the selected Dessert.
                 total = total + quantity * e;// Calculate the cost for the selected quantity.
                 orders+="Kheer                   " + total +"/-"+"           "+ quantity +"\n";// Adding the order details to the 'orders' string

                 break;
                 
             default:
             	System.out.println();
     			System.out.println("Invalid Choice Please Order Again");
     			System.out.println();
     			Dessert();// If the user enters an invalid choice, ask them to order again.
     			break;
                 
         }
         
        
	 }
	 
}



        
    
