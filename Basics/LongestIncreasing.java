import java.util.Scanner;

public class LongestIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count of number : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < a.length; i++) {
            System.out.print("Enter the number " + (i + 1) + " : ");
            a[i] = sc.nextInt();
        }

        int start = 0, maxStart = 0;
        int len = 1, maxLen = 1;

        for(int i = 1; i < n; i++) {
            if(a[i] > a[i - 1]) {
                len++;
            }
            else {
                if(len > maxLen) {
                    maxLen = len;
                    maxStart = start;
                }
                start = i;
                len = 1;
            }
        }
        if(len > maxLen) {
            maxLen = len;
            maxStart = start;
        }
        System.out.print("Lorgest Increasing : { ");
        for(int i = maxStart; i < maxStart + maxLen; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("}");
    }
}
