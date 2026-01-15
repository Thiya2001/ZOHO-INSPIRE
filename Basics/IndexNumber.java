import java.util.Scanner;
public class IndexNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {10, 22, 33, 25, 32, 54, 64, 1};
        System.out.print("Enter the index number : ");
        int index = sc.nextInt();
        int result = -1;
        for(int i = 0; i < a.length; i++) {
            if(a[i] == index) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}


// import java.util.Scanner;
// public class IndexNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] a = {1, 5, 3, 7};
//         System.out.print("Enter the index number : ");
//         int index = sc.nextInt();
//         System.out.println("Element at index " + index + " is: " + a[index]);
//     }
// }

