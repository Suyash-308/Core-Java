package _oops_Concepts.Abstraction;

public class Demo4 {
    public static void main(String[] args) {
        abstract class A {
            abstract void a();
        }
        class B extends A {
            public void a() {
                System.out.println("B");
            }
        }
        A a = new B();
        a.a();
    }
}
