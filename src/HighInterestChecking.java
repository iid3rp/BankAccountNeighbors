/**
 * HighInterestChecking class inherits properties and methods from the HighInterestChecking class while
 * potentially adding its own specific features such as having a post-interest.
 *
 * @author Francis (iid3rp) Madanlo
 */
public class HighInterestChecking extends NoServiceChargeChecking
{
    /**
     * a constant integer that will be the default interest rate of the checking account.
     */
    private static final double INTEREST_RATE = 0.05d;

    /**
     * a constant double (balance) that will be the default minimum balance in which
     * the HighInterestChecking should still keep when you withdraw money at any moment.
     */
    private static final double MIN_BALANCE = 5000d;

    /**
     * the constructor of HighInterestChecking class with parameters that initializes the class, and also the superclass with parameters.
     * but its minimum balance and interest rate will have default methods from the constant methods.
     * @param name the name of the checking account.
     * @param accountNumber the account number associated at the checking account
     * @param balance the balance of the checking account.
     */
    public HighInterestChecking(String name, long accountNumber, double balance)
    {
        super(name, accountNumber, balance);
    }

    /**
     * the constructor of HighInterestChecking class with parameters that initializes the class, and also the superclass with parameters.
     * but its minimum balance and interest rate will have default methods from the constant methods.
     * @param name the name of the checking account.
     * @param accountNumber the account number associated at the checking account
     * @param balance the balance of the checking account.
     * @param minimumBalance the minimum balance which will be the guidance of the checking account
     * @param interestRate the interest rate of the current checking account object
     */
    public HighInterestChecking(String name, long accountNumber, double balance, double minimumBalance, double interestRate)
    {
        super(name, accountNumber, balance, interestRate, minimumBalance);
    }

    /**
     * the getter of the HighInterestChecking class that returns the double value of the current interest rate
     * of the checking account
     * @return the double value of the interest rate of the checking account.
     */
    @Override
    public double getInterestRate()
    {
        return super.getInterestRate();
    }

    /**
     * the setter of the HighInterestChecking class that re-initialize the value of the interest rate of the
     * current HighInterestChecking object.
     * @param interestRate the value of the interestRate account
     */
    @Override
    public void setInterestRate(double interestRate)
    {
        super.setInterestRate(interestRate);
    }

    /**
     * this will create a method that adds an interest within the whole balance of
     * the associated bank account object.
     */
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

