# Club Membership Management System

This project implements a simple club membership management system in Java. It allows you to store, manage, and retrieve information about club members.

## Features

* **Member Management:**
    * Add new members to the club.
    * Retrieve the total number of members.
    * Remove members based on their joining month and year.
* **Membership Queries:**
    * Count members who joined in a specific month.
    * Print detailed information about all members.
* **User Input:**
    * Allows manual addition of members via console input.

## Project Structure

* **`Member.java`:** Represents a club member with attributes like name, joining month, and joining year.
* **`Club.java`:** Manages the club's member list and provides methods for various operations.
* **`Main.java` (or `TestClub.java`):** Contains the main method for testing and demonstrating the functionality of the `Club` class.

## Getting Started

1.  **Prerequisites:**
    * Java Development Kit (JDK) installed.
2.  **Clone the Repository:**
    ```bash
    git clone (https://github.com/Osalino/club-project)
    cd Club
    ```
3.  **Compile the Code:**
    ```bash
    javac src/*.java
    ```
4.  **Run the Application:**
    ```bash
    java src/Main
    ```
    (or `java src/TestClub`)

## Usage

* **Adding Members:**
    * Use the `join(Member newMember)` method to add new members.
    * Use the `manualPrint()` method to add members via console input.
* **Retrieving Member Count:**
    * Use the `numberOfMembers()` method to get the total number of members.
* **Querying Members:**
    * Use `joinedInMonth(int month)` to get the number of members joined in a specific month.
    * Use `removedMembers(int month, int year)` to remove and get a list of members joined in a specific month and year.
    * Use `printDetails()` to print member details.

## Example

```java
public class Main {
    public static void main(String[] args) {
        Club club = new Club();
        Member member1 = new Member("Alice", 1, 2023);
        Member member2 = new Member("Bob", 2, 2023);
        club.join(member1);
        club.join(member2);
        System.out.println("Total members: " + club.numberOfMembers());
        System.out.println("Members joined in January: " + club.joinedInMonth(1));
        club.removedMembers(2,2023);
    }
}

```

Markdown

# Club Membership Management System

This project implements a simple club membership management system in Java. It allows you to store, manage, and retrieve information about club members.

## Features

* **Member Management:**
    * Add new members to the club.
    * Retrieve the total number of members.
    * Remove members based on their joining month and year.
* **Membership Queries:**
    * Count members who joined in a specific month.
    * Print detailed information about all members.
* **User Input:**
    * Allows manual addition of members via console input.

## Project Structure

Club/
├── src/
│   ├── Member.java
│   ├── Club.java
│   └── Main.java (or TestClub.java)
└── README.md


* **`Member.java`:** Represents a club member with attributes like name, joining month, and joining year.
* **`Club.java`:** Manages the club's member list and provides methods for various operations.
* **`Main.java` (or `TestClub.java`):** Contains the main method for testing and demonstrating the functionality of the `Club` class.

## Getting Started

1.  **Prerequisites:**
    * Java Development Kit (JDK) installed.
2.  **Clone the Repository:**
    ```bash
    git clone [repository URL]
    cd Club
    ```
3.  **Compile the Code:**
    ```bash
    javac src/*.java
    ```
4.  **Run the Application:**
    ```bash
    java src/Main
    ```
    (or `java src/TestClub`)

## Usage

* **Adding Members:**
    * Use the `join(Member newMember)` method to add new members.
    * Use the `manualPrint()` method to add members via console input.
* **Retrieving Member Count:**
    * Use the `numberOfMembers()` method to get the total number of members.
* **Querying Members:**
    * Use `joinedInMonth(int month)` to get the number of members joined in a specific month.
    * Use `removedMembers(int month, int year)` to remove and get a list of members joined in a specific month and year.
    * Use `printDetails()` to print member details.

## Example

```java
public class Main {
    public static void main(String[] args) {
        Club club = new Club();
        Member member1 = new Member("Alice", 1, 2023);
        Member member2 = new Member("Bob", 2, 2023);
        club.join(member1);
        club.join(member2);
        System.out.println("Total members: " + club.numberOfMembers());
        System.out.println("Members joined in January: " + club.joinedInMonth(1));
        club.removedMembers(2,2023);
    }
}
```
Improvements

    Implement error handling for invalid user inputs.
    Add functionality to search for members by name.
    Enhance the user interface for better interaction.
    Add Junit testing.
    Refactor the code to adhere to better coding practices.

Contributing

Feel free to contribute to this project by submitting pull requests.
License

This project is licensed under the [License Name] License.  
