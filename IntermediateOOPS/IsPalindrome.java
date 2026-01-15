import java.util.Scanner;
public class IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine().toUpperCase();
        System.out.println(isPalindrome(s));
        sc.close();
    }
    public static boolean isPalindrome(String str) {
        String l = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            l += str.charAt(i);
        }
        if(str.equals(l)) {
            return true;
        }
        else {
            return false;
        }
    }
}
