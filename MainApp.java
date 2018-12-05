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
    Vendor[] vendorArray = new Vendor[3];
    Sale[] saleArray = new Sale[5];
    Item[] itemArray = new Item[10];
    int customerCount = 5;
    int vendorCount = 3;
    int saleCount = 5;
    int itemCount = 10;

   
    @Override
    public void start(Stage primaryStage) {
    
    //Prepopulating customers
    customerArray[0] = new Customer("Tom", "Jones", "Harrisonburg", "VA", "800 S. Main St.", 22807, 5408994545L);  
    customerArray[1] = new Customer("Evan", "Thompson", "Fairfax", "VA", "1932 Prince William", 22726, 7056785968L);
    customerArray[2] = new Customer ("Jim", "Smith", "Arlington", "VA", "775 Edward St", 07675, 2015647857L); 
    customerArray[3] = new Customer("Kate", "Andrews","Springfield","VA", "1032 Rustic St", 22676, 2745638976L);
    customerArray[4] = new Customer("Rob", "Sousa", "Fairfax", "VA", "45 Market Blvd", 89867, 3345789084L);
       
       
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
   TextArea taCustPurchHistory = new TextArea();
   TextArea taItemHistory = new TextArea();
   ScrollPane itemHistoryScrollPane = new ScrollPane(taItemHistory);
   ScrollPane receiptScrollPane = new ScrollPane (taReceipt);
   ScrollPane inventoryScrollPane = new ScrollPane(taInventory);
   ScrollPane custPurchHistoryPane = new ScrollPane(taCustPurchHistory);
   notesScrollPane.setPrefSize(350,150);
   custPurchHistoryPane.setPrefSize(400,250);
   inventoryScrollPane.setPrefSize(400,250);
   receiptScrollPane.setPrefSize(400,250);
   itemHistoryScrollPane.setPrefSize(400,250);

   taReceipt.setPrefSize(400,250);
   taInventory.setPrefSize(400,250);
   taCustPurchHistory.setPrefSize(400,250);
   taNotes.setPrefSize(350,150);
   taItemHistory.setPrefSize(400,250);
   
    Label lblItem = new Label("Item Name: ");
    Label lblWeight = new Label("Item Weight: ");
    Label lblDescription = new Label ("Item Description: ");
    Label lblPurchasePrice = new Label ("Item Purchase Price:");
    Label lblSellingPrice = new Label ("Item Selling Price:"); 
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
  
//Declaring all buttons 
    Button btnCustPurchase = new Button("View Customer Purchase History"); 
    Button btnItemPurch = new Button("View Item Purchase History");
    Button btnCurrentInv = new Button ("View Current Inventory Levels");
    Button btnCreateMenu = new Button ("Go to the 'Create' Menu");
    Button btnEdit = new Button ("Go to  the 'Edit' Menu"); 
    Button btnPrint = new Button("Print Receipt");
    Button btnExit = new Button ("Exit"); 
    Button btnCustPurchExit = new Button("Exit");
    Button btnPrintExit = new Button ("Exit");
    Button btnEditExit = new Button("Exit");
    Button btnEditCustomer = new Button("Edit Customer");
    Button btnEditItem = new Button ("Edit Item");
    Button btnEditSale = new Button ("Edit Sale");
    Button btnEditVendor = new Button ("Edit Vendor"); 
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
    
    //Setting button dimensions 
    btnSaveContractor.setPrefSize(200,10);
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
        custPurchStage.setScene(custPurchScene);
        custPurchPane.add(lblCustT,0,0);
        custPurchPane.add(custPurchHistoryPane,0,1);
        custPurchPane.add(btnCustPurchExit,0,2);
        btnCustPurchase.setOnAction(e ->{
            custPurchStage.show(); 
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
        itemPurchPane.add(itemHistoryScrollPane,0,1);
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
        vendorPane.add(txtVendorName,1,1);
        vendorPane.add(txtVendorStreet,1,2);
        vendorPane.add(txtVendorCity,1,3);
        vendorPane.add(cmboVStates,1,4);
        vendorPane.add(txtVendorZip,1,5);
        vendorPane.add(btnVendorSave,1,7);
        vendorPane.add(btnVendorExit, 0, 7);
        btnVendor.setOnAction(e ->{
            vendorStage.show();
        }); 
         btnVendorExit.setOnAction(e ->{
            vendorStage.close();
        });
         btnVendorSave.setOnAction(e ->{
             
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
        salePane.add(lblSaleItem,0,0);
        salePane.add(lblSalePrice,0,1);
        salePane.add(lblQuantity, 0,2); 
        salePane.add(lblCustomerName,0,3);
        salePane.add(txtSaleItem, 1,0);
        salePane.add(txtSalePrice,1,1);
        salePane.add(txtQuantity,1,2);
        salePane.add(txtCustomerName,1,3);
        salePane.add(btnSaleExit,1,4);
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
        createItemPane.add(lblPurchasePrice,0,3);
        createItemPane.add(lblSellingPrice,0,4);
        createItemPane.add(txtItem, 1,0);
        createItemPane.add(txtWeight,1,1);
        createItemPane.add(txtDescription,1,2);
        createItemPane.add(txtPurchasePrice,1,3);
        createItemPane.add(btnSaveInventory,0,5);
        createItemPane.add(txtSellingPrice,1,4);
 //Setting button on action 
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
                cmboStates.getSelectionModel().getSelectedItem().toString(), 
                txtStreet.getText(), Integer.parseInt(txtZip.getText()), Long.parseLong(txtPhone.getText()));
            customerCount++;
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
        editPane.add(btnEditExit,0,4);
        btnEdit.setOnAction(e -> {
          editStage.show();  
        });
        btnEditExit.setOnAction (e -> {
            editStage.close();
        }); 
        editPane.setHgap(20);
        editPane.setVgap(20);
        
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
        printReceiptPane.add(receiptScrollPane,0,1);
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
      
        //Setting intial buttons to open the new stages once clicked 
       btnCustPurchase.setOnAction(e -> {
           custPurchStage.show();
        });
     
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
