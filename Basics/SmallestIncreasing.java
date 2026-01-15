import java.util.*;
public class SmallestIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter count of he number : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter the number " + (i + 1) + " : ");
            a[i] = sc.nextInt();
        }
        int start = 0;
        int len = 1;
        for(int i = 1; i < n; i++) {
            if(a[i] > a[i - 1]) {
                len++;
            }
            else {
                break;
            }
        }
        System.out.print("Smallest increasing : { ");
        for(int i = start; i < start + len; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("}");
    }
}
