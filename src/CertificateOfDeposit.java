/**
 *  A CertificateOfDeposit class is a specialized
 *  type of bank account that inherits properties and methods from the {@code BankAccount}
 *  class while introducing features unique to certificate of deposit (CD) accounts that includes
 *  having maturity within months, and the Certification of Deposit creating of monthly
 *  statements each month.
 *
 * @see BankAccount
 *
 * @author Francis (iid3rp) Madanlo
 */
public class CertificateOfDeposit extends BankAccount
{
    /**
     * a constant double that will be the default interest rate
     */
    private static final double INTEREST_RATE = 0.05d;

    /**
     * a constant integer that will be the actual maturity of the Certificate of Deposit
     */
    private static final int NUMBER_OF_MATURITY_MONTHS = 6;

    /**
     * this will be the object-based interest rate of the certificate of deposit account
     */
    private double interestRate;

    /**
     * this will be the object-based number of maturity month of the certificate of deposit account
     */
    private int maturityMonths;

    /**
     * this will be the object-based current certificate of deposit
     * month of the certificate of deposit account
     */
    private int currentCDMonth;

    /**
     *  The default constructor of the CertificateOfDeposit class
     *  the initializes the class itself, and the BankAccount superclass constructor
     *  with parameters
     *
     * @param name the name of the bank account
     * @param accountNumber the associated account number of the bank account
     * @param balance The initial balance of the bank account
     */
    public CertificateOfDeposit(String name, int accountNumber, double balance)
    {
        super(name, accountNumber, balance);
    }

    /**
     *  The constructor with parameters of the CertificateOfDeposit class
     *  the initializes the class itself, the BankAccount superclass constructor
     *  with parameters,
     *
     * @param name the name of the bank account
     * @param accountNumber the associated account number of the bank account
     * @param balance The initial balance of the bank account
     * @param interestRate the interest rate of the Certificate of Deposit
     * @param maturityMonths the maturity months of the Certificate of Deposit
     */
    public CertificateOfDeposit(String name, int accountNumber, double balance, double interestRate, int maturityMonths)
    {
        super(name, accountNumber, balance);
        this.interestRate = interestRate;
        this.maturityMonths = maturityMonths;
    }

    /**
     * this will create a method that adds an interest within the whole balance of
     * the associated bank account object.
     */
    public void postInterest()
    {
        super.balance *= (1d + interestRate);
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
     * the getter of the CertificateOfDeposit class that returns the number of maturity
     * months of the associated BankAccount
     * @return the integer value of the maturity months of the current Certificate of Deposit's object
     */
    public int getMaturityMonths()
    {
        return maturityMonths;
    }

    /**
     * the setter of the CertificateOfDeposit class that sets the number of maturity
     * months of the associated BankAccount
     *
     * @param maturityMonths the amount of the maturity month of the Certificate of Deposit's object
     */
    public void setMaturityMonths(int maturityMonths)
    {
        this.maturityMonths = maturityMonths;
    }

    /**
     * the getter of the CertificateOfDeposit class that returns the number of maturity
     * months of the associated BankAccount
     *
     * @return the integer value of the current Certificate of Deposit's month of the
     * Certificate of Deposit's object
     */
    public int getCurrentCDMonth()
    {
        return currentCDMonth;
    }

    /**
     * the setter of the CertificateOfDeposit class that sets the current
     * Certificate of Deposit's month of the associated BankAccount.
     *
     * @param currentCDMonth the current Certificate of Deposit month.
     */
    public void setCurrentCDMonth(int currentCDMonth)
    {
        this.currentCDMonth = currentCDMonth;
    }

    /**
     * The withdrawal method that would decrease the balance based on the hypothetical amount would
     * the bank account like to withdraw with the condition that the balance should be greater than the
     * parameter (amount) in which to be withdrawn to the bank account. it should also increment the
     * month of the Certificate of Deposit each withdraw. additionally, print the monthly statement after.
     *
     * @param amount the amount value that should be withdrawn to the bank account
     */
    @Override
    public void withdraw(double amount)
    {
        super.withdraw(amount);
        currentCDMonth++;
        this.createMonthlyStatement();
    }

    /**
     * The withdrawal method that would flush the whole balance, basically withdraw all
     * the (hypothetical) money you have..
     */
    public void withdraw()
    {
        if(currentCDMonth == maturityMonths)
        {
            balance -= balance;
        }
    }

    @Override
    public void createMonthlyStatement()
    {
        System.out.println(this);
    }

    /**
     *  Returns a string representation of the {@code CertificateOfDeposit} class that returns the data
     *  as a String constructed for readability and reference of what are the contents
     *  of the Certificate of Deposit object.
     * @return String value of the constructed Certificate of Deposit object
     */
    @Override
    public String toString()
    {
        return super.toString() + "Current Month: " + currentCDMonth + "\n";
    }
}