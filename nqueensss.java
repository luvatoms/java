public class nqueensss {
    public static void nqueens(char board[][],int row){
       if(row==board.length){
          printboard(board);
          return;
       }
        for(int j=0;j<board.length;j++){
            if(is_safe(board,row,j)){
        board[row][j]='Q';
        nqueens(board,row+1);
        board[row][j]='x';
            }
       }
    }
    public static boolean is_safe(char board[][],int row,int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diagonal left
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diagonal right
         for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void printboard(char board[][]){
       System.out.println("--------chessboard--------");
        for(int i=0;i<board.length;i++){
        for(int j=0;j<board.length;j++){
           System.out.print(board[i][j]+" ");
   }
   System.out.println();
    }
    }
    public static void main (String args[]){
    int n=3;
    char board[][]=new char[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
           board[i][j]='x';
        }
    }
    nqueens(board,0);
}
}
