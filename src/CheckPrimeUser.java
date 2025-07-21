import java.util.Scanner;

public class CheckPrimeUser {
    public static void main(String[] args) {
        checkPrime();
    }
    public static void checkPrime(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num=sc.nextInt();
        if(num<=1){
            System.out.println("Number is not Prime");
        }
        else{
            boolean isPrime=true;
            for (int i=2;i<=num/2;i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
            System.out.println(isPrime?"Prime":"Not Prime");
        }

    }
}
