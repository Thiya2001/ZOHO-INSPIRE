public class SumOfAllElements {
    public static void main(String[] args) {
        int a[] = {23, 54, 95, 12, 31};

        int sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}
