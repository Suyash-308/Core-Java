package _oops_Concepts.Abstraction;

public class Demo6 {
    public static void main(String[] args) {
        interface  I1{
            public static final int a=10;
            static int b=20;
             int c=30;

            void a();
            public  abstract  void b();
            static  void c(){};
            default void d(){};

//            I1();                    //  constructor not allowed
//            I1 i=new I1(){}          //can't create object of interface

            public static class nested{
            }
        }
    }
}
