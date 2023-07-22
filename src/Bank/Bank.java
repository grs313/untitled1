package Bank;

public class Bank {
    public String accountName;
    public int balance;
    public int accountNumber;

    public Bank(String accountName, int balance, int accountNumber){
        this.accountName = accountName;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    public String getAccountName(){
        return accountName;
    }

    public int getBalance(){
        return balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

}
