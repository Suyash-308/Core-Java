package _oops_Concepts._polymorphism;

public class Demo3 {
    public static void main(String[] args) {
       System.out.println( add(10,20));
       System.out.println( add(10,20,30));
       System.out.println( add(10f,20f));
    }
    public static int add(int a,int b){
       return a+b;
    }
   public  static int add(int a,int b,int c){
        return  a+b+c;
    }
    public static float   add(float a,float b){
        return a+b;
    }
}

// method overloading
