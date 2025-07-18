package _oops_Concepts.inheritance;

public class Demo1 {
    public static void main(String[] args) {
        class BankAccount {
            int customerId;
            int accountNumber;
            String customerName;
            double balance;


            void deposit(double amount) {
                balance += amount;
            }

            void withdraw(double amount) {
                balance -= amount;
            }

            double getBalance() {
                return balance;
            }
        }
           class SavingAccount extends BankAccount{}

           SavingAccount saving=new SavingAccount();
        saving.deposit(500);
        saving.customerId=123;
        saving.customerName="abc";
        saving.balance=1000;

        System.out.println(saving.getBalance());
        System.out.println(saving.customerId);
        System.out.println(saving.customerName);
        System.out.println(saving.balance);
        System.out.println(saving.accountNumber);



    }
}
