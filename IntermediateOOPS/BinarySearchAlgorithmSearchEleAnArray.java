import java.util.Scanner;
public class BinarySearchAlgorithmSearchEleAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {2, 4, 6, 8, 10, 12, 14};

        System.out.print("Enter The Element to Search : ");
        int es = sc.nextInt();
        int index = binarySearch(a, es);

        if (index != -1)
            System.out.println("Element found at index : " + index);
        else
            System.out.println("Element Not Found.");

        sc.close();
    }

    public static int binarySearch(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;

        while(low <= high) {
            int mid = (low + high) / 2;

            if(a[mid] == key)
                return mid; 

            else if (key < a[mid])
                high = mid - 1; 

            else
                low = mid + 1;
        }
        return -1;
    }
}
