/*
CIS 331 Section 2 
Group Project Part 2.
Authors: Zach Beatty, Eric Carter, Mercy Clemente, Michael Corcoran & Troy Goddard
*/
package GroupProject331;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.collections.*;
import javafx.event.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class MainApp extends Application {
    
    @Override
    public void start(Stage primaryStage) {
    ArrayList customersList = new ArrayList(); 
    ArrayList contractorsList = new ArrayList();
    ArrayList vendorsList = new ArrayList();
    ArrayList itemList = new ArrayList();
    ArrayList salesList = new ArrayList();
    
        
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
        Button btnCreateVendor = new Button ("Create New Vendor");
        Button btnCreateSale = new Button ("Create New Sale");
        Button btnExitCreate = new Button ("Exit");
        createPane.add(btnCreateCust,1,0);
        createPane.add(btnCreateItem,1,1);
        createPane.add(btnCreateVendor,1,2);
        createPane.add(btnCreateSale,1,3);
        createPane.add(btnExitCreate,1,4);
        btnExitCreate.setOnAction(e ->{
            createStage.close();
        });
        createPane.setHgap(20);
        createPane.setVgap(20);
        
//Creating the new customer 
        GridPane createCustPane = new GridPane();
        createCustPane.setAlignment(Pos.CENTER);
        Stage createCustStage = new Stage();
        Scene createCustScene = new Scene(createCustPane, 400,400);
        createCustStage.setTitle("Create New Customer");
        createCustStage.setScene(createCustScene);
        Label lblFName = new Label ("First Name:");
        Label lblLName = new Label ("Last Name:");
        Label lblStreet = new Label ("Enter Street:");
        Label lblCity = new Label ("Enter City:");
        Label lblState = new Label ("Select State:");
        Label lblPhone = new Label ("Enter Phone Number:"); 
        Label lblCustNotes = new Label("Enter Any Necessary Notes:");
        Label lblNew = new Label ("CREATING NEW CUSTOMER");
        TextField txtFName = new TextField();
        TextField txtLName = new TextField();
        TextField txtStreet = new TextField();
        TextField txtCity = new TextField();
        TextField txtPhone = new TextField();
        TextField txtCustNotes = new TextField();
        Button btnExitCust = new Button("Exit");
        Button btnSaveCustInfo = new Button("Save");
       ObservableList olState = FXCollections.observableArrayList();
        olState.add("AL");
        olState.add("AK");
        olState.add("AZ");
        olState.add("AR");
        olState.add("CA");
        olState.add("CO");
        olState.add("CT");
        olState.add("DE");
        olState.add("FL");
        olState.add("GA");
        olState.add("HI");
        olState.add("ID");
        olState.add("IL");
        olState.add("IN");
        olState.add("IA");
        olState.add("KS");
        olState.add("KY");
        olState.add("LA");
        olState.add("ME");
        olState.add("MD");
        olState.add("MA");
        olState.add("MI");
        olState.add("MN");
        olState.add("MS");
        olState.add("MO");
        olState.add("MT");
        olState.add("NE");
        olState.add("NV");
        olState.add("NV");
        olState.add("NH");
        olState.add("NJ");
        olState.add("NM");
        olState.add("NY");
        olState.add("NC");
        olState.add("ND");
        olState.add("OH");
        olState.add("OK");
        olState.add("OR");
        olState.add("PA");
        olState.add("RI");
        olState.add("SC");
        olState.add("SD");
        olState.add("TN");
        olState.add("TX");
        olState.add("UT");
        olState.add("VT");
        olState.add("VA");
        olState.add("WA");
        olState.add("WV");
        olState.add("WI");
        olState.add("WY");
        ComboBox cmboStates = new ComboBox(olState);
        createCustPane.add(lblNew,0,0);
        createCustPane.add(lblFName,0,1);
        createCustPane.add(lblLName,0,2);
        createCustPane.add(lblStreet,0,3);
        createCustPane.add(lblCity,0,4);
        createCustPane.add(lblState,0,5);
        createCustPane.add(lblPhone,0,6);
        createCustPane.add(lblCustNotes,0,7);
        createCustPane.add(txtFName, 1,1);
        createCustPane.add(txtLName, 1,2);
        createCustPane.add(txtStreet, 1,3);
        createCustPane.add(txtCity, 1,4);
        createCustPane.add(cmboStates,1,5);
        createCustPane.add(txtPhone,1,6);
        createCustPane.add(txtCustNotes,1,7);
        createCustPane.add(btnExitCust,1,8);
        createCustPane.add(btnSaveCustInfo,0,8);
        btnExitCust.setOnAction(e ->{
            createCustStage.close();
        });
        //Setting create new customer button on action 
        btnCreateCust.setOnAction(e ->{
            createCustStage.show();
        }); 
                
        
        //Creating the edit menu
        GridPane editPane = new GridPane();
        editPane.setAlignment(Pos.CENTER);
        Stage editStage = new Stage();
        Scene editScene = new Scene(editPane, 400,400);
        editStage.setTitle("Edit Menu Options");
        editStage.setScene(editScene); 
        
        //Creating the pane, stage, and scene for the print receipt option
        GridPane printReceiptPane = new GridPane();
        printReceiptPane.setAlignment(Pos.CENTER);
        Stage printReceiptStage = new Stage();
        Scene printReceiptScene = new Scene(printReceiptPane, 400,400);
        printReceiptStage.setTitle("Print Receipt");
        printReceiptStage.setScene(printReceiptScene); 

        //Main pane for the main menu system
        Label lblMain = new Label (" Valley Depot's Main Menu"); 
        GridPane primaryPane = new GridPane(); 
        primaryPane.setAlignment(Pos.CENTER);
        primaryPane.add(lblMain, 1, 0);
        Scene primaryScene = new Scene(primaryPane,400,400); 
        primaryStage.setTitle("Valley Depot System");
        primaryStage.setScene(primaryScene);
        primaryStage.show();
        
     //Declaring data fields for the main pane menu and adding them to the pane
        Button btnCustPurchase = new Button("Go to Customer Purchase History"); 
        Button btnItemPurch = new Button("Go to Item Purchase History");
        Button btnCurrentInv = new Button ("Go to Current Inventory Levels");
        Button btnCreateMenu = new Button ("Go to the 'Create' Menu");
        Button btnEdit = new Button ("Go to  the 'Edit' Menu"); 
        Button btnPrint = new Button("Print Receipt");
        Button btnExit = new Button ("Exit"); 

        primaryPane.add(btnCustPurchase,1,1); 
        primaryPane.add(btnItemPurch,1,2);
        primaryPane.add(btnCurrentInv,1,3);
        primaryPane.add(btnCreateMenu,1,4);
        primaryPane.add(btnEdit,1,5);
        primaryPane.add(btnPrint,1,6);
        primaryPane.add(btnExit,1,7);
        primaryPane.setVgap(10);
        primaryPane.setHgap(10);
      
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
   
      
      
    
    
    } //end of start

       
        
    
    
  
    public static void main(String[] args) {
        launch(args);
    }
    
}
