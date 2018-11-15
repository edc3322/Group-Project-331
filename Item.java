/*
 CIS 331 Section 2 
 Group Project Part 1.
 Authors: Zach Beatty, Eric Carter, Mercy Clemente, & Troy Goddard
 */
package Project331;

public class Item 
{
private int itemID = 4000;
public String itemName;
public double weight;
public String description;
private double purchasePrice;
public double sellPrice;

public Item(String itemName, double weight, String description, double 
    purchasePrice, double sellPrice)
{
	this.itemName = itemName;
	this.weight = weight;
	this. description = description;
	this.purchasePrice = purchasePrice;
	this.sellPrice = sellPrice;
	this.itemID++;
}
public boolean setpurchasePrice(double purchasePrice)
{
    if (purchasePrice > 0)
    {
	this.purchasePrice = purchasePrice;
	return true;
    }
	else
	return false;
}
public double getpurchasePrice()
{
    return purchasePrice;
}

public static void addItem (String itemName, double weight, String description,
        double purchasePrice, double sellingPrice)
{
    System.out.println("Enter Item Name: \nEnter Item Weight: \nEnter "
    + "Description of Item: \nEnter Purchase Price of Item: $ \nEnter Selling"
    + " Price of Item: $");
}

	@Override
public String toString()
{
    String returnString = String.format("%-12d" + " %-16s" + " %-16f" + " %-20s" + " %-12f" + " %-12f",
                this.itemID, this.itemName, this.weight, this.description, this.purchasePrice, this.sellPrice);
    return returnString;
}
	
}

