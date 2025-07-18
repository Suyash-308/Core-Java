package _class_Components.methods;

public class Demo2 {
    public static void main(String[] args) {
        m1();
        System.out.println("main method");
    }
    static void m1(){
        Demo2 ref=new Demo2();
        ref.m2();
        m3();
        System.out.println("m1 method");
    }
    void m2(){
        System.out.println("method m2");
    }
    static void m3(){
        System.out.println("method m3");
    }

}
