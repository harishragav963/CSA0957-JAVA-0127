//TYPE-1
/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER A DECIMAL NUMBER: ");
        int dec=sc.nextInt();
        System.out.println(Integer.toBinaryString(dec));
    }
}*/

//TYPE-2

import java.util.Scanner;

public class Main{
    public static void toBinary(int decimal){
        int binary[] = new int[10];
        int index = 0;
        while(decimal > 0){
            binary[index++] = decimal%2;
            decimal = decimal/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
    }
    public static void main(String args[]){
        int n;
        System.out.print("ENTER A DECIMAL NUMBER: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.print("THE BINARY NUMBER OF "+n+" IS: ");
        toBinary(n);
    }
}
