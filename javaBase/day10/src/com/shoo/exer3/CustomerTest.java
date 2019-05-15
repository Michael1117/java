package com.shoo.exer3;

public class CustomerTest {
    public static void main(String[] args) {
        Customer cust = new Customer("Jane", "Smith");

        Account acct = new Account(1000, 2000, 0.0123);

        cust.setAccount(acct);
        System.out.println(cust.getAccount());
        cust.getAccount().deposit(100);
        cust.getAccount().withdraw(960);
        cust.getAccount().withdraw(2000);

        System.out.println("Customer[" + cust.getLastName() + "," + cust.getFirstName() + "] has a account: id is " + cust.getAccount().getId() + ", annualInterestRate is " + cust.getAccount().getAnnualInterestRate() * 100 + "% , balance is " + cust.getAccount().getBalance());

    }
}
