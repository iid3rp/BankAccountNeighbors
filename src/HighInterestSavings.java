/**
 * HighInterestSavings class extends the functionality of the SavingsAccount class to
 * provide a savings account option with higher interest rates, offering benefits like
 * increased earnings on deposited funds while still maintaining liquidity for occasional
 * withdrawals.
 *
 * @author Francis (iid3rp) Madanlo
 */
public class HighInterestSavings extends SavingsAccount
{
    /**
     * constant variable that will be the default minimum balance to maintain the
     * balance of the savings account when withdrawal.
     */
    private static final double MINIMUM_BALANCE = 2_500d;

    /**
     * constant variable that will be the default interest rate when the interest rate from
     * an inherited double {@code interestRate} will be null
     */
    private static final double INTEREST_RATE = .05d;

    /**
     * variable that will be the actual minimum balance to maintain the
     * balance of the savings account when withdrawal.
     */
    protected double minimumBalance;

    /**
     * the constructor of HighInterestSavings class with parameters that initializes the class, and also the superclass with parameters.
     * but its minimum balance will have default methods from the constant methods.
     * @param name the name of the checking account.
     * @param accountNumber the account number associated at the checking account
     * @param balance the balance of the checking account.
     */
    public HighInterestSavings(String name, long accountNumber, double balance)
    {
        super(name, accountNumber, balance, INTEREST_RATE);
        minimumBalance = MINIMUM_BALANCE;
    }

    /**
     * the constructor of HighInterestSavings class with parameters that initializes the class, and also the superclass with parameters.
     * the interest rate will also initialize based on the parameters.
     *
     * @param name the name of the checking account.
     * @param accountNumber the account number associated at the checking account
     * @param balance the balance of the checking account.
     * @param interestRate the actual interest rate of the current HighInterestSavings object
     */
    public HighInterestSavings(String name, long accountNumber, double balance, double interestRate)
    {
        super(name, accountNumber, balance, interestRate);
        this.minimumBalance = MINIMUM_BALANCE;
    }

    /**
     * the constructor of HighInterestSavings class with parameters that initializes the class, and also the superclass with parameters.
     * the minimum balance and the interest rate will also initialize based on the parameters.
     *
     * @param name the name of the checking account.
     * @param accountNumber the account number associated at the checking account
     * @param balance the balance of the checking account.
     * @param minimumBalance the minimum balance in which the checking account will limit.
     * @param interestRate the actual interest rate of the current HighInterestSavings object
     */
    public HighInterestSavings(String name, long accountNumber, double balance, double interestRate, double minimumBalance)
    {
        super(name, accountNumber, balance, interestRate);
        this.minimumBalance = minimumBalance;
    }

    /**
     * Verifies if the account balance after deducting a specified amount remains above the minimum balance.
     * @param amount The amount to be deducted from the account balance.
     * @return True if the balance after deduction is above the minimum balance, otherwise false.
     */
    public boolean verifyMinimumBalance(double amount)
    {
        return (balance - amount) > minimumBalance;
    }

    /**
     * Verifies if the current account balance is above the minimum balance.
     * @return True if the current balance is above the minimum balance, otherwise false.
     */
    public boolean verifyMinimumBalance()
    {
        return balance > minimumBalance;
    }

    /**
     * the getter of the HighInterestSavings class that gets the double value of
     * the minimum balance of the savings account.
     * @return the double value of the balance of the bank account
     */
    public double getMinimumBalance()
    {
        return minimumBalance;
    }

    @Override
    public void withdraw(double amount)
    {
        balance = verifyMinimumBalance() && verifyMinimumBalance(amount)? balance - amount : balance;
    }
}
