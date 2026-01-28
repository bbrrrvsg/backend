package DAY07.Practice9;

import java.lang.ref.SoftReference;

public class BookAccount {

    String accountNumber;
    String ownerName;
    int balance;

    BookAccount(String accountNumber, String ownerName, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    int deposit(int price) {
        return balance += price;
    }

    int withdraw(int price) {
        return balance -= price;
    }

    void printBalance(){
        System.out.println("balance = " + balance);
    }

}