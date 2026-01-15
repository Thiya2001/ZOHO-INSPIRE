import java.util.Scanner;
public class AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count of String : ");
        int n  = sc.nextInt();
        sc.nextLine();
        String[] a = new String[n];
        for(int i = 0; i < a.length; i++) {
            System.out.print("Enter the String " + (i + 1) + " : ");
            a[i] = sc.nextLine();
        }
        for(int i = 0; i < a.length - 1; i++) {
            for(int j = i + 1; j < a.length; j++) {
                if(a[i].charAt(0) > a[j].charAt(0)) {
                    String temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Alphabetical Order of String : ");
        for(String res : a) {
            System.out.print(res + ", ");
        }
    }
}
