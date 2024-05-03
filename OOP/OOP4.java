public class OOP4{
    public static void main(String[] args){
        System.out.println("Hello world");

        // Creates an instance of the User class with the name "Caleb" and membership "silver".
        User u = new User("Caleb", "silver");

        // Prints the name of the user by calling the get_name.
        System.out.println(u.get_name());

        // Print the membership of the user by calling the get_membership
        System.out.println(u.get_membership());
    }
}


public class User{
    private String _name;
    private String _membership;

    // Constructor of the User class to initialize new User objects with a name and membership.
    public User(String name, String membership){
        set_name(name);
        set_membership(membership);
    }

    // Setter method for the _name field. It sets the value of _name.
    void set_name(String name){
        _name = name;
    }

    // Getter method for the _name field. It returns the value of _name.
    String get_name(){
        return _name;
    }

    // Overloaded setter method for the _membership field that accepts a string value
    void set_membership(String membership){
        _membership = membership;
    }

    // Overloaded setter method for the _membership field that accepts a Membership enum value.
    void set_membership(Membership membership){
        _membership = membership.name();
    }

    // Enum defined within the User class to represent membership types.
    public enum Membership{
        Bronze, Silver, Gold;
    }

    // Getter method for the _membership field. It returns the value of _membership.
    String get_membership(){
        return _membership;
    }
}
