public class RotateTheElementsAnArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int rotate = 2;

        for(int i = 0; i < rotate; i++) {
            int f = a[0];
            for(int j = 1; j < a.length; j++) {
                a[j - 1] = a[j];
            }
            a[a.length - 1] = f;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
