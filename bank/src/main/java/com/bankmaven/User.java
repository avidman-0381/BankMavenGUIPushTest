package com.bankmaven;


public class User {
    private Account account;
    private DateOfBirth dob;

    User(Account account, DateOfBirth dob) {
        this.account = account;
        this.dob = dob;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setDoB(DateOfBirth dob) {
        this.dob = dob;
    }

    public Account getAccount() {
        return account;
    }

    public DateOfBirth getDoB() {
        return dob;
    }


}