package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditAccountTest {

   @Test
   @DisplayName("โอนเงินสำเร็จ")
   void transferSuccessfully() {
       CreditAccount ca = new CreditAccount("0124", "test", 1000);
       ca.deposit(10000);
       assertTrue(ca.transferCashback(100));
   }

    @Test
    @DisplayName("จำนวนเงินที่จะโอนเป็น 0")
    void transferCashback() {
        CreditAccount ca = new CreditAccount("0123", "test");
        assertFalse(ca.transferCashback(0));
    }

    @Test
    @DisplayName("จำนวนเงินที่ต้องโอนมาก cashback")
    void canNotTransferCashback() {
       CreditAccount ca = new CreditAccount("0123", "test");
       ca.deposit(5000);
       assertFalse(ca.transferCashback(100));
    }

    @Test
    @DisplayName("เพิ่มเงินจำนวน 200 สำเร็จจะมี balance 1200")
    void depositSuccess() {
        CreditAccount acc = new CreditAccount("1234", "test", 1000);
        assertTrue(acc.deposit(200));

        assertEquals(1200, acc.getBalance());
    }

    @Test
    @DisplayName("เพิ่มเงินจำนวน 0 ซึ่งไม่สำเร็จ")
    void depositNegative() {
        CreditAccount acc = new CreditAccount("1234", "test", 1000);
        assertFalse(acc.withdraw(0));
    }


    @Test
    @DisplayName("ถอนเงิน 200 บาทสำเร็จเหลือเงิน 800")
    void withdrawSuccessful() {
        CreditAccount acc = new CreditAccount("4321", "test", 1000);
        acc.withdraw(200);

        assertEquals(800, acc.getBalance());

    }

    @Test
    @DisplayName("เงินเหลือ 0")
    void withdrawWithZeroBalance() {
        CreditAccount acc = new CreditAccount("1234", "test", 0);

        assertFalse(acc.withdraw(1000));
    }

    @Test
    @DisplayName("ต้องการถอนเงิน 2000 เมื่อมีเงินอยู่ในบัชญี 1500 ซึ่งไม่สำเร็จ")
    void withdrawWithFail() {
        CreditAccount acc = new CreditAccount("1234", "test", 1500);
        assertFalse(acc.withdraw(2000));
    }

}