import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        int sum=0;
        System.out.print("ENTER THE NUMBER: ");
        int num=n.nextInt();
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        System.out.println("THE SUM OF "+num+" IS: "+sum);
    }
}