import java.util.Scanner;
public class SpaceIgnorePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String : ");
        String a = sc.nextLine().toUpperCase();
        String b = "";
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) != ' '){
                b += a.charAt(i);
            }
        }
        String rev = "";
        for(int i = b.length() - 1; i >= 0; i--) {
            rev += b.charAt(i);
        }
        if(rev.equals(b)) {
            System.out.print("Yes It Is Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}
