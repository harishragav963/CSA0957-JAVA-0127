//fibonacci
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the value of n: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f1=0;
        int f2=1;
        System.out.println(+f1);
        System.out.println(+f2);
        for(int i=3;i<=n;i++)
        {
            int f3=f1+f2;
            System.out.println(+f3);
            f1=f2;
            f2=f3;
        }
    }
}