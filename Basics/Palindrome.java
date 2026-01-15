import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine().toUpperCase();
        String rev = "";
        for(int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        if(rev.equals(s)) {
            System.out.println("Yes It is Palindrome.");
        }
        else {
            System.out.println("Not a Palindrome.");
        }
    }
}


// import java.util.Scanner;
// public class Palindrome {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the string : ");
//         String s = sc.nextLine().toUpperCase();

//         String rev = new StringBuilder(s). reverse(). toString();

//         if(rev.equals(s)) {
//             System.out.println("Palindrome");
//         }
//         else {
//             System.out.println("Not Palindrome");
//         }
//     }
// }


// import java.util.Scanner;
// public class Palindrome {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the String : ");
//         String s = sc.nextLine().toUpperCase();

//         int start = 0, end = s.length() - 1;
//         boolean Palindrome = true;

//         while(start < end) {
//             if(s.charAt(start) != s.charAt(end)) {
//                 Palindrome = false;
//                 break;
//             }
//             start++;
//             end--;
//         }
//         if(Palindrome) {
//             System.out.println("Palindrome");
//         }
//         else {
//             System.out.println("Not a Palindrome");
//         }
//     }
// }