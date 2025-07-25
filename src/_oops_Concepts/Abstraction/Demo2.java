package _oops_Concepts.Abstraction;
public class Demo2 {
    public static void main(String[] args) {
        abstract class A {
            int a = 1;
            static int b = 2;

            public static void m1() {
                System.out.println("m1");
            }

            A() {
                System.out.println("constructor");
            }
            static {
                System.out.println("block");
            }

            {
                System.out.println("block");
            }



        }
    }
}