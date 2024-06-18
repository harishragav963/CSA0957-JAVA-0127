import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class PerfectSquareFinder {

    public static void main(String[] args) {
        int start = 1;
        System.out.println("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int end = sc.nextInt();

        List<Integer> result = findPerfectSquaresWith(start, end, 10);

        System.out.println("Perfect squares in the range [" + start + ", " + end + "] with digit sum less than 10:");
        for (Integer number : result) {
            System.out.println(number);
        }
    }

    public static List<Integer> findPerfectSquaresWith(int start, int end, int maxDigitSum) {
        List<Integer> perfectSquares = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            if (isPerfectSquare(i) && sumOfDigits(i) < maxDigitSum) {
                perfectSquares.add(i);
            }
        }

        return perfectSquares;
    }

    public static boolean isPerfectSquare(int number) {
        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}