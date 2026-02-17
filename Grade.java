    import java.util.Scanner;
    public class Grade {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter marks obtained: ");
            int marks = input.nextInt();
            if (marks >= 90){
                System.out.println("Grade A");
            }
            else if (marks >= 75 & marks < 90){
                System.out.println("Grade B");
            }
            else if (marks >= 50 & marks < 75){
                System.out.println("Grade C");
            }
            else{
                System.out.println("Fail");
            }
        input.close();
        }
    }