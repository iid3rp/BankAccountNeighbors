public class ServiceChargeChecking extends CheckingAccount
{
    private static final double ACCOUNT_SERVICE_CHARGE = 10d;
    private static final int MAXIMUM_NUM_OF_CHECKS = 5;
    public static final double SERVICE_CHARGE_EXCESS_NUM_OF_CHECKS = 5;
    protected double serviceChargeAccount;
    protected double serviceChargeCheck;
    protected int numberOfChecksWritten;
    public ServiceChargeChecking(String name, int id, double balance)
    {
        super(name, id, balance);
    }

    public ServiceChargeChecking(String name, int id, double balance, double serviceChargeAccount, double serviceChargeCheck)
    {
        super(name, id, balance);
        this.serviceChargeAccount = serviceChargeAccount;
        this.serviceChargeCheck = serviceChargeCheck;
    }

    public double getServiceChargeAccount()
    {
        return serviceChargeAccount;
    }

    public void setServiceChargeAccount(double serviceChargeAccount)
    {
        this.serviceChargeAccount = serviceChargeAccount;
    }

    public double getServiceChargeCheck()
    {
        return serviceChargeCheck;
    }

    public void setServiceChargeCheck(double serviceChargeCheck)
    {
        this.serviceChargeCheck = serviceChargeCheck;
    }

    public int getNumberOfChecksWritten()
    {
        return numberOfChecksWritten;
    }

    public void setNumberOfChecksWritten(int numberOfChecksWritten)
    {
        this.numberOfChecksWritten = numberOfChecksWritten;
    }

    public void postServiceCharge()
    {
        System.out.println("Service Charges: " + getServiceChargeCheck());
    }

    public void writeCheck(double amount)
    {
        setServiceChargeCheck(amount);
    }

    @Override
    public void createMonthlyStatement()
    {
        System.out.println(this);
    }

    public String toString()
    {
        return super.toString();
    }
}
