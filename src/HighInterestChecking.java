/**
 *
 */
public class HighInterestChecking extends NoServiceChargeChecking
{
    private static final double INTEREST_RATE = 0.05d;
    private static final double MIN_BALANCE = 5000d;

    public HighInterestChecking(String name, int accountNumber, double balance)
    {
        super(name, accountNumber, balance);
    }

    public HighInterestChecking(String name, int accountNumber, double balance, double minimumBalance, double interestRate)
    {
        super(name, accountNumber, balance, interestRate, minimumBalance);
    }

    @Override
    public double getInterestRate()
    {
        return super.getInterestRate();
    }

    @Override
    public void setInterestRate(double amount)
    {
        super.setInterestRate(amount);
    }

    public void postInterest()
    {
        super.balance *= (1d + interestRate);
    }

    @Override
    public void createMonthlyStatement()
    {
        super.createMonthlyStatement();
    }

}

