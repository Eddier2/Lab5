import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {
    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;
/** Constructor BankAccount.
 * @param name is the name of the account holder
 * @param accountCategory is the type of account
 */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;
    }
    public int getaccountNumber() {
        return accountNumber;
    }
    public void setaccountNumber(int newNumber) {
        accountNumber = newNumber;
    }
    public double getaccountBalance() {
        return accountBalance;
    }
    public void setaccountBalance(double newBalance) {
        accountBalance = newBalance;
    }
    public String getownerName() {
        return ownerName;
    }
    public void setownerName(String newName) {
        ownerName = newName;
    }
    public double getinterestEarned() {
        return interestEarned;
    }
    public void setinterestEarned(double newInterestEarned) {
        interestEarned = newInterestEarned;
    }
}