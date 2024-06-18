import java.util.Scanner;

public class Armstrongnumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER A NUMBER: ");
        int num=sc.nextInt();
        int temp=num;
        int rem=0;
        int res=0;
        while(num>0){
            rem=num%10;
            res+=rem*rem*rem;
            num/=10;
        }
        if(temp==res){
            System.out.print("IT IS AN ARMSTRONG NUMBER");
        }
        else{
            System.out.print("IT IS NOT ARMSTRONG NUMBER");
        }
    }
}