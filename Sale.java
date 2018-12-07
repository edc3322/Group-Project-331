/*
CIS 331 Section 2 
Group Project Part 1.
Authors: Zach Beatty, Eric Carter, Mercy Clemente, Michael Corcoran & Troy Goddard
 */
package GroupProject331;



public class Sale {
   private static int saleCount = 3000;
   private  int saleID;
   String  itemName;
   public double sellingPrice;
   public int quantity;
   public String customer;
   public String date;
    
   
    public Sale (String itemName, double sellingPrice, int quantity, String customer, String date)
    {
        this.saleID = saleCount;
        saleCount++;
        this.itemName=itemName;
        this.sellingPrice = sellingPrice;
        this.quantity = quantity;
        this.customer = customer;
        this.date = date;
    }
    
    //setting sale Id
    public void setSaleID(int saleID)
    {
        this.saleID=saleID;
    }
    public int getSaleID()
    {
        return this.saleID; 
    }
    public void setItemName(String itemName)
    {
        this.itemName=itemName;
    }
   
    public void setSellingPrice (double sellingPrice)
    {
        this.sellingPrice=sellingPrice;
    }
    public void setQuantity (int quantity)
    {
        this.quantity=quantity;
    }
    
    public void setCustomer (String customer)
    {
        this.customer=customer; 
    }
    
    public void setDate(String date)
    {
        this.date=date; 
    }
    
    public String getItemName()
    {
        return this.itemName;
    }
    public double getSellingPrice()
    {
        return this.sellingPrice; 
    }
    
    public int getQuantity()
    {
        return this.quantity;
    }
    
    public String getCustomer()
    {
        return this.customer;
    }
    
    public String getDate()
    {
        return this.date; 
    }
    
    public void printReceipt()
    {
        String saleReceipt = "Item Sold: " + itemName + ", Selling "
        + "Price: $" + String.valueOf(this.sellingPrice) + ", Quantity: " + 
        String.valueOf(quantity) + ", Sale Total: $" + String.valueOf(quantity 
         * this.sellingPrice);
        System.out.println(saleReceipt);
    }

    @Override
    public String toString()
    {
        String returnString = String.format("%-12d" + " %-20s" + " %-12.2f" + " %-10d" 
        + " %-20s" + " %-12s", this.saleID, this.itemName, this.sellingPrice, 
        this.quantity, this.customer, this.date);
        return returnString;
    }

    public int getCount()
    {
        return saleCount - 3000;
    }
}
