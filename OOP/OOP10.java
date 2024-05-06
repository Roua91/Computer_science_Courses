import java.util.ArrayList; 
import java.util.List; 

public class OOP10 {
    public static void main(String[] args) {
        Student s = new Student("Student"); // Initializes Student with name 
        Teacher t = new Teacher("Teacher"); // Initializes Teacher with name 

        User.admins = new ArrayList<User>(); // Initializes the static list of admins
        User.admins.add(s);
        User.admins.add(t); 
        User.admins.add(new User("Caleb", "Admin"));
        User.admins.add(new User("Roua", "Admin"));
        User.admins.add(new User("Sally", "Admin"));

        for (User u : User.admins) {
            u.verify(); // Calls verify method, which has different implementations in User and Teacher
        }
    }
}

// Base User class
class User {
    private String _name; 
    private String _membership; 

    public static List<User> admins; 

    // Method to perform verification (intended to be overridden)
    void verify(){
        System.out.println("Verifying...");
    }

    // Constructor for User
    public User(String name, String membership) {
        _name = name;
        _membership = membership;
    }

    // toString method to provide a string representation of the User object
    public String toString() {
        return _name + " " + get_membership();
    }

    // equals method to compare this User object with another User object
    public boolean equals(Object obj) {
        if (obj instanceof User) {
            User u2 = (User) obj;
            return _name.equals(u2.get_name()) && _membership.equals(u2.get_membership());
        }
        return false;
    }

    // Getter for name
    public String get_name() {
        return _name;
    }

    // Getter for membership
    public String get_membership() {
        return _membership;
    }
}

// Student class extending User
class Student extends User {
    private boolean _verified = false; // Verification status

    public Student(String name, String membership) {
        super(name, membership);
    }

    void set_verified(boolean verified){
        _verified = verified;
    }

    boolean get_verified(){
        return _verified;
    }
}

// Teacher class extending User
class Teacher extends User {
    public Teacher(String name, String membership) {
        super(name, membership);
    }

    // Override of verify method for Teacher
    void verify(){
        System.out.println("Verifying through email...");
    }
}
