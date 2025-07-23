package _polymorphism;

public class Demo2 {
        public static void main(String[] args) {
            class parent {
                void add() {
                    System.out.println("add parent");
                }
            }
            class child extends parent {
                void add() {
                    System.out.println("add child");
                }
            }
            parent ref=new child();
            ref.add();
    }
}

// Method overriding
