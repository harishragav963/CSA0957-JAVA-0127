//factorial
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("ENTER THE NUMBER: ");
        int num=sc.nextInt();
        int i=1,fact=1;
        while(i<=num){
            fact*=i;
            i++;
        }
        System.out.println("FACTORIAL OF THE GIVEN "+num+" IS: "+fact);
    }
}
