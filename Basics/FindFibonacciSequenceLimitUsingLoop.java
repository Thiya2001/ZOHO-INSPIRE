import java.util.Scanner;
public class FindFibonacciSequenceLimitUsingLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Limit : ");
        int n = sc.nextInt();

        int a = 0, b = 1, c = 0;
        while(a <= n) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
