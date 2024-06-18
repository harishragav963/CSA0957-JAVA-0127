import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER A STRING: ");
        String str=sc.nextLine();
        int a=0;
        int b=str.length-1;
        while(a<=b){
            char temp=str[a];
            str[a]=str[b];
            str[b]=temp;
        }
        return str;
    }
}