/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project331;

import java.util.*; 
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice=0; 
        int choice2; 
        int choice3;
        
        //Main Menu Options
        do { 
            mainMenu(); 
            choice = in.nextInt(); 
       
        } while (choice !=7); //End of loop 
        

    } 
    
//Method for main menu 
public static void mainMenu()
 {
     Scanner in = new Scanner (System.in);
     System.out.println("Main Menu Options \n==============================="
     + "\n1. ID Report: \n2. Item Purchase History: \n3. Current Inventory "
     + "Level:\n4. Create a New... \n5. Edit a... \n6. Print Receipt: \n7. Exit"
     + "\nEnter Your Choice: #");   
 }

//Method for creating menu options 
public static void createMenu()
{
    System.out.println("Menu Options to Create \n============================="
    + "\n1.Create New Customer:\n2.Create New Vendor:\n3.Create New Inventory "
    + "Item: \n4.Create New Sale: \nEnter Your Choice: #");
}

//Method for edit menu options 
public static void editMenu ()
{
    System.out.println("Edit Menu Options \n==================================="
     + "\n1. Edit Existing Customer:\n2. Edit Existing Inventory Item: \n3. "
     + "Edit Existing Vendor: \n Enter Your Choice:");
}

//method for report options 
public static void reportMenuOptions()
{
    System.out.println("Report Menu Options \n================================="
    + "\n1.Report for Customer Purchase History: \n2.Report for Items:"
    + "\n3.Report for Quantities: \n4. Report for Total Purchase Cost:"
    + "\n5. Report for Purchase Dates:");
}
    
} // end of class 
