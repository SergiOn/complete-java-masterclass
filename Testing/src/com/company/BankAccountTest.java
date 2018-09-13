package com.company;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;

public class BankAccountTest {
    @org.junit.Test
    public void deposit() throws Exception {
        BankAccount account = new BankAccount("Tim", "Buchalka", 1000.00);
        double balance = account.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);
    }

    @org.junit.Test
    public void withdraw() throws Exception {
        fail("This test has yet to be implemented");
    }

//    @org.junit.Test
//    public void getBalance() throws Exception {
//        BankAccount account = new BankAccount("Tim", "Buchalka", 1000.00);
//        account.deposit(200.00, true);
//        assertEquals(1200.00, account.getBalance(), 0);
//    }

    @org.junit.Test
    public void getBalance_deposit() throws Exception {
        BankAccount account = new BankAccount("Tim", "Buchalka", 1000.00);
        account.deposit(200.00, true);
        assertEquals(1200.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalance_withdraw() throws Exception {
        BankAccount account = new BankAccount("Tim", "Buchalka", 1000.00);
        account.withdraw(200.00, true);
        assertEquals(800.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void isChecking_true() {
        fail("This test has yet to be implemented");
    }

}