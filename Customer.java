/*
 CIS 331 Section 2 
 Group Project Part 1.
 Authors: Zach Beatty, Eric Carter, Mercy Clemente, & Troy God
 */

package project331;

/**
 *
 * @author edc33
 */
public class Customer 
{
    int cId = 1000;
    int zip;
    long phoneNumber;
    String firstName, lastName, city, state, street;
    
public Customer(String firstName, String lastName, String city, String state, 
         String street, int zip, long phoneNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.street = street; 
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.cId++;
    }
    
    // setter for firstName for editing customerss
    public void setFirstName(String newName) 
    {
        this.firstName = newName;
    }
    
    public void setLastName(String newName)
    {
        this.lastName = newName;
    }
    
    public void setCity(String newCity)
    {
        this.city = newCity;
    }
    
    public void setState(String newState)
    {
        this.state = newState;
    }
    
    public void setStreet (String newStreet)
    {
        this.street=newStreet; 
    }
    public void setZip(int newZip)
    {
        this.zip = newZip;
    }
    
    public void setPhoneNumber(long newNumber)
    {
        this.phoneNumber = newNumber;
    }
    
    public int getId()
    {
        return this.cId;
    }
                
    
    @Override
    public String toString()
    {
      String returnString = String.format("%-12d" + " %-16s" + " %-16s" + " %-16s" 
      + " %-16s" + " %-12s" + " %-10d" + " %-9d", this.cId, this.firstName, 
      this.lastName, this.city, this.street, this.state, this.zip, this.phoneNumber);
        return  returnString;
    }
    
}
