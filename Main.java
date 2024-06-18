import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE SIZE OF THE ARRAY: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("ENTER THE ELEMENTS IN THE ARRAY: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for (int num : a) {
            if (num > max) {
                secMax = max;
                max = num;
            } else if (num > secMax && num != max) {
                secMax = num;
            }
        }

        System.out.println("THE FIRST MAX IS: " + max);
        System.out.println("THE SECOND MAX IS: " + secMax);
    }
}