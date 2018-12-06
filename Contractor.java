/*
CIS 331 Section 2 
Group Project Part 1.
Authors: Zach Beatty, Eric Carter, Mercy Clemente, Michael Corcoran & Troy Goddard
 */


package GroupProject331;

public class Contractor extends Customer 
{
    private static int contractorCount = 6000;
    private int contractorID;
    public String contractingName; 
    public long contractorNumber; 
    public String contractorAddress; 
    Customer firstName; 
    
public Contractor (String firstName, String lastName, String street, String city, 
        String state, int zip, String contractingName, long contractorNumber)
    {
        super(firstName, lastName, street, city, state, zip, contractorNumber);
        this.contractingName = contractingName;
        this.contractorNumber = contractorNumber;
        this.contractorID = contractorCount;
        contractorCount++;
    }
    
    //setting the contractor company name
    public void setContractorName (String contractingName) 
    {
       this.contractingName = contractingName; 
    }
 
    
    //setting contractor company number
    public void setContractorNumber (long contractorNumber) 
    {
        this.contractorNumber = contractorNumber; 
    }
    
    
}
