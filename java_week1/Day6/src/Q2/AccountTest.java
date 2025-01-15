package Q2;

public class AccountTest {
    public static void main(String args[]) throws InterruptedException {
        Account account = new Account(1000);
        System.out.println("Initial Amount in the account "+account.getBalance());

        Bank bank = new Bank(account);
        Company company = new Company(account);

        Thread bankThread = new Thread(bank);
        Thread companyThread = new Thread(company);

        bankThread.start();
        companyThread.start();
        bankThread.join();
        companyThread.join();
        System.out.println("Final Balance in the amount "+account.getBalance());
    }
}
