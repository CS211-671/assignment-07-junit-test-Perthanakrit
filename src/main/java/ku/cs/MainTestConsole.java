package ku.cs;

import ku.cs.models.*;

import java.util.HashMap;

public class MainTestConsole {
    public static void main(String[] args) {
//        StudentList students = new StudentList();
//        students.addNewStudent("11111", "s1");
//        students.addNewStudent("22222", "s2");
//        students.addNewStudent("33333", "s3");
//
//        Student s1 = new Student("22222", "s1");
//        System.out.println(students.findStudentByObject(s1));
//        System.out.println(students.findStudentById(s1.getId()));
//        CreditAccount ca = new CreditAccount("1234", "test", 1000);
//        ca.deposit(10000);
//        System.out.println(ca.getBalance());
//
        BankAccount b = new BankAccount("1234", "test", 1000);
        b.deposit(10000);
        System.out.println(((Cash)b).getInfo());
//        System.out.println(b.getBalance());
//
        BankAccount aA = new CreditAccount("1234Di", "test", 1000);
//        aA.deposit(10000);
//        System.out.println(aA.getBalance());

        Wallet thisW = new Wallet();
        thisW.addMoneyToWallet(aA, 1000);
//        System.out.println();
//        CreditAccount cB = new BankAccount("12341", "acN", 102);

        LinePay line = new LinePay("1234", "test", 10000);
        thisW.addMoneyToWallet(line, 1000);

        System.out.println(thisW.getBalance());
    }
}
