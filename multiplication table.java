import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i=1;
        int k;
        Scanner l=new Scanner(System.in);
        System.out.print("ENTER THE TABLE YOU WANT: ");
        int n=l.nextInt();
        System.out.print("ENTER THE NUMBER YOU WANT TILL: ");
        int m=l.nextInt();
        for(i=1;i<=m;i++){
            k=n*i;
            System.out.println(+i+"X"+n+"="+k);
        }
    }
}