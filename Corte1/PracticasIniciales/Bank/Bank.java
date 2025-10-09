package bank;

public class Bank {
    private CheckingAccount account1; 
    private CheckingAccount account2;
    
    public Bank(){
        account1 = new CheckingAccount("Alex",100,"1");
        account2 = new CheckingAccount("Daivd",10500,"1");
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Bank bank1 = new Bank();
        System.out.println(bank1.account1.getBalance());
        bank1.account1.setBalance(5000);
        System.out.println(bank1.account1.getBalance());
        System.out.println(bank1.account1.getMonthlyInterest());
    }
    
}
