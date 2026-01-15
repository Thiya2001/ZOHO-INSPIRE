public class LargestElement {
    public static void main(String[] args) {
        int a[] = {32, 53, 34, 89, 76};

        int b = a[0];
        for(int i = 0; i < a.length; i++) {
            if(b < a[i]) {
                b = a[i];
            }
        }
        System.out.println(b);
    }
}
