package group.project;
/*
CIS 331 Section 2 
Group Project Part 1.
Authors: Zach Beatty, Eric Carter, Mercy Clemente, Michael Corcoran & Troy Goddard
 */
import java.util.*;
public class Main {

  public static int cID = 1000; // ID for the customer objects begins at 1000
  public static int rID = 2000; // ID for the contractor objects begins at 2000
  public static int saleID = 3000; // ID for the sale objects begins at 3000
  public static int itemID = 4000; // ID for the item objects begins at 4000
  public static int vID = 5000; // ID for the vendor objects begins at 5000
 
      public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int choice=0;
        int choice2=0;
        int choice3=0;
        
        int customerCount = 5; // ready for the 6th customer object
        int vendorCount = 0;
        int saleCount = 0;
        int itemCount = 0;
        
        int customerSelect = 0;
        int vendorSelect = 0;
        int inventorySelect = 0;
        
        Customer[] customerArray = new Customer[5];
        Vendor[] vendorArray = new Vendor[3];
        Sale[] saleArray = new Sale[5];
        Item[] itemArray = new Item[10];
        
        //Prepopulating Item 
        itemArray[0] = new Item(itemID, "Lamp", 1.5, "Gold lamp", 9.99, 20.99);
        itemID++;
        itemArray[1] = new Item(itemID, "Table", 15, "Side table", 13.50, 30);
       itemID++;
        itemArray[2] = new Item(itemID, "Sofa", 100, "Grey sofa", 200, 599.00);
       itemID++;
        itemArray[3] = new Item(itemID, "Chair", 45, "Set of 4 chairs", 80, 300);
       itemID++;
        itemArray[4] = new Item (itemID, "Desk", 25, "Black desk", 35.50, 89.90);
       itemID++;
        itemArray[5] = new Item(itemID, "Desk Light", 3, "Gold desk lamp", 
                4.50, 15.00);
       itemID++;
        itemArray[6] = new Item(itemID, "Dining Table", 55, "Round Dining "
             + "Table", 90, 150.00);
       itemID++;
        itemArray[7] = new Item(itemID, "Basket", 1, "Round basket", 10, 22);
       itemID++;
        itemArray[8] = new Item (itemID, "Bookshelf", 35, "Black Bookshelf", 
        55.50, 110);
       itemID++;
        itemArray[9] = new Item(itemID, "2 Candles", 3.5, "Set of 2 candles", 7, 
        40);
       itemID++;
        
        //Prepopulating Customer
        customerArray[0] = new Customer(cID, "Tom", "Jones", "Harrisonburg", "VA",
        "800 S. Main St.", 22807, 5408994545L);  
       cID++;
        customerArray[1] = new Customer (cID, "Evan", "Thompson", "Fairfax", "VA",
        "1932 Prince William", 22726, 7056785968L);
       cID++;
        customerArray[2] = new Customer (cID, "Jim", "Smith", "Arlington", "VA",
        "775 Edward St", 07675, 2015647857L); 
       cID++;
        customerArray[3] = new Customer(cID, "Kate", "Andrews","Springfield","VA",
        "1032 Rustic St", 22676, 2745638976L);
       cID++;
        customerArray[4] = new Customer(cID, "Rob", "Sousa", "Fairfax", "VA",
        "45 Market Blvd", 89867, 3345789084L); 
       cID++;
        
       //prepopulating Sale
       saleArray[0] = new Sale (saleID, "lamp", 20.99, 3, "Tom Jones", "10/11/2018");
       saleID++;
       saleArray[1] = new Sale (saleID, "chair", 300.00, 1, customerArray[3].
               firstName + " " + customerArray[3].lastName, "8/23/2017");
       saleID++;
       saleArray[2] = new Sale (saleID, "bookshelf", 110, 2, customerArray[4].
               firstName + " " + customerArray[4].lastName, "11/1/2018");
       saleID++;
       saleArray[3] = new Sale(saleID, "sofa", 599, 2,customerArray[2].firstName 
               + " " + customerArray[2].lastName, "9/30/2018");
       saleID++;
       saleArray[4] = new Sale(saleID, "desk", 89.90, 1, customerArray[1].
               firstName + " " + customerArray[1].lastName, "9/1/2018"); 
       saleID++;
           
        //prepopulating Vendor
        vendorArray[0] = new Vendor(vID, "Wayfair", "11 Jones St.", "McLean", "VA",
        22893, 7578994544L); 
       vID++;
        vendorArray[1] = new Vendor(vID, "West Elm", "45 Washington St", "Georges",
        "MD", 44876, 9397578844L);
       vID++;
        vendorArray[2] = new Vendor(vID, "Restoration", "44 Oakland Ave", "Bergen", 
        "NJ", 20154, 3013738999L);
       vID++;
        
        //menu
        do{  
    
        mainMenu(); 
        choice = in.nextInt();
        
       switch (choice) {
            //id report
                case 1:
                    
                    customerPurchaseHistory(customerArray, itemArray, saleArray);
                    choice2 = in.nextInt();
                break;
            //item purchase history
                case 2:
                    itemPurchaseHistory(itemArray, saleArray);
                    mainMenu(); 
                    choice =in.nextInt();
                    break;
            //current inventory levels
                case 3:
                    printCurrInventory(itemArray);
                    mainMenu(); 
                    choice =in.nextInt();
                    break;
            //create new menu
                case 4:
                    createMenu();
                    choice2 = in.nextInt();
         //create new sub menu
            switch (choice2) {
            //create customer
                case 1:
                    customerArray = Arrays.copyOf(customerArray, 
                    customerArray.length + 1); // resizes the customerArray
                    customerArray[customerCount] = addCustomer();
                    customerCount++;
                    mainMenu(); 
                    choice =in.nextInt();
                    break;
            //create vendor
                case 2:
                    vendorArray = Arrays.copyOf(vendorArray, 
                            vendorArray.length + 1);
                    vendorArray[vendorCount] = addVendor();
                    vendorCount++;
                    mainMenu(); 
                    choice =in.nextInt();
                    break;
            //create inventory item
                case 3:
                    itemArray = Arrays.copyOf(itemArray, itemArray.length + 1);
                    itemArray[itemCount] = addItem();
                    itemCount++;
                    mainMenu(); 
                    choice =in.nextInt();
                    break;
            //create sale
                case 4:
                    saleArray = Arrays.copyOf(saleArray, saleArray.length + 1);
                    saleArray[saleCount] = addSale();
                    saleCount++;
                    mainMenu(); 
                    choice =in.nextInt();
                    break;
                default:
                    mainMenu(); 
                    choice =in.nextInt();
                    break;
            }
            
         //edit main menu
                case 5: 
        {
           editMenu(); 
            choice3 = in.nextInt();
            
            //edit sub menu
            switch (choice3) {
            //edit existing customer
                case 1:
                    customerList(customerArray);
                    customerSelect = in.nextInt();
                    editCustomer(customerArray[customerSelect]);
                    mainMenu(); 
                    choice =in.nextInt();
                    break;
            //edit existing inventory item
                case 2:
                    itemList(itemArray);
                    inventorySelect = in.nextInt();
                    editInventory(itemArray[inventorySelect - 4000]);
                    mainMenu(); 
                    choice = in.nextInt();
                    break;
            //edit existing vendor
                case 3:
                    vendorList(vendorArray); 
                    vendorSelect = in.nextInt();
                    editVendor(vendorArray[vendorSelect]);
                    mainMenu(); 
                    choice =in.nextInt();
                    break;
                default:
                    mainMenu(); 
                    choice =in.nextInt();
                    break;
            }
        }
        //print receipt
         case 6: 
        {
            System.out.println("Enter the Sale ID: ");
            int IDChoice = in.nextInt();
            saleArray[IDChoice].printReceipt();
            mainMenu(); 
                    choice =in.nextInt();
            break;
         }
         case 7:
             System.exit(0);
             break;
        default:
                mainMenu(); 
                    choice =in.nextInt();
            break;
         } 
        }  while (choice != 7);//end loop
 
    }

//Method for main menu 
public static void mainMenu()
 {
     System.out.print("\tMain Menu Options \n==============================="
     + " \n1. Customer Purchase History: \n2. Item Purchase History: \n3. "
     + "Current Inventory Level: \n4. Create... \n5. Edit...\n6. Print Receipt:"
     + "\n7. Exit \nEnter Your Choice: #");     
 }
 
//Method for creating menu options 
public static void createMenu()
{
    System.out.print("\tMenu Options to Create \n============================="
    + "=========\n1. Create New Customer:\n2. Create New Vendor:\n3. Create New"
    + " Item: \n4. Create New Sale: \nEnter Your Choice: #"); 
 }
 
//Method for Edit menu Options 
public static void editMenu ()
{
    System.out.print("\tEdit Menu Options \n==================================="
     + "\n1. Edit Existing Customer:\n2. Edit Existing Inventory Item: \n3. "
     + "Edit Existing Vendor: \nEnter Your Choice: #");
}

//Method for Customer purchase history
public static void customerPurchaseHistory(Customer[] customerArray, Item[] 
        itemArray, Sale[] saleArray)
{
    customerList(customerArray);
    Scanner in = new Scanner (System.in);
    int selection = in.nextInt();
    selection -= 1000;
    System.out.println("\n------------------ Purchase History for Customer #" + 
      selection + " -----------------\n----------------------------------------"
      + "--------------------------------\nItem Name: \tItem ID: \tQuantity: \t"
      + "Total Cost: \tDate: "); 
            for (int i=0; i<itemArray.length; i++)
            {
                if((customerArray[selection].firstName + " " + customerArray
                        [selection].lastName).equals(saleArray[i].customer))
                 System.out.printf(itemArray[i].toString());
            }
            System.out.println(""); 
}
//method for creating a customer
    public static Customer addCustomer()
    { 
        Scanner scan = new Scanner(System.in);
        System.out.print("First Name: ");
        String firstName = scan.nextLine();
        if (firstName.length()==0)
        {
            System.out.println("Please Enter a valid input");
            System.out.print("First Name: ");
            firstName = scan.nextLine();
        }
        
        System.out.print("Last Name: ");
         String lastName = scan.nextLine();
        if (lastName.length()==0)
        {
            System.out.println("Please Enter a valid input");
            System.out.print("Last Name: ");
            lastName = scan.nextLine();
        }
        System.out.print("Street: ");
         String street = scan.nextLine(); 
        if (street.length()==0)
        {
            System.out.println("Please Enter a valid input");
            System.out.print("Street: ");
            street = scan.nextLine();
        }
        System.out.print("City: ");
         String city = scan.nextLine();
        if (city.length() ==0)
        {
            System.out.println("Please Enter a valid input");
            System.out.print("City: ");
            city = scan.nextLine();
        }
        
        System.out.print("State: ");
         String state = scan.nextLine();
        if (state.length()==0)
        {
            System.out.println("Please Enter a valid input");
            System.out.print("State: ");
            state = scan.nextLine();
        }
        System.out.print("Zip Code: ");
         int zip = scan.nextInt();
      
        System.out.print("Phone Number: #");
        long phoneNumber = scan.nextLong();
        if (String.valueOf(phoneNumber).length() <10 || String.valueOf(phoneNumber)
                .length()>10)
        {
            System.out.println("Enter a valid phone number. 10 numbers long");
            System.out.println("Phone Number: ");
            phoneNumber = scan.nextLong(); 
        }
        Customer newC = new Customer(cID, firstName, lastName, city, state, 
                street, zip, phoneNumber);
     cID++;
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
          + "------\n1. Edit the Name:\n2. Edit the Weight:\n3. Edit the Descri"
          + "ption:\n4. Edit the Purchase Price:\n5. Edit the Selling Price:"
          + "\n6. Exit"
          + "Enter Your Choice: ");
     
            int menu = scan.nextInt();
            switch(menu)
            {
                case 1:
                {
                    System.out.print("Enter the new name:");
                    scan.nextLine();
                    String newName = scan.nextLine();
                    i1.setName(newName);
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
    
    System.out.println("Item Name: ");
    String itemName = scan.nextLine();
    if(itemName.length()==0)
    {
        System.out.println("Enter a valid Item Name:");
        itemName = scan.nextLine();
    }

    System.out.println("Selling Price: ");
    double sellingPrice = scan.nextDouble();
    if(sellingPrice==0)
    {
        System.out.println("Enter a valid selling price:");
        sellingPrice=scan.nextDouble();
    }

    System.out.println("Quantity: ");
    int quantity = scan.nextInt();
    if(quantity==0)
    {
        System.out.println("Enter a valid Quantity:");
        quantity=scan.nextInt();
    }

    System.out.println("Customer name: ");
    String customer = scan.nextLine();
    if(customer.length()==0)
    {
        System.out.println("Enter a valid Customer Name:");
        customer=scan.nextLine();
    }

    System.out.println("Date of Sale: ");
    String date = scan.nextLine();

    Sale newS = new Sale(saleID, itemName, sellingPrice, quantity, customer, date);
    saleID++;
    return newS;
}    
        
//method for adding a vendor
public static Vendor addVendor()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Business Name: ");
        String businessName = scan.nextLine();
        if(businessName.length()==0)
        {
            System.out.println("Enter a valid Business Name:");
            businessName=scan.nextLine(); 
        }
        System.out.print("Street: ");
        String street = scan.nextLine(); 
        if(street.length() ==0)
        {
            System.out.println("Enter a Valid Street: ");
            street =scan.nextLine();
        }
        System.out.print("City: ");
        String city = scan.nextLine();
        if(city.length()==0)
        {
            System.out.println("Enter a valid City: ");
            city = scan.nextLine();
        }
        System.out.print("State: ");
        String state = scan.nextLine();
        
        System.out.print("Enter Zip: ");
        int zip = scan.nextInt(); 
    
        System.out.print("Phone Number: ");
        long phoneNumber = scan.nextLong();
        if (String.valueOf(phoneNumber).length() <10 || String.valueOf(phoneNumber)
                .length()>10)
        {
            System.out.println("Enter a valid phone number. 10 numbers long");
            System.out.println("Phone Number: ");
            phoneNumber = scan.nextLong(); 
        }
        Vendor v = new Vendor(vID, businessName, street, city, state, zip, 
                phoneNumber);
        vID++;
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
          + "\nItem Name: \t Item ID: \tWeight:"); 
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
        if(itemName.length()==0)
        {
            System.out.println("Enter a valid Item Name:");
            itemName=scan.nextLine();
        }
        System.out.print("Enter the item weight: ");
        double itemWeight = scan.nextDouble();
        if(itemWeight==0.0)
        {
            System.out.println("Enter a valid weight:");
            itemWeight=scan.nextDouble();
        }
        System.out.print("Enter the item description: ");
        String itemDescription = scan.nextLine();
        if(itemDescription.length()==0)
        {
            System.out.println("Enter a Valid Description:");
            itemDescription=scan.nextLine();
        }
        System.out.print("Enter the purchase price: ");
        double pPrice = scan.nextDouble();
        if(pPrice ==0.0)
        {
            System.out.println("Enter a valid purchase price: $");
            pPrice =scan.nextDouble(); 
        }
        System.out.print("Enter the Selling price: ");
        double sellingPrice = scan.nextDouble(); 
        if (sellingPrice ==0.0)
        {
            System.out.println("Enter a valid Selling Price: $");
            sellingPrice = scan.nextDouble();
        }
        
        Item returnItem = new Item(itemID, itemName, itemWeight,itemDescription,
                pPrice, sellingPrice);
        itemID++;
        return returnItem;
    }
 
  //Method for item purchase history
public static void itemPurchaseHistory(Item[] itemArray, Sale[] saleArray)
 {
    boolean sold = false;
    Scanner in = new Scanner (System.in); 
    printCurrInventory(itemArray); 
    System.out.print("Enter the ID to View the Item's Purchase History: #");
    int historyID=in.nextInt(); 
    System.out.println("\tPurchase History for Item #" + historyID +"\n--------"
    + "--------------------------------------------");
    System.out.printf("%-12s" + " %-20s" + " %-12s" + " %-10s" + " %-20s" + 
          " %-12s\n", "ID", "Item", "Sold for", "Quantity", "Customer", "Date");
    
    for(int i = 0; i < saleArray.length; i++)
    {
      if(saleArray[i].itemName.toUpperCase().equals(itemArray[historyID - 4000].
                itemName.toUpperCase()))
        {
            System.out.println(saleArray[i].toString());
            sold = true;
        }
    }
    if (!sold)
    {
        System.out.println("==============  NO ITEMS TO SHOW  ===============");
    }
  
 } 
   
 //Method to print out the full list of customers
 public static void customerList(Customer[] customerArray)
    {
        System.out.println("\tPlease Enter a Customer Number \n--------"
        + "------------------------------------------");
        for (int i=0; i<customerArray.length; i++)
            {
                 System.out.println(customerArray[i]);
            }
            System.out.print("#");
    }
 
 //Method to print out the full list of vendors to then edit
 public static void vendorList (Vendor [] vendorArray)
 {
         System.out.println("\tPlease Enter a Vendor Number to Edit \n---------"
        + "------------------------------------------");
          for(int i=0; i<vendorArray.length; i++)
         {
          System.out.println(vendorArray[i]);
         }
        System.out.println("");
 }
 
 //Method to print out items in inventory
 public static void itemList (Item [] itemArray)
 {
      System.out.println("\tPlease Enter an Item Number to Edit \n---------"
        + "------------------------------------------");
          for(int i=0; i<itemArray.length;i++)
         {
            System.out.println(itemArray[i]);
         }
         System.out.println("");
 }
}


