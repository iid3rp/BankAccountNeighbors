import Person.Person;

public abstract class BankAccount
{
    protected int accountNumber;
    protected String name;
    protected double balance;
    protected Person accountHolder;

    public BankAccount(String name, int accountNumber, double balance)
    {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        accountHolder = new Person(name);
    }

    public abstract void createMonthlyStatement();

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getBalance()
    {
        return balance;
    }

    public void deposit(double amount)
    {
        balance = amount;
    }

    public void withdraw(double amount)
    {
        this.balance = balance >= amount? balance - amount : balance;
    }

    public String toString()
    {
        return  "Name: " + name + "\n" +
                "Account Number: " + accountNumber + "\n" +
                "Balance: " + balance + "\n" + accountHolder;
    }
}
