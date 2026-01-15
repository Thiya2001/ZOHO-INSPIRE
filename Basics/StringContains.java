import java.util.Scanner;
public class StringContains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine();
        s = s.toUpperCase();
        if(s.contains("JAVA")) {
            System.out.println("The String contains java");
        }
        else {
            System.out.println("The String does not contains java");
        }
    }
}


// import java.util.Scanner;
// public class StringContains {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the String : ");
//         String s = sc.nextLine().toUpperCase();
//         boolean b = false;
//         for(int i = 0; i <= s.length() - 4; i++) {
//             if(s.charAt(i) == 'J' && s.charAt(i + 1) == 'A' && s.charAt(i + 2) == 'V' && s.charAt(i + 3) == 'A') {
//                 b = true;
//                 break;
//             }
//         }
//         if(b) {
//             System.out.println("The String contains java");
//         }
//         else {
//             System.out.println("The String does not contains java");
//         }
//     }
// }

