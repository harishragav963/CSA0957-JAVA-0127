import java.util.Scanner;

class School {
    private int totalStrength;
    private int staff;
    private int nonStaff;
    private int students;

    public School(int totalStrength, int staff) {
        this.totalStrength = totalStrength;
        this.staff = staff;
        calculateMembers();
    }

    private void calculateMembers() {
        this.nonStaff = staff / 3;
        this.students = totalStrength - nonStaff - staff;
    }

    public void displayInfo() {
        System.out.println("STAFF: " + staff);
        System.out.println("STUDENT: " + students);
        System.out.println("TOTAL STRENGTH: " + totalStrength);
        System.out.println("NON STAFF: " + nonStaff);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE TOTAL STRENGTH: ");
        int totalStrength = sc.nextInt();
        System.out.print("ENTER THE NUMBER OF STAFF: ");
        int staff = sc.nextInt();

        School sch = new School(totalStrength, staff);
        sch.displayInfo();
    }
}
