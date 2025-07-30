package java8_features;

public class Demo4 {
    public static void main(String[] args) {

        interface I1{
            void method1();
        }

        class C1 implements I1{
            @Override
            public void method1(){
                System.out.println("Traditional way");
            }
        }
        I1 i1=new C1();
        i1.method1();


        I1 i2=new I1(){
            @Override
            public void method1(){
                System.out.println("Anonymous ");
            }
        };
        i2.method1();


        I1 i3= ()->{
                System.out.println("Lambda ");
            };

        i3.method1();
    }
}
