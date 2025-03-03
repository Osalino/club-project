import java.util.*;

/**
 * Store details of club memberships.
 *
 * @author Osazemen
 * @version version 1 - 23/02/2025
        */
    public class Club {
    // Define any necessary fields here ...
    private ArrayList<Member> MembersList;
    private Member month;

        /**
     * Constructor for objects of class Club
     */
    public Club() {
        // Initialise any fields here ...
        MembersList = new ArrayList<Member>();

    }
    /**
     * Add a new member to the club's list of members.
     * @param newMember The member object to be added.
     */

    public void join(Member newMember) {

        MembersList.add(newMember);
        System.out.println(newMember.getName() + " joined.");
//        System.out.println("##############################\n");

    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers() {
        return MembersList.size();
    }

    public int joinedInMonth(int month) {
        if(month < 1 || month > 12){
            System.out.println("Invalid month number");
            return 0;
        }
        int count = 0;

        for(Member member : MembersList) {
            if(member.getMonth() == month) {
                    count++;
            }
        }
//        Member member = MembersList.get(month);
//        if(member == null){
//            System.out.println("Invalid month number");
//        }
        return count;
    }

    public ArrayList<Member> removedMembers (int month, int year){
        if (month < 1 || month > 12){
            System.out.println("Invalid month number");
            return null;
        } else {
            Iterator<Member> iterator = MembersList.iterator();
            while(iterator.hasNext()){
                Member member = iterator.next();
                if(member.getMonth() == month && member.getYear() == year){
                    iterator.remove();
                    Member.removedMembers();
                    System.out.printf("The memeber %s, has been removed successfully.%n", member.getName());
                }
            }
        }
        return MembersList;
    }

    public void printDetails() {
        Iterator<Member> iterator = MembersList.iterator();
        while(iterator.hasNext()){
            Member member = iterator.next();
            System.out.printf("\n%s joined, the club in %d %d  ",member.getName(),member.getMonth(),member.getYear());
        }
    }


    public void manualPrint() {
        System.out.println();
//        Iterator<Member> iterator = MembersList.iterator();
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Your name: ");
        String user = myObj.nextLine();
        System.out.println("Enter Your month: ");
        int month2 = myObj.nextInt();
        System.out.println("Enter Your year: ");
        int year2 = myObj.nextInt();

        Member newMember = new Member(user, month2, year2);
        MembersList.add(newMember);
    }




    }



