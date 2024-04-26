import Person.Person;

/**
 * A BankAccount abstract class is a blueprint for creating different
 * types of bank accounts. It serves as a template that outlines common
 * properties and methods shared by all types of bank accounts, such as
 * savings accounts, checking accounts, and Certificate of Deposit. This
 * class typically defines attributes like account number, account holder
 * name, balance, and methods like deposit, withdraw, and its abstract method
 * that checks the monthly statement of our bank account that lays out a framework for
 * subclasses to inherit and implement according to their specific requirements.
 * <p></p>
 * In the real world, a bank account acts like a secure container for your money at a bank.
 * It's like a special box where you can deposit cash or checks to add funds, withdraw
 * cash when you need it, and keep track of your current balance.  Some accounts might even
 * earn you interest, like a small reward for keeping your money there. It's where the other
 * types of bank accounts make use of. Like checking accounts, savings accounts, and Certificate
 * of Deposits.
 *
 * @apiNote There should be no type of bank account that extends a
 * {@code BankAccount} class that's by itself. It is intended to make use of this class
 * on its subclasses.
 *
 * @see SavingsAccount
 * @see HighInterestSavings
 * @see CertificateOfDeposit
 * @see ServiceChargeChecking
 * @see NoServiceChargeChecking
 * @see HighInterestChecking
 *
 * @author Francis (iid3rp) Madanlo
 */
public abstract class BankAccount
{
    /**
     * The name of the bank account
     */
    protected String name;

    /**
     * the account number of the bank account. Intentionally making it a long
     * primitive data type to support more than 10 digits.
     */
    protected long accountNumber;

    /**
     * the balance of the bank account
     * <p>(for reference only)</p>
     */
    protected double balance;

    /**
     * the Person class of the bank account that associates within the BankAccount class
     * @see  Person
     */
    protected Person accountHolder;

    /**
     *  The default constructor of the BankAccount class
     *  the initializes the class itself, and the values: name, account number,
     *  and the initial balance of the BankAccount that also initializes its
     *  default Person constructor.
     */
    public BankAccount()
    {
        name = "";
        accountNumber = 0L;
        balance = 0d;
        accountHolder = new Person();
    }

    /**
     *  The constructor with parameters of the BankAccount class
     *  the initializes the class itself, and the values name, account number,
     *  the initial balance of the BankAccount, and its
     *  Person class with a name-only constructor.
     *
     * @param name the name of the bank account
     * @param accountNumber  the associated account number of the bank account
     * @param balance The initial balance of the bank account
     */
    public BankAccount(String name, long accountNumber, double balance)
    {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        accountHolder = new Person(name);
    }

    /**
     * the abstract method {@code createMonthlyStatement()} is a blueprint to be instantiated
     * with its subclasses in which the goal of the method is to print the hypothetical monthly
     * statement of any class that extends a class that might potentially extend this class
     * when trying to call this method in which it will print a {@code
     * toString() method of the subclass}.
     *
     * <p></p><p>It should look like this in subclasses:</p><p></p>
     * <blockquote><pre>
     *  {@code
     *  public class SomeClass extends BankAccount
     *  {
     *      @Override
     *      public void createMonthlyStatement()
     *      {
     *          System.out.println(this);
     *      }
     *  }
     *  }
     *  </pre></blockquote>
     */
    public abstract void createMonthlyStatement();

    /**
     * the getter of the BankAccount class that returns a long primitive data type
     * that resembles the account number
     * @return the account number of the bank account
     */
    public long getAccountNumber()
    {
        return accountNumber;
    }

    /**
     * the getter of the BankAccount class that returns a String value of
     * the name of the bank account
     * @return the String value of the name that associates the bank account
     */
    public String getName()
    {
        return name;
    }

    /**
     * the setter of the BankAccount class that re-initializes the String value of
     * the name of the bank account
     * @return the double value of the balance of the bank account
     */
    public double getBalance()
    {
        return balance;
    }

    /**
     * the setter of the BankAccount class that re-initializes the String value of
     * the name of the bank account
     * @param name the String value of the name that should associate within the bank account
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * the deposit method that would add the balance based on the hypothetical amount would
     * the bank account like
     * @param amount the amount value that should be added to the balance of the bank account
     */
    public void deposit(double amount)
    {
        balance = amount;
    }

    /**
     * The withdrawal method that would decrease the balance based on the hypothetical amount would
     * the bank account like to withdraw with the condition that the balance should be greater than the
     * parameter (amount) in which to be withdrawn to the bank account.
     * @param amount the amount value that should be withdrawn to the bank account
     */
    public void withdraw(double amount)
    {
        this.balance = balance > amount? balance - amount : balance;
    }

    /**
     *  Returns a string representation of the BankAccount class that returns the data
     *  as a String constructed for readability and reference of what are the contents
     *  of the bank account.
     * @return String value of the constructed bank account
     */
    @Override
    public String toString()
    {
        return  "Name: " + name + "\n" +
                "Account Number: " + accountNumber + "\n" +
                "Balance: " + balance + "\n" + accountHolder + "\n";
    }
}
