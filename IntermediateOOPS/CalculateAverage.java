public class CalculateAverage {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        System.out.println(calculateAvg(a));
    }
    public static int calculateAvg(int arr[]) {
        int sum = 0;
        for(int res : arr)
            sum += res;

        return sum / arr.length;
    } 
}
