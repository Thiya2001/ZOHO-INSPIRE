import java.util.Scanner;
public class PosNegZero {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if(num > 0) {
            System.out.println("Positive");
        }
        else if(num < 0) {
            System.out.println("Negative");
        }
        else if(num == 0) {
            System.out.println("Zero");
        }
    }
}
