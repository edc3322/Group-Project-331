/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project331;


public class Contractor extends Customer 
{
    public String contractorName; 
    public long contractorNumber; 
    public String contractorAddress; 
    Customer firstName; 
    
public Contractor (String firstName, String lastName, String city, String street, 
        String state, int zip, String contractorName, long contractorNumber, 
        String contractorAddress)
    {
        super(firstName, lastName, city, state, street, zip, contractorNumber);
        this.contractorName = contractorName;
        this.contractorNumber = contractorNumber;
        this.contractorAddress = contractorAddress; 
    }
    
    //setting the contractor company name
    public void setContractorName (String contractorName) 
    {
       this.contractorName = contractorName; 
    }
    public String setContractorAddress( String contractingAddress)
    {
        contractingAddress ="";
        contractingAddress += this.street + ", "; 
        contractingAddress += this.city + ", ";
        contractingAddress += this.state + ", ";
        contractingAddress += this.zip;
        return contractingAddress; 
    }
    
    //setting contractor company number
    public void setContractorNumber (long contractorNumber) 
    {
        this.contractorNumber = contractorNumber; 
    }
    
    
}
