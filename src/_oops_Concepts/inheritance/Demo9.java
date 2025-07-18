package _oops_Concepts.inheritance;

public class Demo9 {
    public static void main(String[] args) {
        class Parent{
            int a=10;
            int b=20;
            void m(){
                System.out.println("parent");
            }
        }
        class Child extends Parent{
            int c=30;
            int d=40;
            void m(){
                System.out.println("child");
            }
        }

//     it access parent element
//     they have same data then access variable inside the parent &method inside the child

        Parent p=new Child();
        System.out.println(p.a);
        System.out.println(p.b);
        p.m();



    }

}
