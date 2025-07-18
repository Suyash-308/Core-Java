package _class_Components.constructor;

public class Bank {
    int id;
    String name;
    int age;
    String address;
    float balance;

    Bank() {
    }

    Bank(int id, String name, int age, String address, float balance) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.balance = balance;

    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Balance: " + balance);
    }
}
