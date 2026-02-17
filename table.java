import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int no = input.nextInt();
        for (int i = 1 ; i <=10; i++) {
            int ta = no * i;
            System.out.print(no+"x"+i+"="+ta+" ");
        }
    }
}