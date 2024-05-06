import java.util.ArrayList; // Necessary for using the ArrayList class

// Main class OOP6 to run the Java application
public class OOP6 {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<User>(); // Create an ArrayList to hold User objects
        users.add(new User("Caleb", "Silver")); // Add new User objects with membership directly to the list
        users.add(new User("Roua", "Gold"));
        users.add(new User("Sally", "Bronze"));

        // for-loop to iterate over users and print each name
        for (User user : users) {
            System.out.println(user.get_name()); // get user name by the getter
        }
    }
}


class User {
    private String _name; 
    private String _membership; 

    // Constructor to initialize User objects with name and membership
    public User(String name, String membership) {
        _name = name; 
        _membership = membership;
    }

    // toString method to provide a string representation of the User object
    public String toString() {
        return _name + " " + get_membership(); // Correctly concatenates name and membership
    }

    // equals method to compare this User object with another User object
    public boolean equals(User u2) {
        // Compares both the name and membership level of two User objects using .equals()
        return _name.equals(u2.get_name()) && _membership.equals(u2.get_membership());
    }

    // Getter for _name
    public String get_name() {
        return _name;
    }

    // Getter for _membership
    public String get_membership() {
        return _membership;
    }
}
