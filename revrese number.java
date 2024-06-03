import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER A NUMBER TO REVERSE: ");
        int dec=sc.nextInt();
        int reverse=0;
        int reminder;
        while(dec>0){
            reminder=dec%10;
            reverse=(reverse*10)+reminder;
            dec/=10;
        }
        System.out.print(+reverse);
    }
}