package oop;

// Polymorphism
public class Polymorphism {
    private String name;
    private String address;

    public Polymorphism(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void doSomething() {
        System.out.println("Has done something.");
    }
}

class PolySub extends Polymorphism{
    public PolySub(String name, String address) {
        super(name, address);
    }

    @Override
    public void doSomething() {
        System.out.println("Drive a car");
    }

    public void doSomething(String position) {
        System.out.println("Drive a car at "+position);
    }
}
