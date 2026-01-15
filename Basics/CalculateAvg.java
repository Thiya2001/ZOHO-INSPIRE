import java.util.Scanner;
public class CalculateAvg {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count of number : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++) {
            System.out.print("Enter the number : ");
            sum += sc.nextInt();
        }
        System.out.print("Average is : " + sum / n);
    }
}


// import java.util.Scanner;
// public class CalculateAvg {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int n = sc.nextInt();
//         int i = 0;
//         double sum = 0;
//         while(i < n) {
//             System.out.print("Enter the sum of number : ");
//             sum += sc.nextDouble();
//             i++;
//         }
//         System.out.println("Average : " + sum / n);
//     }
// }