import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter salary of employ: ");
        int sal = input.nextInt();
        System.out.print("Enter bolus for employ: ");
        int sbon = input.nextInt();
        double total = sal + sbon;
        System.out.println("Total Income: " + total);
    input.close();
    }
}