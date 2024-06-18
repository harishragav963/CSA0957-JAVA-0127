import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE RANGE OF YOUR EB TALLY: ");
        int n=sc.nextInt();
        if(n>=0 && n<=100){
            System.out.print(n*5);
        }
        else if(n>=101 && n<=300){
            System.out.print(n*10);
        }
        else{
            System.out.print(n*15);
        }
    }
}