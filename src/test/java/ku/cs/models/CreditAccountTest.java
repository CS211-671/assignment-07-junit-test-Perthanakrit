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


}