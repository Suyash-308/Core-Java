package _oops_Concepts.inheritance;

public class Demo6 {
    public static void main(String[] args) {
        class Parent{
            int a = 12;
        }

        class Child extends Parent{
            int a = 13;
          void display(){
              System.out.println(a);
          }
        }
        Child child=new Child();
        System.out.println(child.a);
    }
}
