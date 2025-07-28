package _oops_Concepts.anonymous;

public class Demo6 {
    public static void main(String[] args) {
        class A {
            int a = 10;

            void m1(String msg) {
                System.out.println("A :" + msg);
            }
        }
        class B extends A {
            int a = 30;

            void m1(String msg) {
                System.out.println("B :" + msg);

            }
        }
        A a = new B();
        a.m1("hello");

    }
}
