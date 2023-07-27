package Adarsh;

import java.util.Scanner;

public class Drinks {
	// Define variables to store the prices of different Drinks, the user's choice, quantity, and the total cost.
	Scanner sc = new Scanner(System.in);
	 int a = 100,// Price for Lassi
		 b = 100,// Price for ButterMilk
		 c = 120,// Price for Thandai
		 d = 100,// Price for Coco Cola
		 e = 100,// Price for Sprite
		 choice,// Variable to store the user's choice of Drink
		 quantity,// Variable to store the desired quantity of the selected Drink
		 total=0;// Variable to store the total cost of the order
    String orders="";// Variable to store the ordered items as a string.
    
 // Method to handle the Drink selection and ordering process 	     
	 public void Drink() {
		 
		 System.out.println("You have Selected Drinks\n"); 
		 System.out.println("1. Lassi               " + a + "/-");
         System.out.println("2. ButterMilk          " + b + "/-");
         System.out.println("3. Thandai             " + c + "/-");
         System.out.println("4. Coco Cola           " + d + "/-");
         System.out.println("5. Sprite              " + e + "/-");
         System.out.print("\nEnter Your Choice :\n ");
         choice = sc.nextInt();// Read the user's choice from the console input.
         
         switch (choice) {
             case 1:// Lassi
            	 System.out.println("You have Selected  Lassi");
                 System.out.println(" ");
                 System.out.println("Enter the desiered Quantity : ");
                 quantity = sc.nextInt();// Read the quantity of the selected Drink.
                 total = total + quantity * a;// Calculate the cost for the selected quantity.
                 orders+="Lassi                   " + total +"/-"+"           "+ quantity +"\n";// Adding the order details to the 'orders' string

                 break;

             case 2:// ButterMilk
                 System.out.println("You have Selected  ButterMilk");
                 System.out.println();
                 System.out.println("Enter the desiered Quantity : ");
                 quantity = sc.nextInt();// Read the quantity of the selected Drink.
                 total = total + quantity * b;// Calculate the cost for the selected quantity.
                 orders+="ButterMilk              " + total +"/-"+"           "+ quantity +"\n";// Adding the order details to the 'orders' string

                 break;

             case 3:// Thandai
                 System.out.println("You have Selected Thandai");
                 System.out.println();
                 System.out.println("Enter the desiered Quantity : ");
                 quantity = sc.nextInt();// Read the quantity of the selected Drink.
                 total = total + quantity * c;// Calculate the cost for the selected quantity.
                 orders+="Thandai                 " + total +"/-"+"           "+ quantity +"\n";// Adding the order details to the 'orders' string

                 break;
                 
             case 4:// Coco Cola
                 System.out.println("You have Selected Coco Cola");
                 System.out.println();
                 System.out.println("Enter the desiered Quantity : ");
                 quantity = sc.nextInt();// Read the quantity of the selected Drink.
                 total = total + quantity * d;// Calculate the cost for the selected quantity.
                 orders+="Coco Cola               " + total +"/-"+"           "+ quantity +"\n";// Adding the order details to the 'orders' string

                 break;
                 
             case 5:// Sprite
                 System.out.println("You have Selected Sprite");
                 System.out.println();
                 System.out.println("Enter the desiered Quantity : ");
                 quantity = sc.nextInt();// Read the quantity of the selected Drink.
                 total = total + quantity * e;// Calculate the cost for the selected quantity.
                 orders+="Sprite                  " + total +"/-"+"           "+ quantity +"\n";// Adding the order details to the 'orders' string

                 break;
                 
             default:
               	System.out.println();
       			System.out.println("Invalid Choice Please Order Again");
       			System.out.println();
       			Drink();// If the user enters an invalid choice, ask them to order again.
       			break;
                 
         }
         
        
	 }
	 
}



        
    
