public class OOP5 {
    public static void main(String[] args) {
        // Prints "Hello world" to the console
        System.out.println("Hello world");

        // Creating two User objects with names and membership levels
        User u = new User("Caleb", "silver");
        User u2 = new User("Clave", "Silver");

        // Prints the result of the equals method comparing two User objects
        System.out.println(u.equals(u2));
    }
}

// User class defines properties and methods for User objects
public class User {
    private String _name; // Private field to store the name
    private String _membership; // Private field to store the membership level

    // Constructor to initialize User objects with name and membership
    public User(String name, String membership) {
        _name = name;
        _membership = membership;
    }

    // equals method to compare this User object with another User object
    public boolean equals(User u2) {
        // Compares both the name and membership level of two User objects using .equals()
        return _name.equals(u2._name) && _membership.equalsIgnoreCase(u2._membership);
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
