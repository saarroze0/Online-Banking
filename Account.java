
class Account {
    private int accountNumber;
    private int accountPin;
    private int accountAmount = 0;

    public Account(int accountNumber, int accountpin) {
        this.accountNumber = accountNumber;
        this.accountPin = accountpin;
    }

    public void setAccountNumber(int depositing) {
        this.accountAmount = depositing;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public int getAccountPin() {
        return this.accountPin;
    }

    public int getAccountAmount() {
        return this.accountAmount;
    }
}