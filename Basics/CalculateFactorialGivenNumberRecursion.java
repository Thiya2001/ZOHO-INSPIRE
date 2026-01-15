import java.util.Scanner;
public class CalculateFactorialGivenNumberRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        System.out.print(isFactorial(n));
    }
    public static int isFactorial(int n) {
        if(n == 1)
            return 1;

        return n * isFactorial(n - 1);
    }
}
