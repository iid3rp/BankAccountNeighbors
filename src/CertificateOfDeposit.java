public class CertificateOfDeposit extends BankAccount
{
    private static final double INTEREST_RATE = 0.05d;
    private static final int NUMBER_OF_MATURITY_MONTHS = 6;
    private double interestRate;
    private int maturityMonths;
    private int cdMonth;

    public CertificateOfDeposit(String name, int accountNumber, double balance)
    {
        super(name, accountNumber, balance);
    }

    public void postInterest()
    {
        super.balance *= (1d + interestRate);
    }

    public double getInterestRate()
    {
        return interestRate;
    }

    public void setInterestRate(double interestRate)
    {
        this.interestRate = interestRate;
    }

    public int getMaturityMonths()
    {
        return maturityMonths;
    }

    public void setMaturityMonths(int maturityMonths)
    {
        this.maturityMonths = maturityMonths;
    }

    public int getCurrentCDMonth()
    {
        return cdMonth;
    }

    public void setCurrentCDMonth(int cdMonth)
    {
        this.cdMonth = cdMonth;
    }

    @Override
    public void withdraw(double amount)
    {
        super.withdraw(amount);
    }

    public void withdraw()
    {
        balance -= balance;
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
