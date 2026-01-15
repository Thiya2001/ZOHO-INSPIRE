public class FindMax {
    public static void main(String[] args) {
        int a[] = {82, 40, 56, 93, 77, 29};
        System.out.println(findMax(a));
    }
    
    public static int findMax(int arr[]) {
        int max = arr[0];

        for(int num : arr) {
            if(num > max) {
                max = num;
            }
        }
        return max;
    }
}
