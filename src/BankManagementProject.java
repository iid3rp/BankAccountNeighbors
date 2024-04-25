public class BankManagementProject
{
    public static void main(String[] a)
    {
        BankAccount x;
        SavingsAccount savingsAccount = new SavingsAccount("Francis Madanlo", 123454, 234.99);
        // System.out.println(savingsAccount);

        HighInterestSavings h1 = new HighInterestSavings("Francis L. Madanlo", 12345, 5000d, .05d,1000d);
        HighInterestSavings h2 = new HighInterestSavings("Kim Vera Tequin", 12345, 1000d, .05d,1000d);

        // example 1
        h1.withdraw(3000);
        h1.createMonthlyStatement();
        System.out.println();

        // example 2
        h2.withdraw(2000);
        h2.createMonthlyStatement();
        System.out.println();

        // casting the savings account to a highInterestSavings object
        SavingsAccount ref = new HighInterestSavings("Francis", 1, 120, 12, 100);
        ref.createMonthlyStatement();

        // testing the post-interest:
        h1.postInterest();
        h2.postInterest();

        h1.accountHolder.setPerson("Francis L. Madanlo", "Davao City", "10/17/2005", "none");
        System.out.println(h1.accountHolder);


        // re-create the monthly statement...
        h1.createMonthlyStatement();
        h2.createMonthlyStatement();
        System.out.println();

        NoServiceChargeChecking referenced = new NoServiceChargeChecking("Aize", 12345, 100);
        referenced.withdraw(20);
        referenced.createMonthlyStatement();
    }
}
