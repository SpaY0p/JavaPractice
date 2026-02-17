import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int no = input.nextInt();
        if (no > 0) {
            if (no % 2 == 0) {
                System.out.println("Positive Even");
            } else {
                System.out.println("Positive Odd");
            }
        } else if (no < 0) {
            if (no % 2 == 0) {
                System.out.println("Negative Even");
            } else {
                System.out.println("Negative Odd");
            }
        } else {
            System.out.println("Zero");
        }
        input.close();
    }
}