package com.bankmaven;

import java.util.List;


public class Account {
    private int id;
    private int balance;
    private String ownerName;
    private String email;
    private List<String> securityQuestionsList;


    Account(int id, int balance, String ownerName, String email, List<String> securityQuestionsList) {
        this.id = id;
        this.balance = balance;
        this.ownerName = ownerName;
        this.email = email;
        this.securityQuestionsList = securityQuestionsList;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSecurityQuestionsList(List<String> securityQuestionsList) {
        this.securityQuestionsList = securityQuestionsList;
    }

    public int getID() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    public String getEmail() {
        return email;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public List<String> getSecurityQuestionsList() {
        return securityQuestionsList;
    }

}

// testing commitm message thing. 