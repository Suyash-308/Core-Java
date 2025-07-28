package _oops_Concepts.anonymous;

public class Demo3 {
    public static void main(String[] args) {
        class A {
            void m1(String msg) {
                System.out.println("A");
            }
        }
            A a=new A(){
                void m1(String msg){
                    System.out.println("Anonymous");
                }
            };

            a.m1("hello");

    }
}
