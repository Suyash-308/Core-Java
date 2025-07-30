package java8_features;

public class Demo3 {
    public static void main(String[] args) {
        @FunctionalInterface
        interface I{
          int method1(int num);
        }
        I square=new I() {
            @Override
            public int method1(int num) {
                return num*num;
            }
        };
        System.out.println("square is : "+square.method1(10));
    }
}
