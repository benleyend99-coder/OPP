package bank;

public class CheckingAccount {
    //atributos
    private String name;
    private double balance;
    private String id;
    private double interestRate;
    //constructor
    public CheckingAccount(String inputName, double inputBalance, String inputId){
        this.name = inputName;
        this.balance = inputBalance;
        this.id = inputId;
        this.interestRate = 0.05;
    }
    //setter & getters atributo balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = this.balance + balance;
    }
    //calcula interes mensual
    public double getMonthlyInterest(){
        return this.interestRate * this.balance;
  }
    
           
}
