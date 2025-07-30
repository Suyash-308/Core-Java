package java8_features;

public class Demo1 {
    public static void main(String[] args) {
        @FunctionalInterface
        interface I1{
            void m1();
        }
        class A1 implements I1{
            public void m1(){};
        }
    }
}
