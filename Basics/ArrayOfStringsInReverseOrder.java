import java.util.Scanner;
public class ArrayOfStringsInReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of strings : ");
        int n = sc.nextInt();
        sc.nextLine();
        String s[] = new String[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Enter String " + (i + 1) + " : ");
            s[i] = sc.nextLine();
        }
        System.out.print("Strings in Reverse Order : ");

        for(int i = n - 1; i >= 0; i--) {
            System.out.print(" " + s[i]);
        }
    }
}
