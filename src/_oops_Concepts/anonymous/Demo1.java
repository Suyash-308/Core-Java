package _oops_Concepts.anonymous;

public class Demo1 {
    public static void main(String[] args) {

        class A{}
        class B extends A{}
        A a = new B();


        abstract class  C{}
        class D extends C{}
        C c=new D();


        interface I1{}
        class E1 implements I1{}
        I1 i1=new E1();

    }
}
