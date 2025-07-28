package _oops_Concepts.anonymous;

public class Demo2 {
    public static void main(String[] args) {
        class A{}

        abstract class B{}

        interface I1{}


        A a=new A(){
//            anonymous class body
        };

        B b=new B(){
//            anonymous class body
        };

        I1 i1=new I1(){
//            anonymous class body
        };
    }
}
