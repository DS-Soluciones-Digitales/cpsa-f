package org.isaqb.wrong;

public class CashDrawnMachine {

    public static void main(String args[]) {
        
        Customer customer = new Customer("28119867", "Perez Ramirez", "Juan");
        
        CurrentAccount ca = new CurrentAccount("CA_AB2134", customer);
        SavingAccount sa = new SavingAccount("SA_IJ7632", customer);

        // Putting separately the initial balance
        ca.setBalance(2000.50);
        sa.setBalance(500.00);

        System.out.println("Initial status");
        System.out.println("Account " + ca.getAccountType() + " " + ca.getAccountNumber() + " - " + ca.getCustomer().getLastName() + " - " + ca.getBalance());
        System.out.println("Account " + sa.getAccountType() + " " + sa.getAccountNumber() + " - " + sa.getCustomer().getLastName() + " - " + sa.getBalance());

        // Withdrawing and crediting money from the accounts
        Double balanceCA = ca.getBalance();
        ca.setBalance(balanceCA + 300);
        
        Double balanceSA = sa.getBalance();
        sa.setBalance(balanceSA - 20);

        System.out.println("After transactions");
        System.out.println("Account " + ca.getAccountType() + " " + ca.getAccountNumber() + " - " + ca.getCustomer().getLastName() + " - " + ca.getBalance());
        System.out.println("Account " + sa.getAccountType() + " " + sa.getAccountNumber() + " - " + sa.getCustomer().getLastName() + " - " + sa.getBalance());

        // changing data according to the API but which represent serious errors

        Customer otherCustomer = new Customer("8751232", "Zimmermann", "Heinz");
        ca.setCustomer(otherCustomer);
        ca.setAccountNumber("AC_AB2134");

        System.out.println("After 'some' strange changes");
        System.out.println("Account " + ca.getAccountType() + " " + ca.getAccountNumber() + " - " + ca.getCustomer().getLastName() + " - " + ca.getBalance());
        System.out.println("Account " + sa.getAccountType() + " " + sa.getAccountNumber() + " - " + sa.getCustomer().getLastName() + " - " + sa.getBalance());

    }
}