import java.util.Scanner;
public class DeclareVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int a = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int b = sc.nextInt();
        if(a > b) {
            System.out.println("num1 is greater than num2");
        }
        else if(a < b) {
            System.out.println("num1 is less than num2");
        }
        else if(a == b) {
            System.out.println("num1 equal to num2");
        }
    }
}
