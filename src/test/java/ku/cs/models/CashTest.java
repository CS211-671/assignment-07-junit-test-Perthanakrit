package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashTest {

    @Test
    void linePayGetCash() {
        Cash line = new LinePay("1234", "lineName", 1000.50);
        assertTrue(line.getCash(1000));
    }

    @Test
    void linePayGetInfo() {
        Cash line = new LinePay("1234", "lineName", 1000.50);
        String actual = line.getInfo();
        String expected = "LinePay line id : 1234";

        assertEquals(expected, actual);
    }

    @Test
    void promptPayGetCash() {
        BankAccount myAcc = new BankAccount("1234", "name", 3000);
        Cash line = new PromptPay("1234", myAcc);
        assertTrue(line.getCash(1000));

    }

    @Test
    void promptPayGetInfo() {
        Cash line = new PromptPay("1234", new BankAccount("1234", "name", 1000));
        String actual = line.getInfo();
        String expected = "PromptPay phone number : 1234";

        assertEquals(expected, actual);
    }

    @Test
    void trueMoneyCardGetCash() {
        Cash line = new TrueMoneyCard("1234",10000);
        assertTrue(line.getCash(10000));
    }

    @Test
    void trueMoneyCardGetInfo() {
        Cash line = new TrueMoneyCard("1234",10000);
        String actual = line.getInfo();
        String expected = "TrueMoneyCard serial number: 1234";

        assertEquals(expected, actual);
    }
}