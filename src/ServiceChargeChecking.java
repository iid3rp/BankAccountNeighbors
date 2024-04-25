/**
 * ServiceChargeChecking class extends the functionality of the CheckingAccount class to
 * provide a checking account option that may incur a monthly service charge fee, with
 * methods and attributes tailored to manage and communicate the imposition of service
 * charges effectively.
 *
 * @author Francis (iid3rp) Madanlo
 */
public class ServiceChargeChecking extends CheckingAccount
{
    /**
     * the default constant value of the account service charge when you check every
     * time on the current ServiceChargeChecking object..
     */
    private static final double ACCOUNT_SERVICE_CHARGE = 10d;

    /**
     * the default constant value of the maximum amount of checks that you can
     *  check on the current ServiceChargeChecking object..
     */
    private static final int MAXIMUM_NUM_OF_CHECKS = 5;

    /**
     * the default constant value of the charge when the check has reached the maximum amount of checks
     * on a current ServiceChargeChecking object..
     */
    public static final double SERVICE_CHARGE_EXCESS_NUM_OF_CHECKS = 5;

    /**
     * the actual value of the account service charge on the ServiceChargeChecking object..
     */
    protected double accountServiceCharge;

    /**
     * the actual value of your change when you make checks every time on the current ServiceChargeChecking object..
     */
    protected double serviceChargeCheck;

    /**
     * the actual value of your checks that it has have made on the current ServiceChargeChecking object..
     */
    protected int numberOfChecksWritten;

    /**
     *  The default constructor of the accountServiceCharge class
     *  the initializes the class itself, and the BankAccount superclass constructor
     *  with parameters
     *
     * @param name the name of the bank account
     * @param accountNumber the associated account number of the bank account
     * @param balance The initial balance of the bank account
     */
    public ServiceChargeChecking(String name, int accountNumber, double balance)
    {
        super(name, accountNumber, balance);
    }

    /**
     *  The constructor with parameters of the accountServiceCharge class
     *  the initializes the class itself, the BankAccount superclass constructor
     *  with parameters,
     *
     * @param name the name of the bank account
     * @param accountNumber the associated account number of the bank account
     * @param balance The initial balance of the bank account
     * @param accountServiceCharge value of the account service charge on the ServiceChargeChecking object..
     * @param serviceChargeCheck  value of your checks that it has have made on the current ServiceChargeChecking object..
     */
    public ServiceChargeChecking(String name, int accountNumber, double balance, double accountServiceCharge, double serviceChargeCheck)
    {
        super(name, accountNumber, balance);
        this.accountServiceCharge = accountServiceCharge;
        this.serviceChargeCheck = serviceChargeCheck;
    }

    /**
     * the getter of the {@code ServiceChargeChecking} value of the account service charge on the {@code ServiceChargeChecking} object..
     * @return the value of the current account service charge to the current ServiceChargeChecking object..
     */
    public double getAccountServiceCharge()
    {
        return accountServiceCharge;
    }

    /**
     * the setter of the {@code ServiceChargeChecking} value of the account service charge on the {@code ServiceChargeChecking} object..
     * @param accountServiceCharge value of the current account service charge to the current ServiceChargeChecking object..
     */
    public void setServiceChargeAccount(double accountServiceCharge)
    {
        this.accountServiceCharge = accountServiceCharge;
    }

    /**
     * the getter of the {@code ServiceChargeChecking} value of the service charge check on the {@code ServiceChargeChecking} object..
     * @return the value of the current service charge check to the current ServiceChargeChecking object..
     */
    public double getServiceChargeCheck()
    {
        return serviceChargeCheck;
    }

    /**
     * the setter of the {@code ServiceChargeChecking} value of the service charge check on the {@code ServiceChargeChecking} object..
     * @param serviceChargeCheck value of the current service charge check to the current ServiceChargeChecking object..
     */
    public void setServiceChargeCheck(double serviceChargeCheck)
    {
        this.serviceChargeCheck = serviceChargeCheck;
    }

    /**
     * the setter of the {@code ServiceChargeChecking} value of the service charge check on the {@code ServiceChargeChecking} object..
     * @return the value of the current check to the current ServiceChargeChecking object..
     */
    public int getNumberOfChecksWritten()
    {
        return numberOfChecksWritten;
    }

    /**
     * the setter of the {@code ServiceChargeChecking} value of the service charge check on the {@code ServiceChargeChecking} object..
     * @param numberOfChecksWritten value of the current check to the current ServiceChargeChecking object..
     */
    public void setNumberOfChecksWritten(int numberOfChecksWritten)
    {
        this.numberOfChecksWritten = numberOfChecksWritten;
    }

    /**
     * this is a method from the {@code ServiceChargeChecking} class that basically takes the charge of the
     * balance when every time you make a check on your checking account.
     */
    public void postServiceCharge()
    {
        balance = balance > accountServiceCharge? balance - accountServiceCharge : balance;
    }

    /**
     *  this is method from the {@code ServiceChargeChecking} class that generates a hypothetical check when you call this method.
     *  It also withdraws and makes it a hypothetical check that will print the confirmation that the check has been made when validated
     *
     * @param amount the amount of would you like to make a che
     *               ck with at the current checking account
     */
    @Override
    public void writeCheck(double amount)
    {
        if(balance > amount + accountServiceCharge)
        {
            withdraw(amount);
            postServiceCharge();
            String check = "";
            System.out.println(check);
        }
    }

    @Override
    public void createMonthlyStatement()
    {
        System.out.println(this);
    }

    /**
     *  Returns a string representation of the {@code ServiceChargeChecking} class that returns the data
     *  as a String constructed for readability and reference of what are the contents
     *  of the Service Charge Checking object.
     * @return String value of the constructed Certificate of Deposit object
     */
    @Override
    public String toString()
    {
        return super.toString();
    }
}
