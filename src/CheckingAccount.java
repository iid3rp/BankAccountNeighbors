public abstract class CheckingAccount extends BankAccount
{
    public CheckingAccount(String name, int id, double balance)
    {
        super(name, id, balance);
    }

    public abstract void writeCheck(double check);
}
