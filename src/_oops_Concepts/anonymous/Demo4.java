package _oops_Concepts.anonymous;

public class Demo4 {
    public static void main(String[] args) {
        abstract class A{
         abstract void m1(String msg);
        }
        A a=new A(){
            void m1(String msg){
                System.out.println("Anonymous");
            }
        };
        a.m1("hello");
    }
}
