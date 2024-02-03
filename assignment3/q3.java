class BankAccount {
  private int accountNumber;
  private String name;
  private double balance;
  private static int totalAccounts;

  public int getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public static int getTotalAccounts() {
    return totalAccounts;
  }

  public static void incrementTotalAccounts() {
    totalAccounts++;
  }

  public void depositMoney(double amount) {
    balance += amount;
  }

  public void withdrawMoney(double amount) {
    if (balance >= amount) {
      balance -= amount;
    } else {
      System.out.println("Insufficient balance");
    }
  }

}

public class q3 {
  public static void main(String[] args) {
    BankAccount account1 = new BankAccount();
    account1.setAccountNumber(123456);
    account1.setName("John Doe");
    account1.setBalance(1000.0);
    BankAccount.incrementTotalAccounts();

    BankAccount account2 = new BankAccount();
    account2.setAccountNumber(789012);
    account2.setName("Jane Smith");
    account2.setBalance(5000.0);
    BankAccount.incrementTotalAccounts();

    System.out.println("Total accounts: " + BankAccount.getTotalAccounts());

    account1.depositMoney(500.0);
    account2.withdrawMoney(2000.0);

    System.out.println("Account 1 balance: " + account1.getBalance());
    System.out.println("Account 2 balance: " + account2.getBalance());
  }
}