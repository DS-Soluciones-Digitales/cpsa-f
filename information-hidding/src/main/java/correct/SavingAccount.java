package correct;

public class SavingAccount extends Account {
    
    public SavingAccount(String accountNumber, Customer customer) {
        super(accountNumber, customer);
        this.accountType = "SA";
    }
    
}