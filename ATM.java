import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF RS.100 NOTES: ");
        int a=sc.nextInt();
        a*=100;
        System.out.print("ENTER THE NUMBER OF RS.200 NOTES: ");
        int b=sc.nextInt();
        b*=200;
        System.out.print("ENTER THE NUMBER OF RS.500 NOTES: ");
        int c=sc.nextInt();
        c*=500;
        System.out.print("ENTER THE NUMBER OF RS.2000 NOTES: ");
        int d=sc.nextInt();
        d*=2000;
        int atm_balance=0;
        atm_balance+=a+b+c+d;
        System.out.println("ATM BALANCE: "+atm_balance);
    }
}