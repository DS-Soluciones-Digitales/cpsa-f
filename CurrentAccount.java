package org.isaqb.wrong;

public class CurrentAccount extends Account {
    
    public CurrentAccount(String accountNumber, Customer customer) {
        super(accountNumber, customer);
        this.accountType = "CA";
    }
}