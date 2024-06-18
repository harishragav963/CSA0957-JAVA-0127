public class bankaccount{
    private int acc_no;
    private String acc_name;
    private double balance;
    private String accounttype;
    private static double min_balance=100.0;

    public bankaccount(String acc_name,int acc_no,String accounttype,double intialbal){
        this.acc_no=acc_no;
        this.acc_name=acc_name;
        this.accounttype=accounttype;
        this.balance=intialbal>min_balance?intialbal:min_balance;

    }

    public void displaybalance(){
        System.out.println("Account No: "+acc_no);
        System.out.println("Account Name: "+acc_name);
        System.out.println("Account Type: "+accounttype);
        System.out.println("Balance: RS. "+balance);
    }

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited of RS. "+amount+ " successful");
        }
        else{
            System.out.println("Deposited of RS. "+amount+ " failed");
        }
    }

    public void withdraw(double amount){
        if(amount>0 && balance-amount>=500.0){
            balance-=amount;
            System.out.println("Withdrawal of RS. "+amount+ " successful");
        }
        else{
            System.out.println("Withdrawal of RS. "+amount+ " failed due to insufficient amount");
        }
    }
    public static void main(String[] args){
        bankaccount account=new bankaccount("JOHN doe",12345,"saving",1000.0);
        account.displaybalance();
        account.deposit(500.0);
        account.withdraw(500.0);
        account.withdraw(600.0);
    }
}
