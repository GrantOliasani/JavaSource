public class BankAccountnewTester
{
    
        public static void main (String [] args)
        {BankAccountnew grantsAccount = new BankAccountnew (20000);
         System.out.println("Grants Account 1 has $" + grantsAccount.getBalance());
         grantsAccount.interest(.04);
         System.out.println ("After adding interest, the account has $" + grantsAccount.getBalance());

         // System.out.println(grantsAccount.getBalance());
        
		 BankAccountnew grantssecondAccount = new BankAccountnew (40000);
         System.out.println("Grants second Account has $" + grantssecondAccount.getBalance());
         grantssecondAccount.interest(.04);
         System.out.println ("After adding interest, the account has $" + grantssecondAccount.getBalance());

         // System.out.println(grantsAccount.getBalance());
        
         BankAccountnew grantsthirdAccount = new BankAccountnew (60000);
         System.out.println("Grants third Account has $" + grantsthirdAccount.getBalance());
         grantsthirdAccount.interest(.04);
         System.out.println ("After adding interest, the account has $" + grantsthirdAccount.getBalance());

         // System.out.println(grantsAccount.getBalance());
        }

}