import java.util.ArrayList; 
import java.util.List; 

public class OOP7 {
    public static void main(String[] args) {
        User.admins = new ArrayList<User>(); // Initializes the static list of admins in the User class
      
        ArrayList<User> users = new ArrayList<User>(); // Create an ArrayList to hold User objects
      
        User.admins.add(new User("Caleb")); // Adds new User objects with specified roles to the admins list
        User.admins.add(new User("Roua"));
        User.admins.add(new User("Sally"));

      
        for (User user : User.admins) {
            System.out.println(user.get_name()); // Correctly calls get_name() method
        }
    }
}


class User {
    private String _name;
    private String _membership; 

    public static List<User> admins; // Static list that holds admin users

    // Constructor to initialize User objects with name and membership
    public User(String name, String membership) {
        _name = name; 
        _membership = membership; 
    }

    // toString method to provide a string representation of the User object
    public String toString() {
        return _name + " " + get_membership(); 
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
