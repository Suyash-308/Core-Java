package _oops_Concepts.inheritance;

public class Demo7 {
    public static void main(String[] args) {
        class A{
            int a=1;
            int b=2;
            int c=9;
        }
        class B extends A{
            int a=10;
            int b=20;
            int d=30;
        }
//    Child object is  access  child & parent element

        B b=new B();
        System.out.println(b.a);
        System.out.println(b.b);
        System.out.println(b.c);
        System.out.println(b.d);


    }
}
