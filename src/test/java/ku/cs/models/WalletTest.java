package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WalletTest {

    @Test()
    @DisplayName("สามารถเพิ่มเงินใน wallet ได้")
    void addMoneyToWallet() {
        Wallet wallet = new Wallet();
        BankAccount ac = new BankAccount("1234", "Name", 1999);
        wallet.addMoneyToWallet(ac, 1000);
        assertEquals(1000, wallet.getBalance());
    }

    @Test
    @DisplayName("สามารถนำเงินออกไปใช้ได้")
    void takeMoneyOutOfWallet() {
        Wallet wallet = new Wallet();
        BankAccount ac = new BankAccount("1234", "Name", 4999);
        wallet.addMoneyToWallet(ac, 3000);
        wallet.takeMoneyOutOfWallet(2000);
        assertEquals(1000, wallet.getBalance());
    }
}