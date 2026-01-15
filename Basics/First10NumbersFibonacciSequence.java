public class First10NumbersFibonacciSequence {
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1, c = 0;
        for(int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
