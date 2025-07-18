package _oops_Concepts.inheritance;

public class Demo2 {
    public static void main(String[] args) {
        class A{}
        class B{}
        interface I1{}
        interface I2{}



// class extends only one class
        class C extends A{}
        class D extends B{}


// interface extends more than one interface
        interface I3 extends I1,I2{}
        interface I4 extends I3{}


// class implements more than one interface
        class E implements I1, I2, I3{}


// interface not implements  of class -- <  CTE  >

        //interface I5 implements D{}

    }
}
