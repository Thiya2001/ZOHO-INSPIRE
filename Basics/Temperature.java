import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int C  = sc.nextInt();
        double F = (C * 9 / 5) + 32;
        System.out.println(F);
        // double F;
        // System.out.println(F = (C * 9 / 5) + 32);
    }
}
