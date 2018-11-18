/*
 CIS 331 Section 2 
 Group Project Part 1.
 Authors: Zach Beatty, Eric Carter, Mercy Clemente, & Troy Goddard
 */

package project331;
import java.util.*;
public class Main {

        public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int choice=0;
        int choice2=0;
        int choice3=0;
        
        int customerCount = 0;
        int vendorCount = 0;
        int saleCount = 0;
        int itemCount = 0;
        
        int customerSelect = 0;
        int vendorSelect = 0;
        
        Customer[] customerArray = new Customer[10];
        Vendor[] vendorArray = new Vendor[10];
        Sale[] saleArray = new Sale[10];
        Item[] itemArray = new Item[10];
        //menu
        do{  
    
        mainMenu(); 
        choice = in.nextInt();
        
       switch (choice) {
            //id report
                case 1:
                    reportMenuOptions();
                    choice2 = in.nextInt();
                    break;
            //item purchase history
                case 2:
                    itemPurchaseHistory(itemArray);
                    break;
            //current inventory levels
                case 3:
                    printCurrInventory(itemArray);
                    break;
            //create new menu
                case 4:
                    createMenu();
                    choice2 = in.nextInt();
            
         //create new sub menu
            switch (choice2) {
            //create customer
                case 1:
                    customerCount++;
                    customerArray[customerCount] = addCustomer();
                    break;
            //create vendor
                case 2:
                    vendorCount++;
                    vendorArray[vendorCount] = addVendor();
                    break;
            //create inventory item
                case 3:
                    itemCount++;
                    itemArray[itemCount] = addItem();
                    break;
            //create sale
                case 4:
                    saleCount++;
                    saleArray[saleCount] = addSale();
                    break;
                default:
                    break;
            }
        }
        
        
         else if(choice == 5)//edit main menu
        {
           editMenu(); 
            choice3 = in.nextInt();
            
            //edit sub menu
            switch (choice3) {
            //edit existing customer
                case 1:
                    System.out.println("Please select customer to edit");
                    customerSelect = in.nextInt();
                    editCustomer(customerArray[customerSelect]);
                    break;
            //edit existing inventory item
                case 2:
                    System.out.println("Enter the Item Number to Edit: ");
                    inventorySelect = in.nextInt();
                    editInventory(itemArray[inventorySelect]);
                    break;
            //edit existing vendor
                case 3:
                    System.out.println("Please select vendor to edit");
                    vendorSelect = in.nextInt();
                    editVendor(vendorArray[vendorSelect]);
                    break;
                default:
                    break;
            }
            
        }
        
        else if(choice == 6)//print receipt
        {
            System.out.println("Enter the Sale ID: ");
            int IDChoice = in.nextInt();
            saleArray[IDChoice].printReceipt();
        }

      } while (choice != 7);//end loop
        
    }
    //Method for main menu 
public static void mainMenu()
 {
     System.out.print("\tMain Menu Options \n==============================="
     + " \n1. ID Report: \n2. Item Purchase History: \n3. Current Inventory "
     + "Level: \n4. Create... \n5. Edit... \n6. Print Receipt: \n7. Exit"
     + "\nEnter Your Choice: #");     
 }
 
//Method for creating menu options 
public static void createMenu()
{
    System.out.print("Menu Options to Create \n============================="
    + "\n1. Create New Customer:\n2. Create New Vendor:\n3. Create New Item:"
    + "\n4. Create New Sale: \nEnter Your Choice: #"); 
 }
 
//Method for Edit menu Options 
public static void editMenu ()
{
    System.out.print("Edit Menu Options \n==================================="
     + "\n1. Edit Existing Customer:\n2. Edit Existing Inventory Item: \n3. "
     + "Edit Existing Vendor: \nEnter Your Choice: #");
}

//method for report options 
public static void reportMenuOptions()
{
    System.out.print("Report Menu Options \n================================="
    + "\n1. Report for Customer Purchase History: \n2. Report for Items:"
    + "\n3. Report for Quantities: \n4. Report for Total Purchase Cost:"
    + "\n5. Report for Purchase Dates: \nEnter Your Choice: #");
}

//method for creating a customer
    public static Customer addCustomer()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("First Name: ");
        String first = scan.nextLine();

        System.out.print("Last Name: ");
        String last = scan.nextLine();
        
        System.out.print("Street: ");
        String street = scan.nextLine(); 
        
        System.out.print("City: ");
        String city = scan.nextLine();
        
        System.out.print("State: ");
        String state = scan.nextLine();
        
        System.out.print("Zip Code: ");
        int zip = scan.nextInt();
        
        System.out.print("Phone Number: #");
        long phone = scan.nextLong();
        
        Customer newC = new Customer("Tom", "Jones", "12 Devon Lane", 
        "Harrisonburg", "Va", 22801, 5408589999L);
        return newC;
    }
    
//method for editing a customer
public static void editCustomer(Customer c1)
    {
        boolean run = true;
        while(run)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please select from the following: \n==========="
              + "============= \n1. First Name: \n2. Last Name: \n3. Location: "
              + "\n4. Phone Number: \n5. Exit \n Enter Your Choice: #");
        
            int menu = scan.nextInt();
            String scanString = "";
            int scanInt = 0;
            long scanLong = 0;
            switch(menu)
            {
                case 1:
                {
                    System.out.print("Enter the new First Name:");
                    scan.nextLine();
                    scanString = scan.nextLine();
                    c1.setFirstName(scanString);
                    break;
                }
                case 2:
                {
                    System.out.print("Enter the new Last Name:");
                    scan.nextLine();
                    scanString = scan.nextLine();
                    c1.setLastName(scanString);
                    break;
                }
                case 3:
                {
                   System.out.print("Enter the street: ");
                    scan.nextLine();
                    scanString = scan.nextLine();
                    c1.setStreet(scanString); 
                    
                    // resets city value
                    System.out.print("Enter the new City:"); 
                    // to accept the <enter> from the previous scan
                    scan.nextLine(); 
                    scanString = scan.nextLine();
                    c1.setCity(scanString);    
                
                    // resets state value
                    System.out.print("Enter the new State:"); 
                    scanString = scan.nextLine();
                    c1.setState(scanString);
                    
                    //resets zip value 
                    System.out.print("Enter the new Zip Code:"); 
                    scanInt = scan.nextInt();
                    c1.setZip(scanInt);
                    break;
                }

                case 4:
                {
                    System.out.print("Enter the new Phone Number:");
                    scanLong = scan.nextLong();
                    c1.setPhoneNumber(scanInt);
                    break;
                }
                case 5:
                {
                    run = false;
                    break;
                }
                default:
                {
                    run = false;
                    break;
                }
            }
        }
    }
 
 //method to edit inventory item
 public static void editInventory(Item i1)
 {
     Scanner scan = new Scanner(System.in);
        boolean run = true;
        while (run)
        {
          System.out.println("Select From the Following:\n---------------------"
          + "------\n1.Edit the Name:\n2.Edit the Weight:\n3.Edit the Descripti"
          + "on:\n4.Edit the Purchase Price:\n5.Edit the Selling Price:\nEnter "
          + "Your Choice: ");
     
            int menu = scan.nextInt();
            switch(menu)
            {
                case 1:
                {
                    System.out.print("Enter the new name:");
                    String newName = scan.nextLine();
                    i1.getItemName();
                    break;
                }
                case 2:
                {
                    System.out.print("Enter the new weight:");
                    double newWeight = scan.nextDouble();
                    i1.setWeight(newWeight);
                    break;
                }
                case 3:
                {
                    System.out.print("Enter the new Description:");
                    String newDescription = scan.nextLine();
                    i1.setDescription(newDescription);
                   break;
                    }
                case 4: 
                {
                    System.out.print("Enter the new purchase price: $");
                    double newPPrice = scan.nextDouble();
                   i1.setpurchasePrice(newPPrice);
                   break;
                }
                case 5:
                {
                    System.out.print("Enter the new selling price: $");
                    double newSPrice = scan.nextDouble();
                    i1.setSellingPrice(newSPrice);
                    break;
                }
                case 6:
                {
                    run = false;
                    break;
                }
                default:
                {
                    run = false;
                    break;
                }
            }
        }       
 }
    
//method for adding a sale    
public static Sale addSale()
{
    Scanner scan = new Scanner(System.in);
    System.out.println("Item ID: ");
    int itemID = scan.nextInt();

    System.out.println("Item Name: ");
    String itemName = scan.nextLine();

    System.out.println("Selling Price: ");
    double sellingPrice = scan.nextDouble();

    System.out.println("Quantity: ");
    int quantity = scan.nextInt();

    System.out.println("Customer name: ");
    String customer = scan.nextLine();

    System.out.println("Date of Sale: ");
    String date = scan.nextLine();

    Sale newS = new Sale(itemID, itemName, sellingPrice, quantity, customer, date);
    return newS;
}    
        
//method for adding a vendor
public static Vendor addVendor()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Business Name: ");
        String businessName = scan.nextLine();

        System.out.print("Street: ");
        String street = scan.nextLine(); 
        
        System.out.print("City: ");
        String city = scan.nextLine();
        
        System.out.print("State: ");
        String state = scan.nextLine();
        
        System.out.print("Enter Zip: ");
        int zip = scan.nextInt(); 
        
        System.out.print("Phone Number: ");
        long phoneNumber = scan.nextLong();
        
        Vendor v = new Vendor(businessName, street, city, state, zip, 
                phoneNumber);
        return v;
    }

//method for editing a vendor
public static void editVendor(Vendor v1)
    {
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        while (run)
        {
            System.out.println("Please select from the following: \n==========="
             + "============\n1. Business Name: \n2. Business Address: "
             + "3. Phone Number: \n4. Exit: \nEnter Your Choice: #");
            
            int menu = scan.nextInt();
            switch(menu)
            {
                case 1:
                {
                    System.out.print("Enter the new name:");
                    scan.nextLine();
                    String newName = scan.nextLine();
                    v1.setBusinessName(newName);
                    break;
                }
                case 2:
                {
                    System.out.print("Enter the new street address:");
                    scan.nextLine();
                    String newStreet = scan.nextLine();
                    v1.setStreet(newStreet);
                    
                    System.out.print("Enter the new city");
                    //scan.nextLine();
                    String newCity = scan.nextLine();
                    v1.setCity(newCity);
                    
                    System.out.print("Enter the new state");
                    //scan.nextLine();
                    String newState = scan.nextLine();
                    v1.setState(newState);
                }
                case 3:
                {
                    System.out.print("Enter the new phone number:");
                    scan.nextLine();
                    long newPhone = scan.nextLong();
                    v1.setPhoneNumber(newPhone);
                }
                case 4:
                {
                    run = false;
                    break;
                }
                default:
                {
                    run = false;
                    break;
                }
            }
        }
    }
  
 //method to print current inventory levels
    public static void printCurrInventory(Item [] itemArray)
    {
        System.out.println("\n============ Current Items in Inventory ========="
          + "===\n---------------------------------------------------- "
          + "\nItem Name: \t Item ID: \tQuantity:"); 
            for (int i=0; i<itemArray.length; i++)
            {
                 System.out.println(itemArray[i]);
            }
            System.out.println("");
    }
 //method to create an item
 public static Item addItem()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Item Name: ");
        String itemName = scan.nextLine();
        System.out.print("Enter the item weight: ");
        double itemWeight = scan.nextDouble();
        System.out.print("Enter the item description: ");
        String itemDescription = scan.nextLine();
        System.out.print("Enter the purchase price: ");
        double pPrice = scan.nextDouble();
        System.out.print("Enter the Selling price: ");
        double sellingPrice = scan.nextDouble(); 
        
        Item returnItem = new Item(itemName, itemWeight, itemDescription,pPrice,
        sellingPrice);
        return returnItem;
    }
 
  //Method for item purchase history
 public static void itemPurchaseHistory(Item [] itemArray)
 {
    Scanner in = new Scanner (System.in); 
    int historyID=0; 
    printCurrInventory(itemArray); 
    System.out.print("Enter the ID to View the Item's Purchase History: #");
    historyID=in.nextInt(); 
    System.out.println("\tPurchase History for Item #" + historyID + "\n-----"
            + "-------------------------------------------\n");
  
 }
}
