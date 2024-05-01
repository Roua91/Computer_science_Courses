public class OOP1 {
    public static void main(String[] args) {
        System.out.println("Hello world");
        User u = new User(); // Creating an object of User class

        u.set_name("caleb"); // Setting the name using setter method
        u.set_membership(User.Membership.Gold); // Setting the membership using setter method with enum parameter

        System.out.println(u.get_name()); // Printing the name using getter method
        System.out.println(u.get_membership()); // Printing the membership using getter method
    }
}

public class User {
    private String _name; // Private variable to store the user's name
    private Membership _membership; // Private variable to store the user's membership status

    void set_name(String name) {
        _name = name; // Setter method for setting the user's name
    }

    String get_name() {
        return _name; // Getter method for getting the user's name
    }

    // Setter method for setting the user's membership as a string
    void set_membership(String membership) {
        _membership = membership;
    }

    // Overloaded setter method for setting the user's membership using the Membership enum
    void set_membership(Membership membership) {
        _membership = membership; // Converts the enum value to a string and sets the membership
    }

    // Getter method for getting the user's membership status
    String get_membership() {
        return _membership.name(); // Returns the name of the membership enum value as a string
    }

    // Enum defining possible membership levels
    public enum Membership {
        Bronze, Silver, Gold;
    }
}
