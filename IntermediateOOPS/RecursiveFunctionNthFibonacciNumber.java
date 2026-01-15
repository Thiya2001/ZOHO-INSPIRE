public class RecursiveFunctionNthFibonacciNumber {
    public static void main(String[] args) {
        int n = 8;
        System.out.print(recursiveFibo(n));
    }
    public static int recursiveFibo(int n) {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        
        return recursiveFibo(n - 1) + recursiveFibo(n - 2);
    }
}
