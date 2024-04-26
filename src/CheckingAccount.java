/**
 * A checking account adapts the attributes of a bank account from the BankAccount class.
 * But it has to include an abstraction that includes checking, thus the name CheckingAccount
 * that has an abstract method {@code writeCheck()}.
 * <p></p>
 * A checking account is like a super-powered wallet that keeps your money safe and
 * accessible for everyday spending. Unlike a traditional wallet where you carry cash,
 * a checking account lets you deposit and withdraw funds electronically. It acts as a
 * digital hub for your money.
 *
 * @apiNote There should be no type of checking account that extends a
 * {@code CheckingAccount} class that is by itself. It should make use of this class in which
 * to be used within its subclasses.
 * @see BankAccount
 * @see HighInterestChecking
 * @see NoServiceChargeChecking
 * @see ServiceChargeChecking
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
    public CheckingAccount(String name, long accountNumber, double balance)
    {
        super(name, accountNumber, balance);
    }

    /**
     * this abstract method will be reserved to create a check in which will be used
     * with other subclasses in which, what it does is to withdraw your money and then
     * write (print) a hypothetical check with a hypothetical amount.
     *
     * <p></p><p>It should look like this in following classes:</p>
     * <blockquote><pre>
     * {@code NoServiceChargeChecking} and {@code HighInterestChecking} class:
     *
     *  {@code
     *  public class NoServiceChargeCheckingType extends CheckingAccount
     *  {
     *      @Override
     *      public void writeCheck(double amount)
     *      {
     *          if(balance > amount)
     *          {
     *              withdraw(amount);
     *              System.out.println(checkString); // check information
     *          }
     *      }
     *  }
     *  }
     *
     *  {@code ServiceChargeChecking} class:
     *
     *  {@code
     *  public class ServiceChargeChecking extends CheckingAccount
     *  {
     *     @Override
     *     public void writeCheck(double amount)
     *     {
     *          if(balance > amount + accountServiceCharge)
     *          {
     *              withdraw(amount);
     *              postServiceCharge();
     *              System.out.println(checkString); // check information
     *          }
     *      }
     *  }
     *  }
     *  </pre></blockquote>
     *
     * @param amount the amount in which to be put in a check
     */
    public abstract void writeCheck(double amount);
}
