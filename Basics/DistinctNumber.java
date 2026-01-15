import java.util.Scanner;
public class DistinctNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count of number : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < a.length; i++) {
            System.out.print("Enter the number " + (i + 1) + " : ");
            a[i] = sc.nextInt();
        }
        boolean num = false;
        System.out.print("Distinct Number : { ");
        for(int i = 0; i < a.length; i++) {
            int count = 0;
            for(int j = 0; j < a.length; j++) {
                if(a[i] == a[j]) {
                    count++;
                }
            }
            if(count == 1) {
                System.out.print(a[i] + " ");
                num = true;
            }
        }
        if(!num) {
            System.out.print(" ");
        }
        System.out.print("}");
    }
}
