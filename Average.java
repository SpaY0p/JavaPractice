import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int total = 0;
            for (int i = 1; i <= 3; i++) {
            System.out.print("Enter mark " + i + ": ");
            int mark = input.nextInt();
            total = total + mark;
        }
        double average = total / 3.0;
        System.out.println("The average marks is: " + average);
        input.close();
    }
}