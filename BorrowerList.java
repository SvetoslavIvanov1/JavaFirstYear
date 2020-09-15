import java.util.*;
/**
 * Write a description of class BorrowerList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BorrowerList
{
   private ArrayList<Borrower> borrowers;    
   
   /**
    * Constructor for objects of class BorrowerList
    */
   public BorrowerList()
   {
       borrowers = new ArrayList<Borrower>();
   }
    
   public void addBorrower(Borrower borrower)
   {
       borrowers.add(borrower);
   }
    
   public int getNumberOfBorrowers()
   {
       return borrowers.size();
   }
    
   public void getBorrower(int borrowerEntry)
   {
       if (borrowerEntry < 0)
       {
           System.out.println("Negative entry: " + borrowerEntry);
       }
       else if (borrowerEntry < getNumberOfBorrowers())
       { 
           Borrower borrower = borrowers.get(borrowerEntry);
           borrower.printBorrowerDetails();
       }
       else
       {
           System.out.println("No such entry: " + borrowerEntry);
       }
   }
    
   public boolean getBorrower(String libraryNumber)
   {
       for(Borrower borrower : borrowers)
       {
           if(borrower.getLibraryNumber().equals(libraryNumber))
           {
               return true;
           }
       }
       return false;
   }
   
   public void getAllBorrowers()
   {
        for(Borrower borrower : borrowers)
        {
            borrower.printBorrowerDetails();
            System.out.println();
        }
   }
    
   public void removeBorrower(int borrowerEntry)
   {
        if(borrowerEntry < 0)
        {
            System.out.println("Negative entry :" + borrowerEntry);
        }
        else if(borrowerEntry < getNumberOfBorrowers())
        {
            borrowers.remove(borrowerEntry);
        }
        else
        {
            System.out.println("No such entry :" + borrowerEntry);
        }
   }
    
   public boolean removeBorrower(String libraryNumber)
   {
        int index = 0;
        for (Borrower borrower: borrowers)
        {
            if (libraryNumber.equals(borrower.getLibraryNumber()))
            {
                borrowers.remove(index);
                return true;
            }
            index++;
        }
        return false;
   }
    
  
   public int search(String libraryNumber)
   {
       int index = 0;
       for (Borrower borrower : borrowers)
       {
           if (libraryNumber.equals(borrower.getLibraryNumber()))
           {
               return index;
           }
           else
           {
               index++;
           }
       }
       return -1;
   }    
}
