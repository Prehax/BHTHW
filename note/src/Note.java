import javax.print.attribute.standard.Media;
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

//Factory
abstract class Phone {
    public abstract Phone makePhones();
}

class Iphone extends Phone {

    @Override
    public Phone makePhones() {
        return this;
    }
}

class Samsung extends Phone {

    @Override
    public Phone makePhones() {
        return this;
    }
}

class PhoneFactory {
    public static Phone getPhone(String brand) {
        if ("iphone".equals(brand)) {
            Phone iphone = new Iphone();
            return iphone.makePhones();
        }

        if ("Sansumg".equals(brand)) {
            Phone samsung = new Samsung();
            return samsung.makePhones();
        }

        return null;
    }
}

// Observer
abstract class MediaCompany{
    protected News news;
    public abstract void update();
}

class CNN extends MediaCompany {
    public CNN(News news) {
        this.news = news;
        this.news.addObservers(this);
    }

    @Override
    public void update() {
        System.out.println("CNN");
    }
}

class FOX extends MediaCompany {
    public FOX(News news) {
        this.news = news;
        this.news.addObservers(this);
    }

    @Override
    public void update() {
        System.out.println("FOX");
    }
}

class NBA extends MediaCompany {
    public NBA(News news) {
        this.news = news;
        this.news.addObservers(this);
    }

    @Override
    public void update() {
        System.out.println("NBA");
    }
}

class News {
    private final List<MediaCompany> observers = new ArrayList<>();
    private String subject;

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
        notifyAllObservers();
    }

    public void addObservers(MediaCompany observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (MediaCompany ob: observers) {
            ob.update();
        }
    }
}


