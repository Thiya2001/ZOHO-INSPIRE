public class FindTheSumOfTwoMatricesOfSameSize {
    public static void main(String[] args) {
        int m1[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int m2[][] = {
            {7, 8, 9},
            {1, 2, 3},
            {4, 5, 6}
        };

        int m3[][] = new int[3][3];

        for(int i = 0; i < m1.length; i++) {
            for(int j = 0; j < m2[i].length; j++) {
                m3[i][j] = m1[i][j] + m2[i][j];
            }
        }
        System.out.println("Sum Of Matrices Of Same Size : ");

        for(int i = 0; i < m3.length; i++) {
            for(int j = 0; j < m3[i].length; j++) {
                System.out.print(m3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
