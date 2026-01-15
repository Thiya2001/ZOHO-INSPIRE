public class AverageAllElementUsingDouble {
    public static void main(String[] args) {
        int a[] = {43, 90, 26, 71, 16};

        double sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("Average Of All The Element is : " + sum / a.length);
    }
}