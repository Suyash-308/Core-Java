package _oops_Concepts.inheritance;

public class Demo3 {
    public static void main(String[] args) {

// 1.  Single level _oops_._oops_.inheritance

        class A{}
        class B extends A{}

// 2.  multi-level _oops_._oops_.inheritance
        class C{}
        class D extends C{}
        class E extends D{}
        class F extends E{}




// 3.  multiple level _oops_._oops_.inheritance

        class P{}
        class Q {}
//      class R extends P,Q{}   // CTE


        interface I4{}
        interface I5{}
        class R implements I4,I5{}


// 4. cyclic _oops_._oops_.inheritance
        class S{}
//        class S extends S{}   // CTE


// 5.       hierarchical _oops_._oops_.inheritance

        class L{}
        class M extends L{}
        class N extends L{}

// 6. hybrid _oops_._oops_.inheritance
        class O extends N implements I4,I5{}

    }
}
