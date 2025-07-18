package _oops_Concepts.inheritance;

public class Demo5 {
    public static void main(String[] args) {
        class A{
            A(){
                System.out.println("class A: constructor");
            }
        }
        class B extends A{
            B(){
                System.out.println("class B: constructor");
            }
        }
        class C extends B{
            C(){
                System.out.println("class C: constructor");
            }
        }
        class D extends C{
            D(){
                System.out.println("class D: constructor");
            }
        }
        A a=new A();  // A
        B b=new B();  //A,B
        C c=new C();  //A,B,C
        D d=new D();  //A,B,C,D
    }
}
