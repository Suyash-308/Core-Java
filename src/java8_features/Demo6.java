package java8_features;

public class Demo6 {
    public static void main(String[] args) {
        interface I1{
            void M1();
        }
        I1 i1=()->{
                System.out.println("I1 : M1");
            };

        interface I2{
           void M1(int number);
        }
        I2 i2=(int num)->{
            System.out.println("I2 : M1");
        };


        interface I3{
            int M1();
        }
        I3 i3=()->{
          return 3;
        };

        interface I4{
            int M1(int number);
        }
        I4 i4=(int number)->{
            return number;
        };

    }
}
