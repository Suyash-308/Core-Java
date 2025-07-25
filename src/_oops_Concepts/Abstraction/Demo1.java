package _oops_Concepts.Abstraction;

public class Demo1 {
    public static void main(String[] args) {
        abstract class A{
            abstract void f();
        }
        class B extends A{
            void f(){
                System.out.println("F");
            }
        }
        A a=new B();
        a.f();
    }
}
