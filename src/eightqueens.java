
public class eightqueens {
    public static final int n=8;

public static boolean solve(int[][] board){
    boolean result = solve(board,  0);
    return result;
}

public static boolean solve(int[][] board, int col) {

    if (col == n) {
        return true;
    }
    for (int i = 0 ; i < n; i++) {
        if (check(board, i, col)) {
            board[i][col] = 1;
            if (solve(board, col+1))
                return true;
            board[i][col] = 0;
            }
        }
    return false;
    }


public static boolean check(int[][] board, int row, int col) {
    /* Check this row on left side */
    for (int i = 0; i < col; i++)
        if (board[row][i] == 1)
            return false;

    /* Check upper diagonal on left side */
    for (int i=row, j=col; i>=0 && j>=0; i--, j--)
        if (board[i][j] == 1)
            return false;

    /* Check lower diagonal on left side */
    for (int i=row, j=col; j>=0 && i<board[0].length; i++, j--)
        if (board[i][j] == 1)
            return false;

    return true;
}


public static void main(String [] args){

    int[][] board = {
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0}};


    System.out.print(solve(board));
    System.out.println("");


 for (int i = 0; i < board[0].length; i++) {
       for (int j = 0; j < board[0].length; j++) {
          System.out.print("[" + board[i][j]+"]");
        }
        System.out.println("");
    }
   // System.out.println(board[6][5]);

}

}
