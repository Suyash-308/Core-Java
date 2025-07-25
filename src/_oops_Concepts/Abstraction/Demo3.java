package _oops_Concepts.Abstraction;

public class Demo3 {
    public static void main(String[] args) {
        abstract class A {
            A() {
                System.out.println("A");
            }
        }
            class B extends A{
                B(){
                    System.out.println("B");
                }
            }
            B b = new B();


    }
}
