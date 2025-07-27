package _oops_Concepts.Abstraction;

public class Demo9 {
    public static void main(String[] args) {
        interface I1{
            void a();
        }
        interface I2{
            void b();
        }

        abstract class A1 implements I1,I2{}


        class A2 implements I1,I2{
           public void a(){};
           public void b(){};
        }
    }
}
