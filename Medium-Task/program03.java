// Build a basic console-based banking application with options like deposit, withdrawal, and check balance.

import java.util.*;

class BankApp {

    public double amount;

    public BankApp() {
        this.amount = 0.0;
    }

    void deposit(double amt) {
        this.amount += amt;
        System.out.println("\nYour amount deposited Successfully!!.\n");
    }

    void withdrawal(double amt) {
        this.amount -= amt;
        System.out.println("\nYour amount withdrawn Successfully!!.\n");
    }

    void checkBalance() {
        System.out.format("\nYour Available Balance is Rs. %.2f .\n\n", this.amount);
    }

    public double getAmount() {
        return this.amount;
    }
}

public class program03 {

    public static void main(String args[]) {
        BankApp bank = new BankApp();
        int ch = -1;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Press 1 for deposit in your Account.");
            System.out.println("2. Press 2 for Withdraw from your Account.");
            System.out.println("3. Press 3 for Check Balance of your Account.");
            System.out.println("4. Press 0 for exit!.");
            System.out.print("\nEnter your choice = ");
            ch = sc.nextInt();

            switch (ch) {
                case 1: {
                    System.out.print("Enter the amount to deposit = ");
                    double amt = sc.nextDouble();
                    bank.deposit(amt);
                    break;
                }
                case 2: {
                    System.out.print("Enter the amount to withdraw = ");
                    double amt = sc.nextDouble();
                    if (amt > bank.getAmount()) {
                        System.out.println("Insufficient balance.\n");
                    } else {
                        bank.withdrawal(amt);
                    }
                    break;
                }
                case 3: {
                    bank.checkBalance();
                    break;
                }
                case 0:
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (ch != 0);

    }
}
