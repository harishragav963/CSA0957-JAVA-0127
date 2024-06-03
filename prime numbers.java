import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER: ");
        int n=sc.nextInt();
        int div=0;
        if(n<=0){
            System.out.print("THE NUMBER IS NOT ELIGIBLE");
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                div=i;
                break;
            }
        }
        if(div==0){
            System.out.print("THE NUMBER IS PRIME");
        }
        else{
            System.out.print("THE NUMBER IS NOT PRIME");
        }
    }
}