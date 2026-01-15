import java.util.Scanner;
public class CalculateFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        System.out.println(calculateFactorial(a));
        sc.close();
    }
    public static int calculateFactorial(int n) {
        int f = 1;

        for(int i = n; i > 0; i--) {
            f = f * i;
        }
        return f;
    }
}
