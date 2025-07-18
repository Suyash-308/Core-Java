package _control_Statement.patterns;

public class Demo5 {
    public static void main(String[] args) {
        for(int row=1; row<=5; row++){
            for(int space=5-row; space>0; space--){
                System.out.print(" ");
            }
            for (int col=1; col<=row; col++){
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
}
