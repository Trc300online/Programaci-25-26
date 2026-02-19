package AbstractBanking.src.com.example;

public abstract class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public abstract String getDescription();
    public abstract boolean withdraw(double amount);
}
