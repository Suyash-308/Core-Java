package _acces_Specifier;

public class Demo1 {
    static  private int x=1;
    static  int y=2;
    static  protected  int z=3;
    static  public int w=4;
    public static void main(String[] args) {
        System.out.println(Demo1.x);
        System.out.println(Demo1.y);
        System.out.println(Demo1.z);
        System.out.println(Demo1.w);
    }
}
