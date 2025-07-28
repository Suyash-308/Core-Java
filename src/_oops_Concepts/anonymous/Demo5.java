package _oops_Concepts.anonymous;

public class Demo5 {
    public static void main(String[] args) {
        interface I1{
             public abstract void m1();
        }
        I1 i1=new I1(){
            public void m1(){
                System.out.println("Anonymous");
            }
        };
        i1.m1();
    }
}
