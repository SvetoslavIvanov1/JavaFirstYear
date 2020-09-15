
/**
 * Write a description of class Borrower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Borrower
{
    private String firstName;
    private String lastName;
    private String libraryNumber;
    private int noOfBooks;
    private Address address;

    /**
     * Constructor for objects of class Borrower.
     * The number of books should be set to 1.
     * 
     * @param firstName The Borrower's first name 
     * @param lastName The Borrower's last name
     * @param lNumber The Borrower's library number
     * @param street The Borrower's street
     * @param town The Borrower's town
     * @param postcode The Borrower's postcode
     */
    public Borrower(String fName, String lName, String lNumber, 
                    String street, String town, String postcode)
    {
        firstName = fName;
        lastName = lName;
        libraryNumber = lNumber;
        noOfBooks = 1;        
        address = new Address(street, town, postcode);
    }
    
    /**
     * Constructor for objects of class Borrower.
     * The number of books on loan should should be set to
     * the supplied vale.
     * 
     * @param fName The Borrower's first name 
     * @param lName The Borrower's last name
     * @param lNumber The Borrower's library number
     * @param numberOfBooks The initial book borrow
     * @param street The Borrower's street
     * @param town The Borrower's town
     * @param postcode The Borrower's postcode
     */
    public Borrower(String fName, String lName, String lNumber, int numberOfBooks, 
                    String street, String town, String postcode)
    {
        firstName = fName;
        lastName = lName;
        libraryNumber = lNumber;
        noOfBooks = numberOfBooks;         
        address = new Address(street, town, postcode);
    }
    
    // accessors
    
    /**
     * Get the Borrower's first name
     * 
     * @return the Borrower's first name
     */
    public String getFirstName()
    {
        return firstName;
    }
    
    /**
     * Get the Borrower's last name
     * 
     * @return the Borrower's last name
     */
    public String getLastName()
    {
        return lastName;
    }
    
    /**
     * Get the Borrower's library Number
     * 
     * @return the Borrower's library number
     */
    public String getLibraryNumber()
    {
        return libraryNumber;
    }
    
     /**
     * Get the number of books on loan
     * 
     * @return the number of books on loan
     */
    public int getNoOfBooks()
    {
        return noOfBooks;
    }
    
    /**
     * Print out the Borrower's details to the console window
     * 
     */
    public void printBorrowerDetails()
    {
        System.out.println( firstName + " " + lastName 
                           + "\n" + address.getFullAddress()
                           + "\nLibrary Number: " + libraryNumber
                           + "\nNumber of loans: " + noOfBooks);
    }     
    
    // mutators
       
    /**
     * Increase the bumber of books on loan by 1
     * 
     */
    public void borrowBook()
    {
        noOfBooks = noOfBooks + 1;
        System.out.println("Books on loan: " + noOfBooks);        
    }
    
    /**
     * Increase the bumber of books on loan by a given number
     * 
     * @param number of new loans to add to total
     */
    public void borrowBooks(int number)
    {
        noOfBooks = noOfBooks + number;
        System.out.println("Books on loan: " + noOfBooks);        
    }
    
    /**
     * Return a book
     * 
     */
    public void returnBook ()
    {
        noOfBooks = noOfBooks - 1 ;
        System.out.println("Books on loan: " + noOfBooks);        
    }
    
    /**
     * Return the Borrower's address
     * 
     * @return the Borrower's address
     */
    public String getAddress()
    {
        return address.getFullAddress();
    }
    
    /**
     * Change the Borrower's address
     * 
     * @param street the street
     * @param town the town
     * @param postcode the postcode
     */
    public void setAddress(String street, String town, String postcode)
    {
        address.setFullAddress(street, town, postcode);
    }
    
    /**
     * Print out Borrower's address
     */
    public void printAddress()
    {
        address.printAddress();
    }
    
} // end class
