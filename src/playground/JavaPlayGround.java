package playground;

public class JavaPlayGround {
    public static void main(String args[]) {
        System.out.println("Hello, Java");
        System.out.println(Person.N_EYES); //Accessing through class directly, doesn't need an instance to access the value here.
    }

}

class Person {
    public static final int N_EYES = 2;
}