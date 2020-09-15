import java.util.Scanner;
/**
 * A library TUI program documenting book borrowers
 *
 * @author Polina Evtimova
 * @version 19/11/17
 */
public class BorrowerTUI
{
    private BorrowerList borrowerList;
    private Scanner myScanner;

    /**
     * Constructor for objects of class BorrowerTUI
     * initializes BorowerList and Scanner objects
     */
    public BorrowerTUI()
    {
        borrowerList = new BorrowerList();
        myScanner = new Scanner(System.in);
    }
    
    /**
     * main method of BorrowerTUI
     * collects and makes all other methods accessible
     */
    public void menu()
    {
        int command = -1;
        while (command != 0)
        {
            displayMenu();
            command = getCommand();
            execute(command);
        }
    }
    
    /**
     * Exe command 1 adds a borrower to the list (manual input)
     * 
     * @param fName the borrower's first name
     * @param lName the borrower's last name
     * @param lNumber the borrower's library ID
     * @param street the borrower's street address
     * @param town the borrower's town address
     * @param postcode the borrower's postcode address
     */
    private void addBorrower()
    {
        System.out.println("Please input borrower's details: ");
        System.out.println("First Name: ");
        String fName = myScanner.nextLine();
        
        System.out.println("Last Name: ");
        String lName = myScanner.nextLine();
        
        System.out.println("Library ID: ");
        String lNumber = myScanner.nextLine();
        
        System.out.println("Address");
        System.out.println("Street: ");
        String street = myScanner.nextLine();
        
        System.out.println("Town: ");
        String town = myScanner.nextLine();
        
        System.out.println("Postcode: ");
        String postcode = myScanner.nextLine();
        
        Borrower borrower = new Borrower(fName, lName, lNumber, 
                    street, town, postcode);
        borrowerList.addBorrower(borrower);
    }
    
    /**
     * Method to get number of entries in the system
     */
    private void getNumberOfBorrowers()
    {
        System.out.println("We have " + borrowerList.getNumberOfBorrowers()
                                      + " borrower(s).");
    }
    
    /**
     * Method to remove a borrower from the system
     * 
     * @param id the borrower's library ID
     */
    private void removeBorrower()
    {
        System.out.println("Enter borrower's library ID: ");
        String id = myScanner.nextLine();
        if (borrowerList.getBorrower(id) == false)
        {
           System.out.println("Borrower with such an ID does not exist!");
        }
        else
        {
            borrowerList.removeBorrower(id);
            System.out.println("Borrower with ID: " + id + " removed.");
        }
    }
    
    /**
     * Method to show a formatted list of all
     * available information about all borrowers
     */
    private void showAllBorrowers()
    {
        borrowerList.getAllBorrowers();
    }
    
    /**
     * Method to show a formatted list of all
     * available information about one borrower
     * 
     * @param id the borrower's library number
     */
    private void showBorrower()
    {
        System.out.println("Please enter ID of borrower: ");
        String id = myScanner.nextLine();
        if (borrowerList.search(id) == -1)
        {
            System.out.println(" Could not find borrower. ");
        } else {
            int index = borrowerList.search(id);
            borrowerList.getBorrower(index);
        }
    }
    
    /**
     * Main interface, simply prints out a list of
     * possible commands and their corresponding No
     */
    private void displayMenu()
    {
        System.out.println();
        System.out.println("Enter number corresponding to action you want to perform:");
        System.out.println("Add a borrower entry....................[1]");
        System.out.println("Get total of borrowers in the system....[2]");
        System.out.println("Remove a borrower (by ID number)........[3]");
        System.out.println("Show all current borrowers..............[4]");
        System.out.println("Find a specific borrower (by ID)........[5]");
        System.out.println("Exit the system.........................[0]");
        System.out.println();
    }
    
    /**
     * Method that receives given command
     * 
     * @paran command an int input by hand on the console window
     * @return command an int denoting desired command
     */
    private int getCommand()
    {
        System.out.println("Enter command: ");
        int command = myScanner.nextInt();
        myScanner.nextLine();
        return command;
    }
    
    /**
     * This is the most extra part of this assignment
     * it could have been part of the execute method but nooooo
     * why we gotta input the command in there anyway
     * 
     * @param command the command returned from getCommand()
     */
    private void unknownCommand(int command)
    {
        System.out.println("Command number " + command
                           + " is not valid. Please try again");
    }
    
    /**
     * Command is but a string of meaningless letters
     * the void is staring unto me
     * this just prints out you're leaving the program
     */
    private void quitCommand()
    {
        System.out.println("Boi u gon done it now, exit in 3, 2, 1...");
    }
    
    /**
     * a method that figures out what to do with the
     * command parameter
     * 
     * @param command the previously discussed command
     * (yes that one)
     */
    private void execute(int command)
    {
        if (command == 1) {
            addBorrower();
        } else if (command == 2) {
            getNumberOfBorrowers();
        } else if (command == 3) {
            removeBorrower();
        } else if (command == 4) {
            showAllBorrowers();
        } else if (command == 5) {
            showBorrower();
        } else if (command == 0) {
            quitCommand();
        } else {
            unknownCommand(command);
        }
    }
}
