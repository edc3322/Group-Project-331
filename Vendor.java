/*
CIS 331 Section 2 
Group Project Part 1.
Authors: Zach Beatty, Eric Carter, Mercy Clemente, Michael Corcoran & Troy Goddard
 */


package project331;

public class Vendor 
{
   private int vID;
   public String businessName,  street, city, state;
   public long phoneNumber;
   public int zip; 
    
public Vendor(int vID, String businessName, String street, String city, 
        String state, int zip, long phoneNumber)
    {
        this.businessName = businessName;
        this.street = street; 
        this.city = city;
        this.state = state;
        this.zip = zip; 
        this.phoneNumber = phoneNumber;
        this.vID=vID;
    }
    
    public void setBusinessName(String newName)
    {
        this.businessName = newName;
    }
    public void setStreet(String newStreet)
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
    public void setZip (int zip)
    {
        this.zip=zip; 
    }
    public void setPhoneNumber(long newNumber)
    {
        this.phoneNumber = newNumber;
    }
    public void setVID(int vID)
    {
        this.vID=vID;
    }
    public int getVID()
    {
        return this.vID;
    }
    
    @Override
    public String toString()
    {
      String returnString = String.format("%-12d" + "%-16s"  +" %-16s" + " %-12s"
     + " %-10d" + " %-9d",this.vID, this.businessName, this.city, this.state, 
     this.zip, this.phoneNumber);
        return  returnString;
    }
}
