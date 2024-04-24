/**
 * A checking account adapts the attributes of a bank account from the BankAccount class.
 * But it has to include an abstraction that includes checking, thus the name CheckingAccount
 * that has an abstract method {@code writeCheck()}.
 *
 * @see BankAccount
 * @author Francis (iid3rp) Madanlo
 */

public abstract class CheckingAccount extends BankAccount
{
    /**
     * The default constructor that creates an instantiation of the class that should be
     * referenced to a BankAccount class (deconstructed) in which will be initialized.
     *
     * @param name the name of the bank account
     * @param accountNumber the account number of the bank account
     * @param balance the balance that associates within the bank account
     */
    public CheckingAccount(String name, int accountNumber, double balance)
    {
        super(name, accountNumber, balance);
    }

    /**
     * this abstract method will be reserved to create a check in which will be used
     * with other subclasses in which, what it does is to write (print) a check with a
     * hypothetical amount
     *
     * @param amount the amount in which to be put in a check
     */
    public abstract void writeCheck(double amount);
}
