package java8_features;

public class Demo2 {
    public static void main(String[] args) {
        interface  I1{
            int method1(int num);
        }
        class Square implements I1{
            @Override
            public int method1(int num) {
                return num*num;
            }
        }
        class Cube implements I1{
            @Override
            public int method1(int num) {
                return num*num*num;
            }
        }
        Square s=new Square();
        Cube c=new Cube();

        System.out.println("Square od 8 is : "+s.method1(10));
        System.out.println("cube is : "+c.method1(10));
    }
}
