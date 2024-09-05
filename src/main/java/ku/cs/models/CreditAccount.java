package ku.cs.models;

import java.io.Serializable;

public class CreditAccount extends BankAccount{
    private double cashBack;

    public CreditAccount(String accountNumber, String accountName, double balance) {
        super(accountNumber, accountName, balance);
        cashBack = 0;
    }

    public CreditAccount(String accountNumber, String accountName ) {
        this(accountNumber, accountName, 0);
    }

    @Override
    public boolean deposit(double amount) {
        if (super.deposit(amount)){
            if (amount > 50000){
                cashBack += amount*2/100;
            }else if (amount > 10000){
                cashBack += amount*1.5/100;
            }else if (amount > 5000){
                cashBack += amount*1/100;
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean withdraw(double amount) {
        if (super.withdraw(amount)){
            if (amount > 100000){
                cashBack += amount*1.5/100;
            }else if (amount > 20000){
                cashBack += amount*1/100;
            }
            return true;
        }
        return false;
    }

    public boolean transferCashback(double amount){
        if (amount > 0 && cashBack >= amount && super.deposit(amount)){
            cashBack -= amount;
            return true;
        }

        // โอนเงิน 0
        // จำนวนเงินที่ต้องโอนมาก cashback
        // โอนเงินสำเร็จ
        return false;
    }

    @Override
    public String toString() {
        return "CreditAccount{" +
                "cashBack=" + cashBack +
                "} " + super.toString();
    }
}
