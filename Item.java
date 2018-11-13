/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project331;

public class Item 
{
public int itemID = 4000;
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
	itemID++;
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

}

