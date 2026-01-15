import java.util.Scanner;
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();

        int len = s.length() -1;
        String a = "";

        for(int i = len; i >= 0; i--) {
            a += s.charAt(i);
        }
        System.out.print(a);
    }
}
