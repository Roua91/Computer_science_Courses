public class OOP1{
    public static void main(String[] args){
        System.out.println("Hello world");
        User u = new User(); //Creating an object
        u.name = "Caleb";
        u.membership = "Gold";

        User u2 = new User();
        u2.name = "saly";
        u2.membership= "Silver";

        System.out.println(u.name);
        System.out.println(u2.name);
    }
}
public class User{
    String name;
    String membership;

}
