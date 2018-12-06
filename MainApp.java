/*
CIS 331 Section 2 
Group Project Part 2.
Authors: Zach Beatty, Eric Carter, Mercy Clemente, Michael Corcoran & Troy Goddard
*/
package GroupProject331;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.collections.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class MainApp extends Application {
   TextArea taNotes = new TextArea();
   ScrollPane notesScrollPane = new ScrollPane(taNotes);
   
    ObservableList olState = FXCollections.observableArrayList();
    ComboBox cmboStates = new ComboBox(olState); 
    ObservableList olStates = FXCollections.observableArrayList();
    ComboBox cmboVStates = new ComboBox(olStates);
   
    //creating variables
    Customer[] customerArray = new Customer[5];
    Contractor [] contractorArray = new Contractor[7]; 
    ObservableList<Customer> olCustomers = FXCollections.observableArrayList(customerArray);
    ComboBox cmboEditCustomers = new ComboBox();
    ComboBox cmboCustPurchase = new ComboBox(); 
    ComboBox cmboEditVendor = new ComboBox();
    ComboBox cmboEditSales = new ComboBox();
    ComboBox cmboEditContractor = new ComboBox();
    ComboBox cmboCustReceipt = new ComboBox();
    ComboBox cmboItemPurchase = new ComboBox();
    //ObservableList <Customer> olCustomerPurchase = FXCollections.observableArrayList(customerArray);
    Vendor[] vendorArray = new Vendor[3];
    Sale[] saleArray = new Sale[5];
    Item[] itemArray = new Item[10];
    int customerCount = 5;
    int vendorCount = 3;
    int saleCount = 5;
    int itemCount = 10;

   
    @Override
    public void start(Stage primaryStage) {
    
    //Prepopulating arrays
    customerArray[0] = new Customer("Tom", "Jones", "Harrisonburg", "VA", "800 S. Main St.", 22807, 5408994545L,"");  
    customerArray[1] = new Customer("Evan", "Thompson", "Fairfax", "VA", "1932 Prince William", 22726, 7056785968L,"");
    customerArray[2] = new Customer ("Jim", "Smith", "Arlington", "VA", "775 Edward St", 07675, 2015647857L,""); 
    customerArray[3] = new Customer("Kate", "Andrews","Springfield","VA", "1032 Rustic St", 22676, 2745638976L,"");
    customerArray[4] = new Customer("Rob", "Sousa", "Fairfax", "VA", "45 Market Blvd", 89867, 3345789084L,"");
    
    vendorArray[0]= new Vendor("Universal Construction", "12 South Main St. ", "Rockingham", "VA",22801, 4759067589L);
    vendorArray[1]= new Vendor("Cat Building", "45 Annendale Blvd.", "Springfield", "VA", 22738, 7034563782L);
    vendorArray[2] = new Vendor("Booking", "11 George Place.", "Culver City", "CA", 74683, 3134538948L);
    
    saleArray[0] = new Sale("Side lamp", 20.00, 3, "Tina Jones", "11/2/17");
    saleArray[1] = new Sale("Bed", 500.50, 1, "Ryan Guess", "5/12/18");
    
    //contractorArray[0] = new Contractor("Tim", "Corven", "5543 South Bend Plaza", "Fairfax", "VA", 98734, "Baker Booking", 4563728473L, "");
    
      for (int i = 0; i < customerArray.length; i++)
        {
            cmboEditCustomers.getItems().add(customerArray[i].shortString());
        }
    for (int i = 0; i < customerArray.length; i++)
        {
            cmboCustPurchase.getItems().add(customerArray[i].shortString());
        }
    for (int i = 0; i < customerArray.length; i++)
        {
            cmboCustReceipt.getItems().add(customerArray[i].shortString());
        }
      //prepopulation items
    itemArray[0] = new Item("Lamp", 1.5, "Gold lamp", 9.99, 10);
    itemArray[1] = new Item("Table", 15, "Side table", 13.50, 5);
    itemArray[2] = new Item("Sofa", 100, "Grey sofa", 200, 3);
    itemArray[3] = new Item("Chair", 45, "Set of 4 chairs", 80, 20);
    itemArray[4] = new Item ("Desk", 25, "Black desk", 35.50, 4);
    itemArray[5] = new Item("Desk Light", 3, "Gold desk lamp", 4.50, 6);
    itemArray[6] = new Item("Dining Table", 55, "Round Dining Table", 90, 2);
    itemArray[7] = new Item("Basket", 1, "Round basket", 10, 15);
    itemArray[8] = new Item("Bookshelf", 35, "Black Bookshelf", 55.50, 3);
    itemArray[9] = new Item("2 Candles", 3.5, "Set of 2 candles", 7, 10);
    for(int i = 0; i < itemArray.length; i++)
    {
    cmboItemPurchase.getItems().add(itemArray[i].shortString());
    };
    
    cmboEditCustomers.getItems().addAll(customerArray);
    cmboCustPurchase.getItems().addAll(customerArray);
    cmboEditVendor.getItems().addAll(vendorArray);
    cmboEditSales.getItems().addAll(saleArray);
    cmboEditContractor.getItems().addAll(contractorArray);
    cmboItemPurchase.getItems().addAll(itemArray);
    cmboCustReceipt.getItems().addAll(customerArray); 
       
  // Declaring neccessary fields, labels, etc.
    TextField txtFName = new TextField();
    TextField txtLName = new TextField();
    TextField txtStreet = new TextField();
    TextField txtCity = new TextField();
    TextField txtZip = new TextField();
    TextField txtPhone = new TextField();
    TextField txtItem = new TextField();
    TextField txtWeight = new TextField();
    TextField txtDescription = new TextField();
    TextField txtPurchasePrice = new TextField();
    TextField txtSellingPrice = new TextField();
    TextField txtQuantity = new TextField();
    TextField txtCustomerName = new TextField();
    TextField txtVendorName = new TextField();
    TextField txtVendorStreet = new TextField();
    TextField txtVendorCity = new TextField();
    TextField txtVendorZip = new TextField();
    TextField txtVendorPhone = new TextField();
    TextField txtSaleItem = new TextField();
    TextField txtSalePrice = new TextField();
    TextField txtContractorName = new TextField();
    TextField txtContractorNumber = new TextField();
    TextField txtContractorStreet = new TextField();
    TextField txtContractorCity = new TextField();
    TextField txtContractorZip = new TextField();
    TextField txtSaleDate = new TextField();
   
    //Setting dimensions for textfields
    txtContractorName.setMaxWidth(200);
    txtContractorNumber.setMaxWidth(200);
    txtContractorStreet.setMaxWidth(200);
    txtContractorCity.setMaxWidth(200);
    txtContractorZip.setMaxWidth(200);
    txtFName.setMaxWidth(200);
    txtLName.setMaxWidth(200);
    txtStreet.setMaxWidth(200);
    txtCity.setMaxWidth(200);
    txtZip.setMaxWidth(200);
    txtPhone.setMaxWidth(200);
    txtItem.setMaxWidth(200);
    txtWeight.setMaxWidth(200);
    txtDescription.setMaxWidth(200);
    txtPurchasePrice.setMaxWidth(200);
    txtSellingPrice.setMaxWidth(200);
    txtSaleDate.setMaxWidth(200);
    txtQuantity.setMaxWidth(100);
    txtCustomerName.setMaxWidth(200);
    txtVendorName.setMaxWidth(200);
    txtVendorStreet.setMaxWidth(200);
    txtVendorCity.setMaxWidth(200);
    txtVendorZip.setMaxWidth(200);
    txtVendorPhone.setMaxWidth(200);
    txtSaleItem.setMaxWidth(200);
    txtSalePrice.setMaxWidth(200);
   TextArea taReceipt = new TextArea(); 
   TextArea taInventory = new TextArea();
   TextArea taItemHistory = new TextArea();
   ScrollPane itemHistoryScrollPane = new ScrollPane(taItemHistory);
   ScrollPane receiptScrollPane = new ScrollPane (taReceipt);
   ScrollPane inventoryScrollPane = new ScrollPane(taInventory);
   notesScrollPane.setPrefSize(350,150);
   inventoryScrollPane.setPrefSize(400,250);
   receiptScrollPane.setPrefSize(400,250);
   itemHistoryScrollPane.setPrefSize(400,250);

   taReceipt.setPrefSize(400,250);
   taInventory.setPrefSize(400,250);
   taNotes.setPrefSize(350,150);
   taItemHistory.setPrefSize(400,250);
   
    Label lblItem = new Label("Item Name: ");
    Label lblWeight = new Label("Item Weight: ");
    Label lblDescription = new Label ("Item Description: ");
    Label lblPurchasePrice = new Label ("Item Purchase Price:");
    Label lblFName = new Label ("First Name:");
    Label lblLName = new Label ("Last Name:");
    Label lblStreet = new Label ("Street:");
    Label lblCity = new Label ("City:");
    Label lblState = new Label ("Select State:");
    Label lblZip = new Label ("Zip");
    Label lblPhone = new Label ("Phone Number:");
    Label lblNotes = new Label("Enter Any Necessary Notes:");
    Label lblQuantity = new Label("Quantity:");
    Label lblCustomerName = new Label("Customer Name:");
    Label lblItemHistory = new Label("Viewing Item Purchase History");
    Label lblVendorName = new Label("Enter Vendor's Name:");
    Label lblVendorStreet = new Label ("Enter Vendor Street:");
    Label lblVendorCity = new Label("Enter City:");
    Label lblVendorZip = new Label("Enter Zip:");
    Label lblVendorPhone = new Label("Enter Phone:");
    Label lblVendorState = new Label("Select State:"); 
    Label lblSaleItem = new Label("Name of Item:");
    Label lblSalePrice = new Label("Selling Price:");
    Label lblContractorName = new Label("Contractor Name:");
    Label lblContractorNumber = new Label ("Contractor Phone:");
    Label lblContractorStreet = new Label ("Street:");
    Label lblContractorCity = new Label("City:");
    Label lblContractorState = new Label("Select State");
    Label lblContractorZip = new Label("Enter Zip:");
    Label lblSaleDate = new Label("Date of the Sale (MM/DD/YYYY)");
  
//Declaring all buttons 
    Button btnCustPurchase = new Button("View Customer Purchase History"); 
    Button btnItemPurch = new Button("View Item Purchase History");
    Button btnCurrentInv = new Button ("View Current Inventory Levels");
    Button btnCreateMenu = new Button ("Create a New ...");
    Button btnEdit = new Button ("Edit an Existing ..."); 
    Button btnPrint = new Button("Print Receipt");
    Button btnExit = new Button ("Exit"); 
    Button btnCustPurchExit = new Button("Exit");
    Button btnPrintExit = new Button ("Exit");
    Button btnEditExit = new Button("Exit");
    Button btnEditCustomer = new Button("Edit Customer");
    Button btnEditItem = new Button ("Edit Item");
    Button btnEditSale = new Button ("Edit Sale");
    Button btnEditVendor = new Button ("Edit Vendor");
    Button btnEditContractor = new Button ("Edit Contractor");
    Button btnExitCust = new Button("Exit");
    Button btnSaveCustInfo = new Button("Save");
    Button btnItemExit = new Button ("Exit"); 
    Button btnSaleExit = new Button ("Exit");
    Button btnVendorExit = new Button("Exit");
    Button btnExitInventory = new Button("Exit");
    Button btnCreateCust = new Button ("Create New Customer");
    Button btnCreateItem = new Button ("Create New Item");
    Button btnVendor = new Button ("Create New Vendor");
    Button btnCreateSale = new Button ("Create New Sale");
    Button btnExitCreate = new Button ("Exit");
    Button btnItemHistoryExit = new Button("Exit");
    Button btnSaveInventory = new Button("Save");
    Button btnVendorSave = new Button ("Save");
    Button btnCreateContractor = new Button("Create Contractor");
    Button btnSaveContractor = new Button("Save");
    Button btnExitContractor = new Button("Exit");
    Button btnContinue  = new Button("Continue to Edit");
    
    //Setting button dimensions 
    btnSaveContractor.setPrefSize(200,10);
    btnContinue.setPrefSize(250,10);
    btnExitContractor.setPrefSize(200,10);
    btnCreateContractor.setPrefSize(250,10);
    btnCustPurchase.setPrefSize(250, 10);
    btnItemHistoryExit.setPrefSize(100,10);
    btnItemPurch.setPrefSize(250,10);
    btnCurrentInv.setPrefSize(250,10);
    btnCreateMenu.setPrefSize(250,10);
    btnEdit.setPrefSize(250,10);
    btnPrint.setPrefSize(250,10);
    btnExit.setPrefSize(250,10);
    btnCustPurchExit.setPrefSize(150,10);
    btnPrintExit.setPrefSize(150,10);
    btnEditExit.setPrefSize(250,10);
    btnEditCustomer.setPrefSize(250,10);
    btnEditItem.setPrefSize(250,10);
    btnEditSale.setPrefSize(250,10);
    btnEditVendor.setPrefSize(250,10);
    btnExitCust.setPrefSize(200,10);
    btnSaveCustInfo.setPrefSize(200,10);
    btnItemExit.setPrefSize(200,10);
    btnSaleExit.setPrefSize(200,10);
    btnVendorExit.setPrefSize(200,10);
    btnExitInventory.setPrefSize(200,10);
    btnEditContractor.setPrefSize(250,10);
    btnCreateCust.setPrefSize(250,10);
    btnCreateItem.setPrefSize(250,10);
    btnVendor.setPrefSize(250,10);
    btnCreateSale.setPrefSize(250,10);
    btnExitCreate.setPrefSize(250,10);
    btnSaveInventory.setPrefSize(200,10);
    btnVendorSave.setPrefSize(200,10);
    taNotes.setWrapText(true); 
    
    cmboStates.setPrefSize(200,10);
    cmboVStates.setPrefSize(200,10);
    cmboEditCustomers.setPrefSize(250,10);
    cmboCustPurchase.setPrefSize(250,10);
    cmboEditContractor.setPrefSize(250,10);
    cmboEditSales.setPrefSize(250, 10);
    cmboEditVendor.setPrefSize(250,10);

    ObservableList olCState = FXCollections.observableArrayList();
    ComboBox cmboCState = new ComboBox(olCState);
    olCState.add("AL - Alabama");
    olCState.add("AK - Alaska");
    olCState.add("AZ - Arizona");
    olCState.add("AR - Arkansas");
    olCState.add("CA - California");
    olCState.add("CO - Colorado");
    olCState.add("CT - Connecticut");
    olCState.add("DE - Deleware");
    olCState.add("FL - Florida");
    olCState.add("GA - Georgia");
    olCState.add("HI - Hawaii");
    olCState.add("ID - Idaho");
    olCState.add("IL - Illinois");
    olCState.add("IN - Indiana");
    olCState.add("IA - Iowa");
    olCState.add("KS - Kansas");
    olCState.add("KY - Kentucky");
    olCState.add("LA - Louisiana");
    olCState.add("ME - Maine");
    olCState.add("MD - Maryland");
    olCState.add("MA - Massachusetts");
    olCState.add("MI - Michigan");
    olCState.add("MN - Minnesota");
    olCState.add("MS - Mississippi");
    olCState.add("MO - Missouri");
    olCState.add("MT - Montana");
    olCState.add("NE - Nebraska");
    olCState.add("NV - Nevada");
    olCState.add("NH - New Hampshire");
    olCState.add("NJ - New Jersey");
    olCState.add("NM - New Mexico");
    olCState.add("NY - New York");
    olCState.add("NC - North Carolina");
    olCState.add("ND - North Dakota");
    olCState.add("OH - Ohio");
    olCState.add("OK - Oklahoma");
    olCState.add("OR - Oregon");
    olCState.add("PA - Pennsylvania");
    olCState.add("RI - Rhode Island");
    olCState.add("SC - South Carolina");
    olCState.add("SD - South Dakota");
    olCState.add("TN - Tennessee");
    olCState.add("TX - Texas");
    olCState.add("UT - Utah");
    olCState.add("VT - Vermont");
    olCState.add("VA - Virginia");
    olCState.add("WA - Washington");
    olCState.add("WV - West Virginia");
    olCState.add("WI - Wisconsin");
    olCState.add("WY - Wyoming");
    cmboCState.setPrefSize(200,10);
  
//Filling observable list 
    olState.add("AL - Alabama");
    olState.add("AK - Alaska");
    olState.add("AZ - Arizona");
    olState.add("AR - Arkansas");
    olState.add("CA - California");
    olState.add("CO - Colorado");
    olState.add("CT - Connecticut");
    olState.add("DE - Deleware");
    olState.add("FL - Florida");
    olState.add("GA - Georgia");
    olState.add("HI - Hawaii");
    olState.add("ID - Idaho");
    olState.add("IL - Illinois");
    olState.add("IN - Indiana");
    olState.add("IA - Iowa");
    olState.add("KS - Kansas");
    olState.add("KY - Kentucky");
    olState.add("LA - Louisiana");
    olState.add("ME - Maine");
    olState.add("MD - Maryland");
    olState.add("MA - Massachusetts");
    olState.add("MI - Michigan");
    olState.add("MN - Minnesota");
    olState.add("MS - Mississippi");
    olState.add("MO - Missouri");
    olState.add("MT - Montana");
    olState.add("NE - Nebraska");
    olState.add("NV - Nevada");
    olState.add("NH - New Hampshire");
    olState.add("NJ - New Jersey");
    olState.add("NM - New Mexico");
    olState.add("NY - New York");
    olState.add("NC - North Carolina");
    olState.add("ND - North Dakota");
    olState.add("OH - Ohio");
    olState.add("OK - Oklahoma");
    olState.add("OR - Oregon");
    olState.add("PA - Pennsylvania");
    olState.add("RI - Rhode Island");
    olState.add("SC - South Carolina");
    olState.add("SD - South Dakota");
    olState.add("TN - Tennessee");
    olState.add("TX - Texas");
    olState.add("UT - Utah");
    olState.add("VT - Vermont");
    olState.add("VA - Virginia");
    olState.add("WA - Washington");
    olState.add("WV - West Virginia");
    olState.add("WI - Wisconsin");
    olState.add("WY - Wyoming");
    cmboStates.setPrefSize(200,10);
  
//Filling observable list 
    olStates.add("AL - Alabama");
    olStates.add("AK - Alaska");
    olStates.add("AZ - Arizona");
    olStates.add("AR - Arkansas");
    olStates.add("CA - California");
    olStates.add("CO - Colorado");
    olStates.add("CT - Connecticut");
    olStates.add("DE - Deleware");
    olStates.add("FL - Florida");
    olStates.add("GA - Georgia");
    olStates.add("HI - Hawaii");
    olStates.add("ID - Idaho");
    olStates.add("IL - Illinois");
    olStates.add("IN - Indiana");
    olStates.add("IA - Iowa");
    olStates.add("KS - Kansas");
    olStates.add("KY - Kentucky");
    olStates.add("LA - Louisiana");
    olStates.add("ME - Maine");
    olStates.add("MD - Maryland");
    olStates.add("MA - Massachusetts");
    olStates.add("MI - Michigan");
    olStates.add("MN - Minnesota");
    olStates.add("MS - Mississippi");
    olStates.add("MO - Missouri");
    olStates.add("MT - Montana");
    olStates.add("NE - Nebraska");
    olStates.add("NV - Nevada");
    olStates.add("NH - New Hampshire");
    olStates.add("NJ - New Jersey");
    olStates.add("NM - New Mexico");
    olStates.add("NY - New York");
    olStates.add("NC - North Carolina");
    olStates.add("ND - North Dakota");
    olStates.add("OH - Ohio");
    olStates.add("OK - Oklahoma");
    olStates.add("OR - Oregon");
    olStates.add("PA - Pennsylvania");
    olStates.add("RI - Rhode Island");
    olStates.add("SC - South Carolina");
    olStates.add("SD - South Dakota");
    olStates.add("TN - Tennessee");
    olStates.add("TX - Texas");
    olStates.add("UT - Utah");
    olStates.add("VT - Vermont");
    olStates.add("VA - Virginia");
    olStates.add("WA - Washington");
    olStates.add("WV - West Virginia");
    olStates.add("WI - Wisconsin");
    olStates.add("WY - Wyoming");
  //Creating the pane stage and scene for customer purchase history 
        GridPane custPurchPane = new GridPane();
        custPurchPane.setAlignment(Pos.CENTER);
        Stage custPurchStage = new Stage();
        Scene custPurchScene = new Scene(custPurchPane, 600,400);
        custPurchStage.setTitle("Customer Purchase History");
        Label lblCustT = new Label("Viewing Customer Purchase History");
        Button btnViewCustPurch = new Button("View Customer's Purchase History");
        custPurchStage.setScene(custPurchScene);
        custPurchPane.add(lblCustT,0,0);
        custPurchPane.add(cmboCustPurchase,0,1,1,3);
        custPurchPane.add(btnViewCustPurch,0,4);
        custPurchPane.add(btnCustPurchExit,1,4);
        btnCustPurchase.setOnAction(e ->{
            custPurchStage.show(); 
          //  taCustPurchHistory.appendText(customerArray[0].toString());
        });
        btnCustPurchExit.setOnAction(e -> {
            custPurchStage.close();
        }); 
        custPurchPane.setVgap(20);
        custPurchPane.setHgap(20);
        
//Creating the pane, stage, and scene for item purchase history
        GridPane itemPurchPane = new GridPane();
        itemPurchPane.setAlignment(Pos.CENTER);
        Stage itemPurchStage = new Stage();
        Scene itemPurchScene = new Scene(itemPurchPane, 500,400);
        itemPurchStage.setTitle("Item Purchase History");
        itemPurchStage.setScene(itemPurchScene); 
        itemPurchPane.add(cmboItemPurchase,0,1);
        itemPurchPane.add(btnItemHistoryExit,0,2);
        itemPurchPane.add(lblItemHistory,0,0);
        btnItemPurch.setOnAction(e -> {
            itemPurchStage.show();
        });
        btnItemHistoryExit.setOnAction(e -> {
            itemPurchStage.close();
        });
        itemPurchPane.setVgap(20);
        itemPurchPane.setHgap(20);
        
        
  //Creating the current inventory 
        GridPane currentInvPane = new GridPane();
        currentInvPane.setAlignment(Pos.CENTER);
        Stage currentInvStage = new Stage();
        Scene currentInvScene = new Scene(currentInvPane, 500,400);
        currentInvStage.setTitle("Current Inventory Levels");
        currentInvStage.setScene(currentInvScene); 
        Label lblInventory = new Label("Current Inventory Levels:");
        currentInvPane.add(lblInventory,0,0);
        currentInvPane.add(inventoryScrollPane,0,1);
        currentInvPane.add(btnExitInventory,0,2);
        btnCurrentInv.setOnAction(e ->{
            currentInvStage.show();
        });
        btnExitInventory.setOnAction(e ->{
            currentInvStage.close();
        });
        currentInvPane.setVgap(20);
        currentInvPane.setHgap(20);
  
//Create menu 
        GridPane createPane = new GridPane();
        createPane.setAlignment(Pos.CENTER);
        Stage createStage = new Stage();
        Scene createScene = new Scene(createPane, 500,400);
        createStage.setTitle("Create Menu Options");
        createStage.setScene(createScene); 
        createPane.add(btnCreateCust,1,0);
        createPane.add(btnCreateItem,1,1);
        createPane.add(btnVendor,1,2);
        createPane.add(btnCreateSale,1,3);
        createPane.add(btnCreateContractor,1,4);
        createPane.add(btnExitCreate,1,5);
        btnExitCreate.setOnAction(e ->{
            createStage.close();
        });
        createPane.setHgap(20);
        createPane.setVgap(20);
        
//Create new Vendor
        GridPane vendorPane = new GridPane();
        vendorPane.setAlignment(Pos.CENTER);
        Stage vendorStage = new Stage();
        Scene vendorScene = new Scene(vendorPane, 660,600);
        vendorStage.setTitle("Create Vendor");
        vendorStage.setScene(vendorScene);
        Label lblNewT = new Label("Creating a New Vendor");
        vendorPane.add(lblNewT,0,0);
        vendorPane.add(lblVendorName,0,1);
        vendorPane.add(lblVendorStreet,0,2);
        vendorPane.add(lblVendorCity,0,3);
        vendorPane.add(lblVendorState,0,4);
        vendorPane.add(lblVendorZip,0,5);
        vendorPane.add(lblVendorPhone,0,6);
        vendorPane.add(txtVendorName,1,1);
        vendorPane.add(txtVendorStreet,1,2);
        vendorPane.add(txtVendorCity,1,3);
        vendorPane.add(cmboVStates,1,4);
        vendorPane.add(txtVendorZip,1,5);
        vendorPane.add(txtVendorPhone,1,6);
        vendorPane.add(btnVendorSave,1,8);
        vendorPane.add(btnVendorExit, 0, 8);
        btnVendor.setOnAction(e ->{
            vendorStage.show();
        }); 
         btnVendorExit.setOnAction(e ->{
            vendorStage.close();
        });
         
         btnVendorSave.setOnAction(e ->{
            vendorArray = Arrays.copyOf(vendorArray, 
            vendorArray.length + 1); // resizes vendorArray
             
            vendorArray[vendorCount] = new Vendor(txtVendorName.getText(), txtVendorStreet.getText(),
                txtVendorCity.getText(), cmboVStates.getSelectionModel().getSelectedItem().toString(), 
                Integer.parseInt(txtVendorZip.getText()), Long.parseLong(txtVendorPhone.getText()));
            vendorCount++;
         });
         
        vendorPane.setHgap(20);
        vendorPane.setVgap(20);   
        
//Create new sale menu 
        GridPane salePane = new GridPane();
        salePane.setAlignment(Pos.CENTER);
        Stage saleStage = new Stage();
        Scene saleScene = new Scene(salePane,500,400);
        saleStage.setTitle("Create New Sale");
        saleStage.setScene(saleScene);
        Button btnSaveSale = new Button("Save");
        salePane.add(lblSaleItem,0,0);
        salePane.add(lblSalePrice,0,1);
        salePane.add(lblQuantity, 0,2); 
        salePane.add(lblCustomerName,0,3);
        salePane.add(lblSaleDate,0,4);
        salePane.add(txtSaleItem, 1,0);
        salePane.add(txtSalePrice,1,1);
        salePane.add(txtQuantity,1,2);
        salePane.add(txtCustomerName,1,3);
        salePane.add(txtSaleDate,1,4);
        salePane.add(btnSaleExit,1,5);
        salePane.add(btnSaveSale,0,5);
        
        
        btnSaveSale.setOnAction(e ->{
            //resize the array
            saleArray = Arrays.copyOf(saleArray, 
            saleArray.length + 1); // resizes saleArray
            
            saleArray[saleCount] =  new Sale(txtSaleItem.getText(), Double.parseDouble(txtSalePrice.getText()), Integer.parseInt(txtQuantity.getText()), 
                    txtCustomerName.getText(), txtSaleDate.getText());
            saleCount++;
        });
        
        btnCreateSale.setOnAction(e ->{
            saleStage.show();
        });
        btnSaleExit.setOnAction(e ->{
            saleStage.close();
        });
        salePane.setHgap(20);
        salePane.setVgap(20);
//Create new item menu 
        GridPane createItemPane = new GridPane();
        createItemPane.setAlignment(Pos.CENTER);
        Stage createItemStage = new Stage();
        Scene createItemScene = new Scene(createItemPane, 500,400);
        createItemStage.setTitle("Create New Item");
        createItemStage.setScene(createItemScene);
        createItemPane.add(btnItemExit,1, 5);
        createItemPane.add(lblItem, 0,0);
        createItemPane.add(lblWeight,0,1);
        createItemPane.add(lblDescription,0,2);
        createItemPane.add(lblQuantity, 0,4);
        createItemPane.add(lblPurchasePrice,0,3);
        createItemPane.add(txtItem, 1,0);
        createItemPane.add(txtWeight,1,1);
        createItemPane.add(txtDescription,1,2);
        createItemPane.add(btnSaveInventory,0,5);
        createItemPane.add(txtSellingPrice,1,3);
        createItemPane.add(txtQuantity, 1, 4);
 //Setting button on action 
        btnSaveInventory.setOnAction(e ->{
            itemArray = Arrays.copyOf(itemArray, 
            itemArray.length + 1); // resizes itemArray
            itemArray[itemCount] = new Item(txtItem.getText(), Double.parseDouble(txtWeight.getText()), txtDescription.getText(),
            Double.parseDouble(txtSellingPrice.getText()), Integer.parseInt(txtQuantity.getText()));
            itemCount++;
        });
        btnCreateItem.setOnAction(e ->{
            createItemStage.show();
        }); 
         btnItemExit.setOnAction(e ->{
            createItemStage.close();
        });
            createItemPane.setHgap(20);
            createItemPane.setVgap(20);
 
     //Create Contractor
     GridPane contractorPane = new GridPane();
     contractorPane.setAlignment(Pos.CENTER);
     Stage contractorStage = new Stage();
     Scene contractorScene = new Scene(contractorPane,660,600);
     contractorStage.setTitle("Create Contractor");
     contractorStage.setScene(contractorScene);
     contractorPane.add(lblContractorName,0,0);
     contractorPane.add(lblContractorNumber,0,1);
     contractorPane.add(lblContractorStreet,0,2);
     contractorPane.add(lblContractorCity,0,3);
     contractorPane.add(lblContractorZip,0,4);
     contractorPane.add(lblContractorState,0,5);
     contractorPane.add(txtContractorName,1,0);
     contractorPane.add(txtContractorNumber,1,1);
     contractorPane.add(txtContractorStreet,1,2);
     contractorPane.add(txtContractorCity,1,3);
     contractorPane.add(txtContractorZip,1,4);
     contractorPane.add(cmboCState,1,5);
     contractorPane.add(btnExitContractor,1,6);
     contractorPane.add(btnSaveContractor,0,6);
     btnCreateContractor.setOnAction(e->{
         contractorStage.show();
     });
     btnExitContractor.setOnAction( e -> {
         contractorStage.close();
     });
     contractorPane.setVgap(20);
     contractorPane.setHgap(20);
       
//Creating the new customer 
        GridPane createCustPane = new GridPane();
        createCustPane.setAlignment(Pos.CENTER);
        Stage createCustStage = new Stage();
        Scene createCustScene = new Scene(createCustPane, 660,600);
        createCustStage.setTitle("Create New Customer");
        createCustStage.setScene(createCustScene);
        Label lblNew = new Label ("CREATING NEW CUSTOMER");
        createCustPane.add(lblNew,0,0);
        createCustPane.add(lblFName,0,1);
        createCustPane.add(lblLName,0,2);
        createCustPane.add(lblStreet,0,3);
        createCustPane.add(lblCity,0,4);
        createCustPane.add(lblZip,0,5);
        createCustPane.add(lblState,0,6);
        createCustPane.add(lblPhone,0,7);
        createCustPane.add(lblNotes,0,8);
        createCustPane.add(txtFName, 1,1);
        createCustPane.add(txtLName, 1,2);
        createCustPane.add(txtStreet, 1,3);
        createCustPane.add(txtCity, 1,4);
        createCustPane.add(txtZip,1,5);
        createCustPane.add(cmboStates,1,6);
        createCustPane.add(txtPhone,1,7);
        createCustPane.add(notesScrollPane,1,8);
        createCustPane.add(btnExitCust,1,9);
        createCustPane.add(btnSaveCustInfo,0,9);
        btnExitCust.setOnAction(e ->{
            createCustStage.close();
        });
       btnSaveCustInfo.setOnAction(e ->{
        
            //resize the array
            customerArray = Arrays.copyOf(customerArray, 
            customerArray.length + 1); // resizes the customerArray
            
            customerArray[customerCount] = new Customer(txtFName.getText(), txtLName.getText(), txtCity.getText(), 
                cmboStates.getSelectionModel().getSelectedItem().toString(), txtStreet.getText(), 
                Integer.parseInt(txtZip.getText()), Long.parseLong(txtPhone.getText()), notesScrollPane.getContent().toString());
            customerCount++;
            txtFName.clear();
            txtLName.clear();
            txtStreet.clear();
            txtZip.clear();
            txtCity.clear();
            txtPhone.clear();
            
        });
    
    //Setting create new customer button on action 
        btnCreateCust.setOnAction(e ->{
            createCustStage.show();
        }); 
             createCustPane.setHgap(20);
             createCustPane.setVgap(20);
             
//Creating the edit menu
        GridPane editPane = new GridPane();
        editPane.setAlignment(Pos.CENTER);
        Stage editStage = new Stage();
        Scene editScene = new Scene(editPane, 400,400);
        editStage.setTitle("Edit Menu Options");
        editStage.setScene(editScene); 
        editPane.add(btnEditCustomer,0,0);
        editPane.add(btnEditItem, 0,1);
        editPane.add(btnEditSale,0,2);
        editPane.add(btnEditVendor,0,3);
        editPane.add(btnEditContractor, 0, 4);
        editPane.add(btnEditExit,0,5);
        btnEdit.setOnAction(e -> {
          editStage.show();  
        });
        btnEditExit.setOnAction (e -> {
            editStage.close();
        }); 
        editPane.setHgap(20);
        editPane.setVgap(20);
        
    //Editing a Customer
        ObservableList ecStates = FXCollections.observableArrayList();
        ComboBox cmboEditCust = new ComboBox();
        ecStates.add("AL - Alabama");
        ecStates.add("AK - Alaska");
        ecStates.add("AZ - Arizona");
        ecStates.add("AR - Arkansas");
        ecStates.add("CA - California");
        ecStates.add("CO - Colorado");
        ecStates.add("CT - Connecticut");
        ecStates.add("DE - Deleware");
        ecStates.add("FL - Florida");
        ecStates.add("GA - Georgia");
        ecStates.add("HI - Hawaii");
        ecStates.add("ID - Idaho");
        ecStates.add("IL - Illinois");
        ecStates.add("IN - Indiana");
        ecStates.add("IA - Iowa");
        ecStates.add("KS - Kansas");
        ecStates.add("KY - Kentucky");
        ecStates.add("LA - Louisiana");
        ecStates.add("ME - Maine");
        ecStates.add("MD - Maryland");
        ecStates.add("MA - Massachusetts");
        ecStates.add("MI - Michigan");
        ecStates.add("MN - Minnesota");
        ecStates.add("MS - Mississippi");
        ecStates.add("MO - Missouri");
        ecStates.add("MT - Montana");
        ecStates.add("NE - Nebraska");
        ecStates.add("NV - Nevada");
        ecStates.add("NH - New Hampshire");
        ecStates.add("NJ - New Jersey");
        ecStates.add("NM - New Mexico");
        ecStates.add("NY - New York");
        ecStates.add("NC - North Carolina");
        ecStates.add("ND - North Dakota");
        ecStates.add("OH - Ohio");
        ecStates.add("OK - Oklahoma");
        ecStates.add("OR - Oregon");
        ecStates.add("PA - Pennsylvania");
        ecStates.add("RI - Rhode Island");
        ecStates.add("SC - South Carolina");
        ecStates.add("SD - South Dakota");
        ecStates.add("TN - Tennessee");
        ecStates.add("TX - Texas");
        ecStates.add("UT - Utah");
        ecStates.add("VT - Vermont");
        ecStates.add("VA - Virginia");
        ecStates.add("WA - Washington");
        ecStates.add("WV - West Virginia");
        ecStates.add("WI - Wisconsin");
        ecStates.add("WY - Wyoming");

        
        GridPane editCustomer = new GridPane();
        editCustomer.setAlignment(Pos.CENTER);
        Stage editCustomerStage = new Stage();
        Scene editCustomerScene = new Scene(editCustomer, 660, 600);
        editCustomerStage.setTitle("Edit a Customer");
        editCustomerStage.setScene(editCustomerScene);
        //create all the items
        Label lblEdit = new Label("Edit an Existing Customer");
        Label ElblFName = new Label("First Name");
        Label ElblLName = new Label("Last Name");
        Label ElblStreet = new Label("Street");
        Label ElblCity = new Label("City");
        Label ElblZip = new Label("Zip Code");
        Label ElblState = new Label("State");
        Label ElblPhone = new Label("Phone Number");
        Label ElblNotes = new Label("Notes");
        TextField EtxtFName = new TextField();
        TextField EtxtLName = new TextField();
        TextField EtxtStreet = new TextField();
        TextField EtxtCity = new TextField();
        TextField EtxtZip = new TextField();
        TextField EtxtPhone = new TextField();
        TextField EtxtCID = new TextField();
        ScrollPane EnotesScrollPane = new ScrollPane();
        ComboBox EcmboStates = new ComboBox(ecStates);
        Button EbtnExitCust = new Button("Exit");
        Button EbtnSaveCustInfo = new Button("Save");
        Button btnSelect = new Button("Select");
        Label lblCustID = new Label("Customer ID");
        
        
        editCustomer.add(lblEdit,0,0);
        editCustomer.add(ElblFName,0,2);
        editCustomer.add(ElblLName,0,3);
        editCustomer.add(ElblStreet,0,4);
        editCustomer.add(ElblCity,0,5);
        editCustomer.add(ElblZip,0,6);
        editCustomer.add(ElblState,0,7);
        editCustomer.add(ElblPhone,0,8);
        editCustomer.add(ElblNotes,0,9);
        editCustomer.add(EtxtFName, 1,2);
        editCustomer.add(EtxtLName, 1,3);
        editCustomer.add(EtxtStreet, 1,4);
        editCustomer.add(EtxtCity, 1,5);
        editCustomer.add(EtxtZip,1,6);
        editCustomer.add(EcmboStates,1,7);
        editCustomer.add(EtxtPhone,1,8);
        editCustomer.add(EnotesScrollPane,1,9);
        editCustomer.add(EbtnExitCust,1,10);
        editCustomer.add(EbtnSaveCustInfo,0,10);
        editCustomer.add(cmboEditCust,1,1);
        editCustomer.add(lblCustID,0,1);
        editCustomer.add(btnSelect,2,1);
        
        btnSelect.setOnAction(e -> {
            int customerID=0;
            for(int i = 0; i < customerArray.length; i++)
            {
                if(customerArray[i].shortString().equals(cmboEditCust.getSelectionModel().getSelectedItem().toString()))
                    customerID = customerArray[i].getId();
            }
            EtxtFName.setText(customerArray[customerID - 1000].firstName);
            EtxtLName.setText(customerArray[customerID - 1000].lastName);
            EtxtStreet.setText(customerArray[customerID - 1000].street);
            EtxtCity.setText(customerArray[customerID - 1000].city);
            EcmboStates.getSelectionModel().select(customerArray[customerID - 1000].state);
            EtxtZip.setText(String.valueOf(customerArray[customerID - 1000].zip));
            EtxtPhone.setText(String.valueOf(customerArray[customerID - 1000].phoneNumber));
        });
        
        EbtnSaveCustInfo.setOnAction(e -> {
            int customerID = 0;
            for(int i = 0; i < customerArray.length; i++)
            {
                if(customerArray[i].shortString().equals(cmboEditCust.getSelectionModel().getSelectedItem().toString()))
                    customerID = customerArray[i].getId();
            }
        cmboEditCust.getItems().remove(0, customerArray.length);
        customerArray[customerID - 1000].firstName = EtxtFName.getText();
        customerArray[customerID - 1000].lastName = EtxtLName.getText();
        customerArray[customerID - 1000].city = EtxtCity.getText();
        customerArray[customerID - 1000].state = EcmboStates.getSelectionModel().getSelectedItem().toString();
        customerArray[customerID - 1000].street = EtxtStreet.getText();
        customerArray[customerID - 1000].zip = Integer.parseInt(EtxtZip.getText());
        customerArray[customerID - 1000].phoneNumber = Long.parseLong(EtxtPhone.getText());

        for (int i = 0; i < customerArray.length; i++)
            cmboEditCust.getItems().add(customerArray[i].shortString());

        });
        
        EbtnExitCust.setOnAction(e -> {
            editCustomerStage.close();
        });
        
        btnEditCustomer.setOnAction(e -> {
          editCustomerStage.show();  
          for (int i = 0; i < customerArray.length; i++)
            cmboEditCust.getItems().add(customerArray[i].shortString());
        
        });
        
        editCustomer.setHgap(20);
        editCustomer.setVgap(20);
        
        
    //Editing an Item
        ObservableList eiStates = FXCollections.observableArrayList();
        ComboBox cmboEditItem = new ComboBox();
        eiStates.add("AL - Alabama");
        eiStates.add("AK - Alaska");
        eiStates.add("AZ - Arizona");
        eiStates.add("AR - Arkansas");
        eiStates.add("CA - California");
        eiStates.add("CO - Colorado");
        eiStates.add("CT - Connecticut");
        eiStates.add("DE - Deleware");
        eiStates.add("FL - Florida");
        eiStates.add("GA - Georgia");
        eiStates.add("HI - Hawaii");
        eiStates.add("ID - Idaho");
        eiStates.add("IL - Illinois");
        eiStates.add("IN - Indiana");
        eiStates.add("IA - Iowa");
        eiStates.add("KS - Kansas");
        eiStates.add("KY - Kentucky");
        eiStates.add("LA - Louisiana");
        eiStates.add("ME - Maine");
        eiStates.add("MD - Maryland");
        eiStates.add("MA - Massachusetts");
        eiStates.add("MI - Michigan");
        eiStates.add("MN - Minnesota");
        eiStates.add("MS - Mississippi");
        eiStates.add("MO - Missouri");
        eiStates.add("MT - Montana");
        eiStates.add("NE - Nebraska");
        eiStates.add("NV - Nevada");
        eiStates.add("NH - New Hampshire");
        eiStates.add("NJ - New Jersey");
        eiStates.add("NM - New Mexico");
        eiStates.add("NY - New York");
        eiStates.add("NC - North Carolina");
        eiStates.add("ND - North Dakota");
        eiStates.add("OH - Ohio");
        eiStates.add("OK - Oklahoma");
        eiStates.add("OR - Oregon");
        eiStates.add("PA - Pennsylvania");
        eiStates.add("RI - Rhode Island");
        eiStates.add("SC - South Carolina");
        eiStates.add("SD - South Dakota");
        eiStates.add("TN - Tennessee");
        eiStates.add("TX - Texas");
        eiStates.add("UT - Utah");
        eiStates.add("VT - Vermont");
        eiStates.add("VA - Virginia");
        eiStates.add("WA - Washington");
        eiStates.add("WV - West Virginia");
        eiStates.add("WI - Wisconsin");
        eiStates.add("WY - Wyoming");

        
        GridPane editItem = new GridPane();
        editItem.setAlignment(Pos.CENTER);
        Stage editItemStage = new Stage();
        Scene editItemScene = new Scene(editItem, 500, 400);
        editItemStage.setTitle("Edit an Item");
        editItemStage.setScene(editItemScene);
        
        Button EbtnItemExit = new Button("Exit");
        Label lblItemID = new Label("Select an Item");
        Label ElblItem = new Label("Item");
        Label ElblWeight = new Label("Weight");
        Label ElblDescription = new Label("Description");
        Label ElblQuantity = new Label("Quantity");
        Label ElblSellingPrice = new Label("Selling Price");
        TextField EtxtItem = new TextField();
        TextField EtxtWeight = new TextField();
        TextField EtxtDescription = new TextField();
        TextField EtxtPurchasePrice = new TextField();
        TextField EtxtQuantity = new TextField();
        Button EbtnSaveInventory = new Button("Save");
        Button selectItem = new Button("Select");
        
        editItem.add(EbtnItemExit,1, 6);
        editItem.add(ElblItem, 0,1);
        editItem.add(ElblWeight,0,2);
        editItem.add(ElblDescription,0,3);
        editItem.add(ElblQuantity, 0,5);
        editItem.add(ElblSellingPrice,0,4);
        editItem.add(EtxtItem, 1,1);
        editItem.add(EtxtWeight,1,2);
        editItem.add(EtxtDescription,1,3);
        editItem.add(EbtnSaveInventory,0,6);
        editItem.add(EtxtPurchasePrice,1,4);
        editItem.add(EtxtQuantity, 1, 5);
        editItem.add(selectItem,2,0);
        editItem.add(lblItemID, 0,0);
        editItem.add(cmboEditItem, 1,0);
        
        selectItem.setOnAction(e -> {
            int itemID=0;
            for(int i = 0; i < itemArray.length; i++)
            {
                if(itemArray[i].shortString().equals(cmboEditItem.getSelectionModel().getSelectedItem().toString()))
                    itemID = itemArray[i].getItemID();
            }
            EtxtItem.setText(itemArray[itemID - 4000].itemName);
            EtxtWeight.setText(String.valueOf(itemArray[itemID - 4000].getWeight()));
            EtxtDescription.setText(itemArray[itemID - 4000].description);
            EtxtPurchasePrice.setText(String.valueOf(itemArray[itemID - 4000].getpurchasePrice()));
            EtxtQuantity.setText(String.valueOf(itemArray[itemID - 4000].getQuantity()));
        });
        
        EbtnSaveInventory.setOnAction(e -> {
            int itemID = 0;
            for(int i = 0; i < itemArray.length; i++)
            {
                if(itemArray[i].shortString().equals(cmboEditItem.getSelectionModel().getSelectedItem().toString()))
                    itemID = itemArray[i].getItemID();
            }
            cmboEditItem.getItems().remove(0, itemArray.length);
            itemArray[itemID - 4000].setName(EtxtItem.getText());
            itemArray[itemID - 4000].setWeight(Double.parseDouble(EtxtWeight.getText()));
            itemArray[itemID - 4000].setDescription(EtxtDescription.getText());
            itemArray[itemID - 4000].setpurchasePrice(Double.parseDouble(EtxtPurchasePrice.getText()));
            //itemArray[itemID - 4000].setQuantity(Integer.parseInt(EtxtQuantity.getText()));
            for(int i = 0; i < itemArray.length; i++)
            {
                cmboEditItem.getItems().add(itemArray[i].shortString());
            }
        });
        EbtnItemExit.setOnAction(e -> {
          editItemStage.close();  
        });
        btnEditItem.setOnAction(e -> {
            editItemStage.show();
            for (int i = 0; i < itemArray.length; i++)
            cmboEditItem.getItems().add(itemArray[i].shortString());
              
        });
        editItem.setHgap(20);
        editItem.setVgap(20);
        
    //Editing a Sale
        GridPane editSalePane = new GridPane();
        editSalePane.setAlignment(Pos.CENTER);
        Stage editSaleStage = new Stage();
        Scene editSaleScene = new Scene(editSalePane, 500, 400);
        editSaleStage.setTitle("Edit a Sale");
        editSaleStage.setScene(editSaleScene);
        editSalePane.add(cmboEditSales,0,0);
         btnEditSale.setOnAction(e ->{
             editSaleStage.show();
         });    
        
    //Editing a Vendor
        GridPane editVendor = new GridPane();
        editVendor.setAlignment(Pos.CENTER);
        Stage editVendorStage = new Stage();
        Scene editVendorScene = new Scene(editVendor,660,600);
        editVendorStage.setTitle("Edit a Vendor");
        editVendorStage.setScene(editVendorScene);
        editVendor.add(cmboEditVendor,0,0);
        btnEditVendor.setOnAction(e ->{
            editVendorStage.show();
        });
        
    //Editing a Contractor
        GridPane editContractor = new GridPane();
        editContractor.setAlignment(Pos.CENTER);
        Stage editContractorStage = new Stage();
        Scene editContractorScene = new Scene(editContractor,660,600);
        editContractorStage.setTitle("Edit a Contractor");
        editContractorStage.setScene(editContractorScene);
        editContractor.add(cmboEditContractor,0,0);
        btnEditContractor.setOnAction(e ->{
            editContractorStage.show();
        });
            
        
 //Creating print receipt option
        GridPane printReceiptPane = new GridPane();
        printReceiptPane.setAlignment(Pos.CENTER);
        Stage printReceiptStage = new Stage();
        Scene printReceiptScene = new Scene(printReceiptPane, 550,400);
        printReceiptStage.setTitle("Print Receipt");
        printReceiptStage.setScene(printReceiptScene); 
        taReceipt.setWrapText(true);
        Label lblTitle = new Label ("Printing Receipt");
        printReceiptPane.add(lblTitle,0,0);
        printReceiptPane.add(cmboCustReceipt,0,1);
        printReceiptPane.add(btnPrintExit,0,2);
        btnPrint.setOnAction(e -> {
            printReceiptStage.show();
        });
        btnPrintExit.setOnAction(e ->{
            printReceiptStage.close();
        });
        printReceiptPane.setVgap(20);
        printReceiptPane.setHgap(20);


  //Main Menu 
        Label lblMain = new Label (" Valley Depot's Main Menu"); 
        GridPane primaryPane = new GridPane(); 
        primaryPane.setAlignment(Pos.CENTER);
        primaryPane.add(lblMain, 1, 0);
        Scene primaryScene = new Scene(primaryPane,400,400); 
        primaryStage.setTitle("Valley Depot System");
        primaryStage.setScene(primaryScene);
        primaryStage.show();
        primaryPane.add(btnCustPurchase,1,1); 
        primaryPane.add(btnItemPurch,1,2);
        primaryPane.add(btnCurrentInv,1,3);
        primaryPane.add(btnCreateMenu,1,4);
        primaryPane.add(btnEdit,1,5);
        primaryPane.add(btnPrint,1,6);
        primaryPane.add(btnExit,1,7);
        primaryPane.setVgap(20);
        primaryPane.setHgap(20);
      

        btnCreateMenu.setOnAction(e -> {
          createStage.show(); 
        });
       btnItemPurch.setOnAction(e -> {
           itemPurchStage.show(); 
       });

       btnCurrentInv.setOnAction(e -> {
           currentInvStage.show();
       });
       btnEdit.setOnAction(e -> {
           editStage.show();
       });

       btnPrint.setOnAction( e ->{
           printReceiptStage.show();
       });

       btnExit.setOnAction(e ->{
           custPurchStage.close();
           createCustStage.close();
           itemPurchStage.close();
           currentInvStage.close();
           editStage.close();
           printReceiptStage.close();
           primaryStage.close();
       });
       btnVendor.setOnAction(e -> {
           vendorStage.show();
       });

    } //end of start

    public static void main(String[] args) {
        launch(args);
    }
    
}
