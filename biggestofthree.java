import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=m.nextInt();
        System.out.println("Enter the second number");
        int b=m.nextInt();
        System.out.println("Enter the third number");
        int c=m.nextInt();
        if(a>b && a>c){
            System.out.println("The "+a+" is greater");
        }
        else if(b>a && b>c){
            System.out.println("The "+b+" is greater");
        }
        else{
            System.out.println("The "+c+" is greater");
        }
    }
}