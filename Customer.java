/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    String firstName, lastName, city, state;
    
    public Customer(String firstName, String lastName, String city, String state, int zip, long phoneNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.cID++;
    }
    
    public void setFirstName(String newName) // setter for firstName for editing customers
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
        return this.cID;
    }
    
    public long getValidPhone (Scanner in)
    {
        long phoneNumber = 0; 
        while (true) 
        {
            try 
            {
                System.out.print("Enter a 10 digit phone number: ");
                phoneNumber = in.nextInt(); 
                if (phoneNumber>0 && Long.toString(phoneNumber).length() ==10)
                    break; 
            } catch (InputMismatchException e)
            {in.nextLine();
              System.out.println("Invalid input: Use digits 0 - 9"); 
             continue; 
            } 
            System.out.println("Invalid input: Not 10 digits long");
        }
        return phoneNumber;
    }
                
    
    @Override
    public String toString()
    {
        String returnString = String.format("%-12d" + " %-16s" + " %-16s" + " %-16s" + " %-12s" + " %-10d" + " %-9d",
                this.cID, this.firstName, this.lastName, this.city, this.state, this.zip, this.phoneNumber);
        return  returnString;
    }
    
}
