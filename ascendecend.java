import java.util.Scanner;

public class ascendecend{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE SIZE OF THE ARRAY: ");
        int n=sc.nextInt();
        int temp;
        int [] a=new int [n];
        System.out.print("ENTER THE ARRAY ELEMENTS: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("~THE ASCENDING ORDER IS~");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }

    /*public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE SIZE OF THE ARRAY: ");
        int n=sc.nextInt();
        int temp;
        int [] a=new int [n];
        System.out.print("ENTER THE ARRAY ELEMENTS: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("~THE DESCENDING ORDER IS~");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }*/

}