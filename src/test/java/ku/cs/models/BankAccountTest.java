package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    @DisplayName("เพิ่มเงินจำนวน 200 สำเร็จจะมี balance 1200")
    void depositSuccess() {
        BankAccount acc = new BankAccount("1234", "test", 1000);
        assertTrue(acc.deposit(200));

        assertEquals(1200, acc.getBalance());
    }

    @Test
    @DisplayName("เพิ่มเงินจำนวน 0 ซึ่งไม่สำเร็จ")
    void depositNegative() {
        BankAccount acc = new BankAccount("1234", "test", 1000);
        assertFalse(acc.withdraw(0));
    }


    @Test
    @DisplayName("ถอนเงิน 200 บาทสำเร็จเหลือเงิน 800")
    void withdrawSuccessful() {
        BankAccount acc = new BankAccount("4321", "test", 1000);
        acc.withdraw(200);

        assertEquals(800, acc.getBalance());

    }

    @Test
    @DisplayName("เงินเหลือ 0")
    void withdrawWithZeroBalance() {
        BankAccount acc = new BankAccount("1234", "test", 0);

        assertFalse(acc.withdraw(1000));
    }

    @Test
    @DisplayName("ต้องการถอนเงิน 2000 เมื่อมีเงินอยู่ในบัชญี 1500 ซึ่งไม่สำเร็จ")
    void withdrawWithFail() {
        BankAccount acc = new BankAccount("1234", "test", 1500);
        assertFalse(acc.withdraw(2000));
    }

}