package Project331;


public class Sale {
    int saleID = 3000;
    Item itemSold;
    double sellingPrice;
    int quantity;
    String customer;
    String date;
    
    public Sale(Item itemSold, double sellingPrice, int quantity, String customer, String date)
    {
        this.itemSold = itemSold;
        this.sellingPrice = sellingPrice;
        this.quantity = quantity;
        this.customer = customer;
        this.date = date;
        this.saleID++;
    }
    
    public void printReceipt()
    {
        String saleReceipt = "Item Sold: " + itemID.itemSold + ", Selling Price: $" + String.valueOf(itemID.sellPrice()) + ", Quantity: " + String.valueOf(quantity) + ", Sale Total: $" + String.valueOf(quantity * itemID.sellPrice());
        System.out.println(saleReceipt);
    
    
    
}
