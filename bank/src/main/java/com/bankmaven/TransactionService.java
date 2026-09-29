package com.bankmaven;


public class TransactionService {
    
    private User user1;
    private User user2;
    
    TransactionService(User user1, User user2) {
        this.user1 = user1;
        this.user2 = user2;
    }

    public void transferCash(int cash, User user1, User user2) {
        int user1CurrBal = user1.getAccount().getBalance();
        int user2CurrBal = user2.getAccount().getBalance();

        user1.getAccount().setBalance( user1CurrBal - cash );
        user2.getAccount().setBalance( user2CurrBal + cash );

    }
}