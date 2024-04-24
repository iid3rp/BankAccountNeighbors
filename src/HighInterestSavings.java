/**
 *
 */
public class HighInterestSavings extends SavingsAccount
{
    private static final double MINIMUM_BALANCE = 2_500d;
    private static final double INTEREST_RATE = .05d;
    protected double minimumBalance;

    public HighInterestSavings(String name, int accountNumber, double balance)
    {
        super(name, accountNumber, balance, INTEREST_RATE);
        minimumBalance = MINIMUM_BALANCE;
    }

    public HighInterestSavings(String name, int accountNumber, double balance, double interestRate)
    {
        super(name, accountNumber, balance, interestRate);
        this.minimumBalance = MINIMUM_BALANCE;
    }

    public HighInterestSavings(String name, int accountNumber, double balance, double interestRate, double minimumBalance)
    {
        super(name, accountNumber, balance, interestRate);
        this.minimumBalance = minimumBalance;
    }

    public boolean verifyMinimumBalance(double amount)
    {
        return (balance - amount) > minimumBalance;
    }

    public boolean verifyMinimumBalance()
    {
        return balance > minimumBalance;
    }

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
