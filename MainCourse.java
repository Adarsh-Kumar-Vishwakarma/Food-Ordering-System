package Adarsh;

import java.util.Scanner;

public class MainCourse {
    // Define variables to store the prices of different MainCourse, the user's choice, quantity, and the total cost.
	Scanner sc = new Scanner(System.in);
	 int a = 180,// Price for Daal Khichadi
		 b = 200,// Price for Special Pulao
		 c = 160,// Price for Steam Rice
		 d = 190,// Price for Jeera Rice
		 e = 150,// Price for Hakka Noodles
		 choice,// Variable to store the user's choice of Maincourse
		 quantity,// Variable to store the desired quantity of the selected Maincourse
		 total=0;// Variable to store the total cost of the order
    String orders="";// Variable to store the ordered items as a string.
	
 // Method to handle the Maincourse selection and ordering process     
	 public void Maincourse() {
		
		 System.out.println("You have Selected MainCourse\n"); 
		 System.out.println("1. Daal Khichadi       " + a + "/-");
         System.out.println("2. Special Pulao       " + b + "/-");
         System.out.println("3. Steam Rice          " + c + "/-");
         System.out.println("4. Jeera Rice          " + d + "/-");
         System.out.println("5. Hakka Noodles       " + e + "/-");
         System.out.print("\nEnter Your Choice :\n ");
         choice = sc.nextInt();// Read the user's choice from the console input.
         
         switch (choice) {
             case 1:// Daal Khichadi
            	 System.out.println("You have Selected  Daal Khichadi");
                 System.out.println(" ");
                 System.out.println("Enter the desiered Quantity : ");
                 quantity = sc.nextInt();// Read the quantity of the selected Maincourse.
                 total = total + quantity * a;// Calculate the cost for the selected quantity.
                 orders+="Daal Khichadi           " + total +"/-"+"           "+ quantity +"\n";// Adding the order details to the 'orders' string

                 break;

             case 2:// Special Pulao
                 System.out.println("You have Selected  Special Pulao");
                 System.out.println();
                 System.out.println("Enter the desiered Quantity : ");
                 quantity = sc.nextInt();// Read the quantity of the selected Maincourse.
                 total = total + quantity * b;// Calculate the cost for the selected quantity.
                 orders+="Special Pulao           " + total +"/-"+"           "+ quantity +"\n";// Adding the order details to the 'orders' string

                 break;

             case 3:// Steam Rice
                 System.out.println("You have Selected Steam Rice");
                 System.out.println();
                 System.out.println("Enter the desiered Quantity : ");
                 quantity = sc.nextInt();// Read the quantity of the selected Maincourse.
                 total = total + quantity * c;// Calculate the cost for the selected quantity.
                 orders+="Steam Rice              " + total +"/-"+"           "+ quantity +"\n";// Adding the order details to the 'orders' string

                 break;
                 
             case 4:// Jeera Rice
                 System.out.println("You have Selected Jeera Rice");
                 System.out.println();
                 System.out.println("Enter the desiered Quantity : ");
                 quantity = sc.nextInt();// Read the quantity of the selected Maincourse.
                 total = total + quantity * d;// Calculate the cost for the selected quantity.
                 orders+="Jeera Rice              " + total +"/-"+"           "+ quantity +"\n";// Adding the order details to the 'orders' string

                 break;
                 
             case 5:// Hakka Noodles
                 System.out.println("You have Selected Hakka Noodles");
                 System.out.println();
                 System.out.println("Enter the desiered Quantity : ");
                 quantity = sc.nextInt();// Read the quantity of the selected Maincourse.
                 total = total + quantity * e;// Calculate the cost for the selected quantity.
                 orders+="Hakka Noodles           " + total +"/-"+"           "+ quantity +"\n";// Adding the order details to the 'orders' string

                 break;
                 
             default:
              	System.out.println();
      			System.out.println("Invalid Choice Please Order Again");
      			System.out.println();
      			Maincourse();// If the user enters an invalid choice, ask them to order again.
      			break;
                 
         }
         
        
	 }
	 
}



        
    
