public class RecursionUsingFibonacciSequence {
    public static void main(String[] args) {
        int n = 9;
        for(int i = 0; i <= n; i++)
            System.out.print(recursionFibo(i) + " ");
    }
    public static int recursionFibo(int n) {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;

        return recursionFibo(n - 1) + recursionFibo(n - 2);
    }
}