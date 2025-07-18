package _class_Components.methods;

public class Demo3 {
    public static void main(String[] args) {
        B.m3();
     System.out.println("main method");
    }
}
        class A {
            static void m1(){
                System.out.println("Method m1");
            }
            void m2(){
              System.out.println("Method m2");
            }
        }

          class B {
        static  void m3(){
            System.out.println("Method m3");
            B b=new B();
            b.m4();
        }
          void m4(){
              System.out.println("method m4");
              A.m1();
              A a=new A();
              a.m2();

          }
        }


