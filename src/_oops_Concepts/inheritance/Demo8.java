package _oops_Concepts.inheritance;

public class Demo8 {
    public static void main(String[] args) {
        class A{
            int a=10;
            int b=20;
            int c=9;
        }
        class B extends A{
            int a=1;
            int b=2;
            int d=90;
        }
        A a=new A();
        System.out.println(a.a);
        System.out.println(a.b);
        System.out.println(a.c);


//        parent object is only access parent element
    }
}
