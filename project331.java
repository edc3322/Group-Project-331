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
        int customerSelect = 0;
        int vendorSelect = 0;
        Customer[] customer = new Customer[4];
        Vendor[] vendor = new Vendor[3];
        //menu
        do{  
    
        mainMenu(); 
        choice = in.nextInt();
        
        if (choice == 1)//id report
        {
           reportMenuOptions(); 
           choice2 = in.nextInt();  
        }
        
        else if(choice == 2)//item purchase history
        {
            
        }

        else if(choice == 3)//current inventory levels
        {
            
        }
        
        else if(choice == 4)//create new menu
        {
            createMenu();
            choice2 = in.nextInt();
            
            //create new sub menu
            if(choice2 == 1)//create customer
            {
                customerCount++;
                customer[customerCount] = addCustomer();
            }
            
            else if(choice2 == 2)//create vendor
            {
                vendorCount++;
                vendor[vendorCount] = addVendor();
            }
            
            else if(choice2 == 3)//create inventory item
            {
                Item.addItem("Lamp", 3, "White side lamp", 10, 49.99);
            }
            
            else if(choice2 == 4)//create sale
            {
            
            }
        }
        
        else if(choice == 5)//edit main menu
        {
           editMenu(); 
            choice3 = in.nextInt();
            
            //edit sub menu
            if(choice3 == 1)//edit existing customer
            {
                System.out.println("Please select customer to edit");
                customerSelect = in.nextInt();
                editCustomer(customer[customerSelect]);
            }
            
            else if(choice3 == 2)//edit existing inventory item
            {
            
            }
            
            else if(choice3 == 3)//edit existing vendor
            {
                System.out.println("Please select vendor to edit");
                vendorSelect = in.nextInt();
                editVendor(vendor[vendorSelect]);
            }
            
        }
        
        else if(choice == 6)//print receipt
        {
            Sale.printReceipt();
        }

      } while (choice != 7);//end loop
        
    }
    //Method for main menu 
public static void mainMenu()
 {
     Scanner in = new Scanner (System.in);
     System.out.println("Main Menu Options \n==============================="
     + " \n1. ID Report: \n2. Item Purchase History: \n3. Current Inventory "
     + "Level: \n4. Create a New... \n5. Edit a... \n6. Print Receipt: \n7. Exit"
     + "\n Enter Your Choice: #");     
 }
 
//Method for creating menu options 
public static void createMenu()
{
    System.out.println("Menu Options to Create \n============================="
    + "\n1. Create New Customer:\n2. Create New Vendor:\n3. Create New Item:"
    + "\n4. Create New Sale: \n Enter Your Choice: #"); 
 }
 
//Method for Edit menu Options 
public static void editMenu ()
{
    System.out.println("Edit Menu Options \n==================================="
     + "\n1. Edit Existing Customer:\n2. Edit Existing Inventory Item: \n3. "
     + "Edit Existing Vendor: \n Enter Your Choice: #");
}

//method for report options 
public static void reportMenuOptions()
{
    System.out.println("Report Menu Options \n================================="
    + "\n1.Report for Customer Purchase History: \n2.Report for Items:"
    + "\n3.Report for Quantities: \n4. Report for Total Purchase Cost:"
    + "\n5. Report for Purchase Dates:");
}

//method for creating a customer
    public static Customer addCustomer()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("First Name:");
        String first = scan.nextLine();

        System.out.println("Last Name:");
        String last = scan.nextLine();
        
        System.out.println("Street: ");
        String street = scan.nextLine(); 
        
        System.out.println("City:");
        String city = scan.nextLine();
        
        System.out.println("State:");
        String state = scan.nextLine();
        
        System.out.println("Zip Code:");
        int zip = scan.nextInt();
        
        System.out.println("Phone Number:");
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
            System.out.println("Please select from the following: ");
            System.out.println("1: First Name");
            System.out.println("2: Last Name");
            System.out.println("3: Location");
            System.out.println("4: Phone Number");
            System.out.println("5: Exit");
        
            int menu = scan.nextInt();
            String scanString = "";
            int scanInt = 0;
            long scanLong = 0;
            switch(menu)
            {
                case 1:
                {
                    System.out.println("Enter the new First Name:");
                    scan.nextLine();
                    scanString = scan.nextLine();
                    c1.setFirstName(scanString);
                    break;
                }
                case 2:
                {
                    System.out.println("Enter the new Last Name:");
                    scan.nextLine();
                    scanString = scan.nextLine();
                    c1.setLastName(scanString);
                    break;
                }
                case 3:
                {
                   System.out.println("Enter the street: ");
                    scan.nextLine();
                    scanString = scan.nextLine();
                    c1.setStreet(scanString); 
                    
                    System.out.println("Enter the new City:"); // resets city value
                    scan.nextLine(); // to accept the <enter> from the previous scan
                    scanString = scan.nextLine();
                    c1.setCity(scanString);    
                
                    System.out.println("Enter the new State:"); // resets state value
                    scanString = scan.nextLine();
                    c1.setState(scanString);
                
                    System.out.println("Enter the new Zip Code:"); // resets zip value
                    scanInt = scan.nextInt();
                    c1.setZip(scanInt);
                    break;
                }

                case 4:
                {
                    System.out.println("Enter the new Phone Number:");
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
    String date - scan.nextLine();

    Sale newS = new Sale(itemID, itemName, sellingPrice, quantity, customer, date);
    return newS;
}    
        
//method for adding a vendor
public static Vendor addVendor()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Business Name:");
        String bName = scan.nextLine();
        
        System.out.println("Address Line:");
        String aLine = scan.nextLine();
        
        System.out.println("Street: ");
        String street = scan.nextLine(); 
        
        System.out.println("City:");
        String city = scan.nextLine();
        
        System.out.println("State:");
        String state = scan.nextLine();
        
        System.out.println("Phone Number:");
        long number = scan.nextLong();
        
        Vendor v = new Vendor(bName, aLine, city, state, number);
        return v;
    }

//method for editing a vendor
public static void editVendor(Vendor v1)
    {
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        while (run)
        {
            System.out.println("Please select from the following:");
            System.out.println("1: Business Name");
            System.out.println("2: Business Address");
            System.out.println("3: Phone Number");
            System.out.println("4: Exit");
            
            int menu = scan.nextInt();
            switch(menu)
            {
                case 1:
                {
                    System.out.println("Enter the new name:");
                    scan.nextLine();
                    String newName = scan.nextLine();
                    v1.setBusinessName(newName);
                    break;
                }
                case 2:
                {
                    System.out.println("Enter the new street address:");
                    scan.nextLine();
                    String newAddress = scan.nextLine();
                    v1.setAddress(newAddress);
                    
                    System.out.println("Enter the new city");
                    //scan.nextLine();
                    String newCity = scan.nextLine();
                    v1.setCity(newCity);
                    
                    System.out.println("Enter the new state");
                    //scan.nextLine();
                    String newState = scan.nextLine();
                    v1.setState(newState);
                }
                case 3:
                {
                    System.out.println("Enter the new phone number:");
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
}

    



    



