package lesson6.entity;

public class CreditCard {
    private long accountNumber;
    private int amountOnAccount;

    public CreditCard(long accountNumber, int amountOnAccount) {
        this.accountNumber = accountNumber;
        this.amountOnAccount = amountOnAccount;
    }
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getAmountOnAccount() {
        return amountOnAccount;
    }

    public void setAmountOnAccount(int amountOnAccount) {
        this.amountOnAccount = amountOnAccount;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "accountNumber=" + accountNumber +
                ", amountOnAccount=" + amountOnAccount +
                '}';
    }
}
