/*
 CIS 331 Section 2 
 Group Project Part 1.
 Authors: Zach Beatty, Eric Carter, Mercy Clemente, & Troy Goddard
 */

package project331;

public class Vendor 
{
   private int vID = 5000;
   public String businessName, address, street, city, state;
   public long phoneNumber;
    
public Vendor(String businessName, String address, String street, String city, String state, long phoneNumber)
    {
        this.businessName = businessName;
        this.address = address;
        this.street = street; 
        this.city = city;
        this.state = state;
        this.phoneNumber = phoneNumber;
        this.vID++;
    }
    
    public void setBusinessName(String newName)
    {
        this.businessName = newName;
    }
    public void setAddress(String newAddress)
    {
        this.address = newAddress;
    }
   public void setStreet (String newStreet)
    {
        this.street = newStreet; 
    }
    public void setCity(String newCity)
    {
        this.city = newCity;
    }
    public void setState(String newState)
    {
        this.state = newState;
    }
    public void setPhoneNumber(long newNumber)
    {
        this.phoneNumber = newNumber;
    }
    
    public int getVID()
    {
        return this.vID;
    }
    
    @Override
    public String toString()
    {
        String returnString = String.format("%-12d" + "%-16s" + " %-16s" + " %-16s" + " %-16s" + " %-12s" + " %-9d",
                this.vID, this.businessName, this.address, this.street, this.city, this.state, this.phoneNumber);
        return  returnString;
    }
}
