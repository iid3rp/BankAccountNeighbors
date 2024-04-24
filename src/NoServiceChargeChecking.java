/**
 * h
 */
public class NoServiceChargeChecking extends CheckingAccount
{
    private static final double MIN_BALANCE = 1000d;
    public static final double INTEREST_RATE = 0.02d;
    /**
     *
     */
    protected double minimumBalance;
    protected double interestRate;

    public NoServiceChargeChecking(String name, int accountNumber, double balance)
    {
        super(name, accountNumber, balance);
    }

    public NoServiceChargeChecking(String name, int accountNumber, double balance, double minimumBalance, double interestRate)
    {
        super(name, accountNumber, balance);
        this.interestRate = interestRate;
        this.minimumBalance = minimumBalance;
    }

    public double getMinimumBalance()
    {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance)
    {
        this.minimumBalance = minimumBalance;
    }

    public double getInterestRate()
    {
        return interestRate;
    }

    public void setInterestRate(double interestRate)
    {
        this.interestRate = interestRate;
    }

    public boolean verifyMinimumBalance(double amount)
    {
        return (balance - amount) > minimumBalance;
    }

    @Override
    public void createMonthlyStatement()
    {
        System.out.println(this);
    }

    @Override
    public void withdraw(double amount)
    {
        super.withdraw(amount);
    }

    @Override
    public void writeCheck(double amount)
    {

    }
}
