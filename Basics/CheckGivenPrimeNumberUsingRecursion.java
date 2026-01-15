import java.util.Scanner;
public class CheckGivenPrimeNumberUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        if(isPrime(n, 2))
            System.out.print(n + " it is Prime Number.");
        else
            System.out.print(n + " it is Not a Prime Number");
    }
    public static boolean isPrime(int n, int i) {
        if(n <= 1)
            return false;

        else if(i * i > n)
            return true;

        else if(n % i == 0)
            return false;

        return isPrime(n, i + 1);

    }
}