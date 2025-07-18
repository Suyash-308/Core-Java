package _oops_Concepts.Encapsulation;

public class Demo1 {
    private int id;
    private String name;
    private int age;

// Set-Id
    public void setId(int id) {
        if (id >= 0) {
            this.id = id;
        }
    }
    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

//    Get-Id
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}