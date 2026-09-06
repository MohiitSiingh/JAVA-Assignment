class Account {
    private String accountNumber;
    private String ownerName;
    private double balance;

    Account(String accountNumber, String ownerName) {
        this(accountNumber, ownerName, 0);
    }

    Account(String accountNumber, String ownerName, double balance) {

        if (accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException("Invalid account number");
        }

        if (ownerName == null || ownerName.isBlank()) {
            throw new IllegalArgumentException("Invalid owner name");
        }

        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }

        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    String getAccountNumber() {
        return accountNumber;
    }

    String getOwnerName() {
        return ownerName;
    }

    double getBalance() {
        return balance;
    }

    boolean deposit(double amount) {
        if (amount <= 0)
            return false;

        balance += amount;
        return true;
    }

    boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance)
            return false;

        balance -= amount;
        return true;
    }

    @Override
    public String toString() {
        return accountNumber + " - " +
                ownerName + " - Balance: " + balance;
    }
}
