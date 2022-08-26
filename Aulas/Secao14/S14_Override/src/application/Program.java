package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.awt.*;

public class Program {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Alex", 1000.0);
        acc.withdraw(200.0);
        System.out.println(acc.getBalance());

        Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());
    }
}