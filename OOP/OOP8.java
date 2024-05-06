import java.util.ArrayList; // Necessary for using the ArrayList class
import java.util.List; // Necessary for using the List interface

public class OOP8 {
    public static void main(String[] args) {
        User.admins = new ArrayList<User>(); // Initialize the static list of admins in the User class
        // Adding User objects to the admins list with a default membership
        User.admins.add(new User("Caleb"));
        User.admins.add(new User("Roua"));
        User.admins.add(new User("Sally"));

        User.print_admin_names(); // Call to static method to print names of all admins
    }
}


class User {
    private String _name; // Private field to store the name
    private String _membership; // Private field to store the membership level

    public static List<User> admins; // Static list that holds admin users

    // Static method to print the names of all admin users
    public static void print_admin_names() {
        for (User user : admins) {
            System.out.println(user.get_name()); // Prints the name of each admin user
        }
    }

    // Constructor to initialize User objects with name and membership
    public User(String name, String membership) {
        _name = name; 
        _membership = membership;

    // toString method to provide a string representation of the User object
    public String toString() {
        return _name + " " + get_membership(); // Concatenates name and membership for output
    }

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
