package _oops_Concepts._polymorphism;

public class Demo1 {
    public static void main(String[] args) {
        class A {
            int s=60;
            void m1() {
                System.out.println("m1 of A");
            }
        }
        class B extends A{
            int s=30;
            void m1() {
                System.out.println("m1 of B");
            }
        }
        A a = new B();
        a.m1();
        System.out.println(a.s);

    }
}
