import java.util.Scanner;
public class FindTheLCMOfTwoNumbersUseLooping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();

        int i;
        int max = (a > b) ? a : b;
        for(i = max; i < a * b; i++) {
            if(i % a == 0 && i % b == 0) {
                break;
            }
        }
        System.out.print("Least Common Multiple of " + a + " and " + b + " is : " + i);
        sc.close();
    }
}
