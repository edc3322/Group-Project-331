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
    
public Contractor()
{
   super();
   this.contractorName="";
   this.contractorAddress="";
   this.contractorNumber = 0; 
   
}
    public Contractor (String fName, String lName)
    {
        super (fName);
        super (lName);
    }
}
