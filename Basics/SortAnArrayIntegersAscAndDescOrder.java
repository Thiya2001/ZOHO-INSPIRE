public class SortAnArrayIntegersAscAndDescOrder {
    public static void main(String[] args) {
        int a[] = {51, 52, 53, 54, 55, 56};

        System.out.print("Ascending Order : ");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
        System.out.print("Descending Order : ");
        for(int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}
