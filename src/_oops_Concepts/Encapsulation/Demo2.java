package _oops_Concepts.Encapsulation;

public class Demo2 {
    public static void main(String[] args) {
        Demo1   ref = new Demo1();


        ref.setAge(21);
        ref.setId(308);
        ref.setName("Ram");
        System.out.println("Age is: " +ref.getAge());
        System.out.println("Id is: " +ref.getId());
        System.out.println("Name is: " +ref.getName());
    }
}
