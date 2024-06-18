import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary: ");
        double salary = sc.nextDouble();
        System.out.println("Enter Grade: ");
        char grade = sc.next().charAt(0);
        double bonus = 0;
        double total = 0;
        if (salary <= 10000){
            bonus+= salary * 0.02;
            switch(grade) {
                case 'A':
                    bonus+= salary * 0.05;
                    break;
                case 'B':
                    bonus+= salary * 0.10;
                    break;
            }
        }
        else {
            switch(grade) {
                case 'A':
                    bonus = salary * 0.05;
                    break;
                case 'B':
                    bonus = salary * 0.10;
                    break;
            }
        }
        total = bonus + salary;
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Salary with bonus: " + total);

    }
}