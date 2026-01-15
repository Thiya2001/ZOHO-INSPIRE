import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int n = sc.nextInt();
        int a = 0, b = 1, c = 0;
        for(int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}

// import java.util.Scanner;
// public class FibonacciSeries {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter The Number : ");
//         int n = sc.nextInt();
//         int a = 0, b = 1, c = 0;
//         while(n > 0){
//             System.out.print(a + " ");
//             c = a + b;
//             a = b;
//             b = c;
//             n--;
//         }
//     }
// }

