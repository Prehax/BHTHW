import java.util.*;

public class Note {
    public static void main(String[] args) {
        System.out.println(Employee.address);
        Employee e = new Employee();
        System.out.println(e.address);
    }
}

class Employee implements printable{
    String name;
    static String address = "1 New York";

    private static Set<String> relations = new HashSet<>();

    // static block
    static {
        relations.add("gege");
        relations.add("meimei");
    }
    public Employee() {
        name = "Jack";
    }

    public static void aaa() {
        System.out.println("This is aaa func in Employee");
    }

    @Override
    public void print(String s) {
        System.out.println("After package: "+s);
    }

}

class Manager extends Employee {

    public static void aaa() {
        System.out.println("This is aaa func in Manager");
    }
}

interface printable {
    void print(String s);
}

class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // prevent clone
    @Override
    protected Singleton clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }

    // prevent serializable
    protected Singleton readResolve() {
        return getInstance();
    }
}