    import java.util.Scanner;
    public class Rev {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int no = input.nextInt();
            int rev=0;
            while (no!=0){
                int dig = no%10;
                rev=rev*10+dig;
                no=no/10;
            }
        System.out.println("Reversed number: " + rev);
        input.close();
        }
    }