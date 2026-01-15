public class FindSecondLargestElementInArray {
    public static void main(String[] args) {
        int a[] = {30, 54, 92, 78, 44, 81};
        int fl = 0, sl = 0;

        System.out.print("Second Largest Elements Integer On Array : ");

        for(int i = 0; i < a.length; i++) {
            if(a[i] > fl) {
                sl = fl;
                fl = a[i];
            }
            else if(a[i] > sl) {
                sl = a[i];
            }
        }
        System.out.print(sl);
    }
}
