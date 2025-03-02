/**
 * Provide a demonstration of the Club and Member
 * classes.
 * 
 * @author Osazemen
 * @version version 1 - 23/02/2025
 */
public class TestClub
{
	
    // instance variables - replace the example below with your own
    
    /**
     * Constructor for objects of class TestClub
     */
    public TestClub()
    {
      
   }

    public static void main(String args[]){
    
    /**
     * Add some members to the club, and then
     * show how many there are.
     * Further example calls could be added if more functionality
     * is added to the Club class.
     */
       	Club myClub = new Club();

           System.out.println("The club has " +
                  myClub.numberOfMembers() +
                  " members.");
        System.out.println("\n##############################");

        myClub.join(new Member("John", 2, 2017));
        myClub.join(new Member("Abdi", 4, 2017));
        myClub.join(new Member("Michael", 7, 2018));



        System.out.println("\n##############################");
        myClub.removedMembers(2,2017);
        myClub.joinedInMonth(1);

        System.out.println("The club currently has " +
                             myClub.numberOfMembers() +
                " members.");

        System.out.println("\n##############################");

        myClub.printDetails();

        System.out.println("\n############# - Manual Input - #################");

        myClub.manualPrint();

        myClub.printDetails();

    }
    
    
}
