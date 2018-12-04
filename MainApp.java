/*
CIS 331 Section 2 
Group Project Part 2.
Authors: Zach Beatty, Eric Carter, Mercy Clemente, Michael Corcoran & Troy Goddard
*/
package GroupProject331;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.collections.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
       //Declaring neccessary fields, labels, etc.
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
    TextArea taNotes = new TextArea();
    ScrollPane notesScrollPane = new ScrollPane(taNotes);
    ObservableList olState = FXCollections.observableArrayList();
    
    Button btnCustPurchase = new Button("Go to Customer Purchase History"); 
    Button btnItemPurch = new Button("Go to Item Purchase History");
    Button btnCurrentInv = new Button ("Go to Current Inventory Levels");
    Button btnCreateMenu = new Button ("Go to the 'Create' Menu");
    Button btnEdit = new Button ("Go to  the 'Edit' Menu"); 
    Button btnPrint = new Button("Print Receipt");
    Button btnExit = new Button ("Exit"); 

    ComboBox cmboStates = new ComboBox(olState);
    
    taNotes.setWrapText(true);    
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
    
        //Creating the pane stage and scene for customer purchase history 
        GridPane custPurchPane = new GridPane();
        custPurchPane.setAlignment(Pos.CENTER);
        Stage custPurchStage = new Stage();
        Scene custPurchScene = new Scene(custPurchPane, 400,400);
        custPurchStage.setTitle("Customer Purchase History");
        custPurchStage.setScene(custPurchScene);
        
        //Creating the pane, stage, and scene for item purchase history
        GridPane itemPurchPane = new GridPane();
        itemPurchPane.setAlignment(Pos.CENTER);
        Stage itemPurchStage = new Stage();
        Scene itemPurchScene = new Scene(itemPurchPane, 400,400);
        itemPurchStage.setTitle("Item Purchase History");
        itemPurchStage.setScene(itemPurchScene); 
        
        //Creating the pane, stage, and scene for the current inventory 
        GridPane currentInvPane = new GridPane();
        currentInvPane.setAlignment(Pos.CENTER);
        Stage currentInvStage = new Stage();
        Scene currentInvScene = new Scene(currentInvPane, 400,400);
        currentInvStage.setTitle("Current Inventory Levels");
        currentInvStage.setScene(currentInvScene); 
        
        //Create menu 
        GridPane createPane = new GridPane();
        createPane.setAlignment(Pos.CENTER);
        Stage createStage = new Stage();
        Scene createScene = new Scene(createPane, 400,400);
        createStage.setTitle("Create Menu Options");
        createStage.setScene(createScene); 
        Button btnCreateCust = new Button ("Create New Customer");
        Button btnCreateItem = new Button ("Create New Item");
        Button btnVendor = new Button ("Create New Vendor");
        Button btnCreateSale = new Button ("Create New Sale");
        Button btnExitCreate = new Button ("Exit");
        createPane.add(btnCreateCust,1,0);
        createPane.add(btnCreateItem,1,1);
        createPane.add(btnVendor,1,2);
        createPane.add(btnCreateSale,1,3);
        createPane.add(btnExitCreate,1,4);
        btnExitCreate.setOnAction(e ->{
            createStage.close();
        });
        createPane.setHgap(20);
        createPane.setVgap(20);
        
//Create new Vendor
        GridPane vendorPane = new GridPane();
        vendorPane.setAlignment(Pos.CENTER);
        Stage vendorStage = new Stage();
        Scene vendorScene = new Scene(vendorPane, 800,500);
        vendorStage.setTitle("Create Vendor");
        vendorStage.setScene(vendorScene);
        Button btnVendorExit = new Button("Exit");
        vendorPane.add(btnVendorExit,1,7);
        Label lblNewT = new Label("Creating a New Vendor");
        vendorPane.add(lblNewT,0,7);
        vendorPane.add(lblFName,0,0);
        vendorPane.add(lblLName,0,1);
        vendorPane.add(lblStreet,0,2);
        vendorPane.add(lblCity,0,3);
        vendorPane.add(lblState,0,4);
        vendorPane.add(lblZip,0,5);
        vendorPane.add(lblNotes,0,6);
        vendorPane.add(txtFName,1,0);
        vendorPane.add(txtLName,1,1);
        vendorPane.add(txtStreet,1,2);
        vendorPane.add(txtCity,1,3);
        vendorPane.add(cmboStates,1,4);
        vendorPane.add(txtZip,1,5);
        vendorPane.add(notesScrollPane,1,6);
        btnVendor.setOnAction(e ->{
            vendorStage.show();
        }); 
         btnVendorExit.setOnAction(e ->{
            vendorStage.close();
        });
        vendorPane.setHgap(20);
        vendorPane.setVgap(20);   
        
//Create new sale menu 
        GridPane salePane = new GridPane();
        salePane.setAlignment(Pos.CENTER);
        Stage saleStage = new Stage();
        Scene saleScene = new Scene(salePane,400,400);
        saleStage.setTitle("Create New Sale");
        saleStage.setScene(saleScene);
        Button btnSaleExit = new Button ("Exit");
        salePane.add(lblItem,0,0);
        salePane.add(lblSellingPrice,0,1);
        salePane.add(lblQuantity, 0,2); 
        salePane.add(lblCustomerName,0,3);
        salePane.add(txtItem, 1,0);
        salePane.add(txtSellingPrice,1,1);
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
        Scene createItemScene = new Scene(createItemPane, 400,400);
        createItemStage.setTitle("Create New Item");
        createItemStage.setScene(createItemScene);
        Button btnItemExit = new Button ("Exit"); 
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
            
//Creating the new customer 
        GridPane createCustPane = new GridPane();
        createCustPane.setAlignment(Pos.CENTER);
        Stage createCustStage = new Stage();
        Scene createCustScene = new Scene(createCustPane, 800,650);
        createCustStage.setTitle("Create New Customer");
        createCustStage.setScene(createCustScene);
        Label lblNew = new Label ("CREATING NEW CUSTOMER");
        Button btnExitCust = new Button("Exit");
        Button btnSaveCustInfo = new Button("Save");
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
        Button btnEditExit = new Button("Exit");
        Button btnEditCustomer = new Button("Edit Customer");
        Button btnEditItem = new Button ("Edit Item");
        Button btnEditSale = new Button ("Edit Sale");
        Button btnEditVendor = new Button ("Edit Vendor"); 
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
        TextArea taReceipt = new TextArea(); 
        taReceipt.setWrapText(true);
        Label lblTitle = new Label ("Printing Receipt");
        Button btnPrintExit = new Button ("Exit");
        ScrollPane receiptScrollPane = new ScrollPane (taReceipt);
        printReceiptPane.add(lblTitle,0,0);
        printReceiptPane.add(receiptScrollPane,0,1);
        printReceiptPane.add(btnPrintExit,0,2);
        btnPrint.setOnAction(e -> {
            printReceiptStage.show();
        });
        btnPrintExit.setOnAction(e ->{
            printReceiptStage.close();
        });

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
      
        //Setting intial buttons to open the new stage's once clicked 
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
