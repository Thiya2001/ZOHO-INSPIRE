import java.util.Scanner;
public class FirstNPrimeNumbersUseLooping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = sc.nextInt();
        int count = 0, num = 2;

        while (count < n) {
            boolean s = true;
            for(int i = 2; i <= num / 2; i++) {
                if(num % i == 0) {
                    s = false;
                    break;
                }
            }
            if(s) {
                System.out.print(num + " ");
                count++;
            }
            num++;
            sc.close();
        }
    }
}
