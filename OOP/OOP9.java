import java.util.ArrayList; 
import java.util.List; 
public class OOP9 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.get_verified()); // Print the verification status of the student
        s.set_membership("Gold");

    }
}


class User {
    private String _name; 
    private String _membership; 

    public static List<User> admins;

    public static void print_admin_names() { 
        for (User u : admins) {
            System.out.println(u.get_name()); 
        }
    }
    // Constructor to initialize User objects with name and membership
    public User(String name, String membership) {
        _name = name; // Assigns the name to the field _name
        _membership = membership; // Assigns the membership to the field _membership
    }

    // toString method to provide a string representation of the User object
    public String toString() {
        return _name + " " + get_membership(); // Concatenates name and membership
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


class Student extends User {
    private boolean _verified = false; // Field to store verification status


    // Setter for verified status
    void set_verified(boolean verified) {
        _verified = verified;
    }

    // Getter for verified status
    boolean get_verified() {
        return _verified;
    }
}
