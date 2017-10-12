package bankaccountapp;

/**
 *
 * @author Mihail
 */
public class BankAccountApp {

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("19409233535", 300);
        BankAccount acc2 = new BankAccount("19303113571", 500);
        BankAccount acc3 = new BankAccount("19602435558", 100);
        
        acc2.setName("Ion");
        System.out.println(acc2.getName());
        acc2.makeDeposit(200);
        acc2.payBill(50);
        acc2.bnkpol();
        acc2.toString();
        System.out.println(acc2.toString());
    }
    
}

class BankAccount implements BInterest{
    private static int bnkID = 1300;
    private String accountNumber;
    private String name;
    private static final String routingNumber = "005611567"; //bank region code
    private String CNP;
    private Double balance;
    
    public BankAccount(String CNP, double initDeposit){
        System.out.println("New Account Created");
        balance = initDeposit;
        this.CNP = CNP;
        bnkID++;
        setAccountNumber();   
    }
    
    
    private void setAccountNumber(){
        int random = (int) (Math.random()*10);
        accountNumber = bnkID + "" + random + CNP.substring(0,2);
        System.out.println("Your Account Number: " + accountNumber);
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
    public void payBill(double amount){
        balance = balance - amount;
        System.out.println("Paying Bill, amount: " + amount);
        showBalance();
    }
    
    public void makeDeposit(double amount){
        balance = balance + amount;
        showBalance();
    }
    
    public void showBalance(){
        System.out.println("Balance: " + balance);
    }
    
    public void bnkpolInterest(){
        
    }

    @Override
    public void bnkpol() {
        balance = balance * (1 + rate/100);
    }
    
    @Override
    public String toString(){
        return  "[Name: " + name + " ]\n[Account Number " + accountNumber + "]\n" + "[Routing Number: " + routingNumber + "]\n" + "[Balance" + balance + "]";
    }
}
