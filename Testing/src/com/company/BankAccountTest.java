package com.company;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;

public class BankAccountTest {

    private BankAccount account;

    @org.junit.BeforeClass
    public static void beforeClass() {
        System.out.println("This executes before any test cases...");
    }

    @org.junit.Before
    public void setup() {
        account = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }

    @org.junit.Test
    public void deposit() throws Exception {
//        BankAccount account = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
        double balance = account.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);
    }

//    @org.junit.Test
//    public void withdraw() throws Exception {
//        double balance = account.withdraw(600.00, true);
//        assertEquals(400.00, balance, 0);
//    }

    @org.junit.Test
    public void withdraw_branch() throws Exception {
        double balance = account.withdraw(600.00, true);
        assertEquals(400.00, balance, 0);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void withdraw_notBranch() throws Exception {
//        double balance = account.withdraw(600.00, false);
//        assertEquals(400.00, balance, 0);
        account.withdraw(600.00, false);
        fail("should have thrown an IllegalArgumentException");
    }

//    @org.junit.Test
//    public void getBalance() throws Exception {
//        BankAccount account = new BankAccount("Tim", "Buchalka", 1000.00);
//        account.deposit(200.00, true);
//        assertEquals(1200.00, account.getBalance(), 0);
//    }

    @org.junit.Test
    public void getBalance_deposit() throws Exception {
//        BankAccount account = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
        account.deposit(200.00, true);
        assertEquals(1200.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalance_withdraw() throws Exception {
//        BankAccount account = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
        account.withdraw(200.00, true);
        assertEquals(800.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void isChecking_true() {
//        BankAccount account = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
//        assertEquals(true, account.isChecking());
//        assertTrue(account.isChecking());
        assertTrue("The account is NOT are checking account", account.isChecking());
    }

    @org.junit.AfterClass
    public static void afterClass() {
        System.out.println("This executes after any test cases...");
    }

}