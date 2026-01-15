import java.util.Scanner;
public class ThirdLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count of number : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int fl = 0, sl = 0, tl = 0;
        for(int i = 0; i < a.length; i++) {
            System.out.print("Enter the number : ");
            a[i] = sc.nextInt();
        }
        if(a.length >= 3) {
            for(int i = 0; i < a.length; i++) {
                if(a[i] > fl) {
                    sl = fl;
                    fl = a[i];
                }
                else if(a[i] > sl) {
                    tl = sl;
                    sl = a[i];
                }
                else if(a[i] > tl) {
                    tl = a[i];
                }
            }
        }
        else {
            System.out.println("-1");
        }
        System.out.print("Third Largest Number is : " + tl);
    }
}
