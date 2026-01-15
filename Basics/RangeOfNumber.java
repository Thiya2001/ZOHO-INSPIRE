import java.util.Scanner;
public class RangeOfNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number between 1 to 100 : ");
        int n = sc.nextInt();
        if(n >= 1 && n <= 50) {
            System.out.println("The number is in the lower half.");
        }
        else if(n >= 51 && n <= 100) {
            System.out.println("The number is in the upper half.");
        }
        else {
            System.out.println("Invalid Number.");
        }
    }
}

// import java.util.Scanner;
// public class RangeOfNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number between 1 - 100");
//         int n = sc.nextInt();
//         String s = (n > 1 && n <= 50) ? "The number is in the lower half." : (n > 51 && n <= 100) ? "The number is in the upper half." : "Invalid Number";
//         System.out.println(s);
//     }
// }