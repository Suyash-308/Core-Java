package _loops;

public class Demo5 {
    public static void main(String[] args) {

//    ***--      Factorial of a Number     --***

        int num=150;
        for (int i=1; i<=num/2; i++) {
            if(num%i==0) {
                System.out.println(i);
            }

        }
    }
}
