package _loops;

public class Demo7 {
    public static void main(String[] args) {
        int num=18;
        int sum=0;
        for (int i=1; i<=num/2;i++){
            if(num%i==0){
                System.out.println(i);
                sum=sum+i;
            }
        }
        System.out.println(sum==num ?  "Num is perfect":"Num is not perfect");
    }
}
