public class LargestSmallest {
    public static void main(String[] args) {
        int[] a = {34, 56, 32, 76, 11};
        int b = a[0];
        int c = a[0];
        for(int i = 0; i < a.length; i++) {
            if(a[i] > b) {
                b = a[i];
            }
            else if(a[i] < c) {
                c = a[i];
            }
        }
        System.out.println("Largest Number is : " + b);
        System.out.println("Smallest Number is : " + c);
    }
}
