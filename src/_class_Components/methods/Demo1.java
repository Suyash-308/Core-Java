package _class_Components.methods;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("Addition is :" +add(10,50));
        System.out.println("Addition is :"+add(30.3f,20.2f));
        System.out.println("addition is :"+add(10,50,65));
    }
    private static int add(int number1, int number2) {
        return number1 + number2;
    }

    private static float add(float number1, float number2) {
        return number1 + number2;
    }

    private static int add(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }
}

//  ---   Method overloading