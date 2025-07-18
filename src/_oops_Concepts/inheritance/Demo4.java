package _oops_Concepts.inheritance;

public class Demo4 {
    public static void main(String[] args) {
        class A{
            static{
                System.out.println("class A: static block");
            }

            {
                System.out.println("class A: instance block");
            }
            A() {
//                super class constructor
//                same class instance block
                System.out.println("class A: constructor");
            }
        }


        class B extends  A{
            static{
                System.out.println("class B: static block");
            }
            {
                System.out.println("class B: instance block");
            }
            B(){
//                super class constructor
//                same class instance block
                System.out.println("class B: constructor");
            }
        }

        B b=new B();
    }
}
