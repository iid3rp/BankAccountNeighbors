/**
 * NoServiceChargeChecking class inherits properties and methods from the CheckingAccount
 * class while possibly adding its own unique features including such characteristic
 * that it does not have any limitation within checking.
 *
 * @author Francis (iid3rp) Madanlo
 */
public class NoServiceChargeChecking extends CheckingAccount
{
    /**
     * a constant double (balance) that will be the default minimum balance in which
     * the NoServiceChargeChecking should still keep when you withdraw money at any moment.
     */
    private static final double MINIMUM_BALANCE = 1000d;

    /**
     * a constant integer that will be the default interest rate of the checking account.
     */
    public static final double INTEREST_RATE = 0.02d;
    /**
     * the actual minimum balance of this current NoServiceChargeChecking object
     */
    protected double minimumBalance;

    /**
     * the actual interest rate of this current NoServiceChargeChecking object.
     */
    protected double interestRate;

    /**
     * the constructor of NoServiceChargeChecking class with parameters that initializes the class, and also the superclass with parameters.
     * but its minimum balance and interest rate will have default methods from the constant methods.
     * @param name the name of the checking account.
     * @param accountNumber the account number associated at the checking account
     * @param balance the balance of the checking account.
     */
    public NoServiceChargeChecking(String name, long accountNumber, double balance)
    {
        super(name, accountNumber, balance);
        this.interestRate = INTEREST_RATE;
        this.minimumBalance = MINIMUM_BALANCE;
    }

    /**
     * the constructor of NoServiceChargeChecking class with parameters that initializes the class, and also the superclass with parameters.
     * the minimum balance and the interest rate will also initialize based on the parameters.
     *
     * @param name the name of the checking account.
     * @param accountNumber the account number associated at the checking account
     * @param balance the balance of the checking account.
     * @param minimumBalance the minimum balance in which the checking account will limit.
     * @param interestRate the actual interest rate of the current NoServiceChargeChecking object
     */
    public NoServiceChargeChecking(String name, long accountNumber, double balance, double minimumBalance, double interestRate)
    {
        super(name, accountNumber, balance);
        this.interestRate = interestRate;
        this.minimumBalance = minimumBalance;
    }

    /**
     * the getter of the NoServiceChargeChecking class that returns the double value of the initial minimum balance
     * of the checking account
     * @return the double value of the minimum balance of the checking account.
     */
    public double getMinimumBalance()
    {
        return minimumBalance;
    }

    /**
     * the setter of the NoServiceChargeChecking class that re-initialize the value of the minimum balance of the
     * current NoServiceChargeChecking object.
     * @param minimumBalance the value of the current minimum balance in which to be limited
     */
    public void setMinimumBalance(double minimumBalance)
    {
        this.minimumBalance = minimumBalance;
    }

    /**
     * the getter of the NoServiceChargeChecking class that returns the double value of the current interest rate
     * of the checking account
     * @return the double value of the interest rate of the checking account.
     */
    public double getInterestRate()
    {
        return interestRate;
    }

    /**
     * the setter of the NoServiceChargeChecking class that re-initialize the value of the interest rate of the
     * current NoServiceChargeChecking object.
     * @param interestRate the value of the interestRate account
     */
    public void setInterestRate(double interestRate)
    {
        this.interestRate = interestRate;
    }

    /**
     * this method returns a boolean having the condition to verify the withdrawal if the amount should be less than the balance,
     * decrease the balance from the parameter {@code amount}, and at the same time, the balance should
     * be greater than the current {@code minimumBalance} of the current NoServiceChargeChecking object.
     *
     * <p></p><p>equation:</p>
     * <p></p><p>{@code (balance - amount) > minimumBalance}</p>
     *
     * @param amount the amount in which will be withdrawn, (for reference)
     */
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

    /**
     *  Returns a string representation of the {@code CertificateOfDeposit} class that returns the data
     *  as a String constructed for readability and reference of what are the contents
     *  of the Certificate of Deposit.
     * @return String value of the constructed Certificate of Deposit object
     */
    @Override
    public String toString()
    {
        return super.toString();
    }
    @Override
    public void writeCheck(double amount)
    {
        if(balance > amount)
        {
            withdraw(amount);
            System.out.println(); // check information
        }
    }
}

