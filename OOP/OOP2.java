public class OOP1 {
    public static void main(String[] args) {
        System.out.println("Hello world");
        User u = new User(); // Creating an object of User class

        u.set_name("Caleb"); // Using setter to set the name of the user
        u.membership = "Gold"; // Directly accessing the public membership property

        System.out.println(u.get_name()); // Using getter to get the name of the user
    }
}

public class User {
    private String _name; // Private variable, not directly accessible from outside the class
    String membership; // Public variable, accessible from anywhere

    // Setter for _name. It allows controlled access to the _name variable.
    void set_name(String name) {
        _name = name; // Sets the _name variable to the provided value
    }

    // Getter for _name. It allows retrieving the value of _name from outside the class.
    String get_name() {
        return _name; // Returns the current value of _name
    }
}
