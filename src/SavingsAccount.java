public class SavingsAccount extends BankAccount
{
    private static final double INTEREST_RATE = .03d;
    protected double interestRate;
    public SavingsAccount(String name, int accountNumber, double balance)
    {
        super(name, accountNumber, balance);
        interestRate = INTEREST_RATE;
    }

    public SavingsAccount(String name, int accountNumber, double balance, double interestRate)
    {
        super(name, accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate()
    {
        return interestRate;
    }

    public void setInterestRate(double interestRate)
    {
        this.interestRate = interestRate;
    }

    public void postInterest()
    {
        balance *= (1d + interestRate);
    }

    @Override
    public void createMonthlyStatement()
    {
        System.out.println(this);
    }

    @Override
    public String toString()
    {
        return super.toString();
    }
}
