import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char board[][] = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
        };

        char currentPlayer = 'X';
        boolean gameOver = false;
        int moves = 0;

        while(!gameOver) {
            //Board print
            System.out.println("Current Board : ");
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }

            //Input
            System.out.println("Player " + currentPlayer + " enter row and column (0 - 2) : ");
            System.out.print("Enter Row : ");
            int row = sc.nextInt();
            System.out.print("Enter Column : ");
            int column = sc.nextInt();

            //Check Valid Move
            if(row < 0 || row > 2 || column < 0 || column > 2 || board[row][column] != '-') {
                System.out.println("Invalid Move Please Try Again");
                continue;
            }

            //Move place
            board[row][column] = currentPlayer;
            moves++;

            //Win Check
            if(checkWin(board, currentPlayer)) {
                System.out.println("Player " + currentPlayer + " Wins.");
                gameOver = true;
            }

            //Draw Check
            else if(moves == 9) {
                System.out.println("Game Draw.");
                gameOver = true;
            }
            else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }
        sc.close();
    }
    public static boolean checkWin(char[][] board, char p) {
        
        // Rows and Columns
        for(int i = 0; i < 3; i++) {
            if((board[i][0] == p && board[i][1] == p && board[i][2] == p || board[0][i] == p && board[1][i] == p && board[2][i] == p)) {
                return true;
            }
        }
        //Diagonals 
        if((board[0][0] == p && board[1][1] == p && board[2][2] == p || board[0][2] == p && board[1][1] == p && board[2][0] == p)) {
            return true;
        }
        return false;
    }
}
