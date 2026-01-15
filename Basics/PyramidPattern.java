public class PyramidPattern {
    public static void main(String[] args) {
        int n = 9;
        for(int i = 0; i < n; i++) {
            int num = 1;
            for(int j = 0; j < n; j++) {
                if(i >= j && i + j >= n - 1) {
                    System.out.print(num + " ");
                    if(j < n / 2) {
                        num++;
                    }
                    else {
                        num--;
                    }
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
