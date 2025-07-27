package _oops_Concepts.Abstraction;

public class Demo5 {
    public static void main(String[] args) {
        interface I1{
           public abstract void a();
        }
       abstract  class A implements I1{}

        class A1 implements I1{
            public void a(){}
        }
    }
}
