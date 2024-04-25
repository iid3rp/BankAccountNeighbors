/**
 * SavingsAccount class inherits properties and methods from the {@code BankAccount} class while
 * potentially adding its own specific features being a savings account that has an interest
 * rate.
 *
 * @author Francis (iid3rp) Madanlo
 */
public class SavingsAccount extends BankAccount
{
    /**
     * constant variable that will be the default interest rate when the interest rate from
     * an inherited double {@code interestRate} will be null
     */
    private static final double INTEREST_RATE = .03d;

    /**
     * actual variable that will be the actual interest rate
     */
    protected double interestRate;

    /**
     *  The default constructor of the SavingsAccount class
     *  the initializes the class itself, and the BankAccount superclass constructor
     *  with parameters. The interest rate should be default.
     *
     * @param name the name of the bank account
     * @param accountNumber the associated account number of the bank account
     * @param balance The initial balance of the bank account
     */
    public SavingsAccount(String name, long accountNumber, double balance)
    {
        super(name, accountNumber, balance);
        interestRate = INTEREST_RATE;
    }

    /**
     *  The default constructor of the SavingsAccount class
     *  the initializes the class itself, and the BankAccount superclass constructor
     *  with parameters. The interest rate should be default.
     *
     * @param name the name of the bank account
     * @param accountNumber the associated account number of the bank account
     * @param balance The initial balance of the bank account
     * @param interestRate the actual interest rate of the savings account
     */
    public SavingsAccount(String name, long accountNumber, double balance, double interestRate)
    {
        super(name, accountNumber, balance);
        this.interestRate = interestRate;
    }

    /**
     * the getter of the CertificateOfDeposit class that returns the interest rate of the
     * associated BankAccount.
     * @return the value of the interest rate
     */
    public double getInterestRate()
    {
        return interestRate;
    }

    /**
     * the setter of the CertificateOfDeposit class the sets the interest rate of the
     * associated BankAccount.
     * @param interestRate where it will be the desired interest rate
     */
    public void setInterestRate(double interestRate)
    {
        this.interestRate = interestRate;
    }

    /**
     * this will create a method that adds an interest within the whole balance of
     * the associated bank account object.
     */
    public void postInterest()
    {
        balance *= (1d + interestRate);
    }

    @Override
    public void createMonthlyStatement()
    {
        System.out.println(this);
    }

    /**
     *  Returns a string representation of the {@code SavingsAccount} class that returns the data
     *  as a String constructed for readability and reference of what are the contents
     *  of the savings account object.
     * @return String value of the constructed savings account object
     */
    @Override
    public String toString()
    {
        return super.toString();
    }
}