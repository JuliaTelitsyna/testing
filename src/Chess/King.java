package Chess;

public class King extends ChessPiece {
    // String color;

    public King (String color) {
        super(color);
    }

    public String getColor() {
        return this.color;
    }

    String getSymbol() {
        return "K";
    }

    boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        boolean can = false;
        if (this.isEmpty(chessBoard,line,column,toLine,toColumn)) {

            if (((line >= 0) && (line <= 7)) && ((column >= 0) && (column <= 7)) && ((toLine >= 0) && (toLine <= 7)) && ((toColumn >= 0) && (toColumn <= 7))) {


                if
                (
                        ((Math.abs(line - toLine) == 1) || (Math.abs(column - toColumn) == 1))
                       // && (!(this.isUnderAttack(chessBoard,toLine,toColumn)))
                ){
                    can = true;
                }

            }
        }
        return can;
    }
    boolean isUnderAttack(ChessBoard board, int line, int column)
    {boolean attack = false;
        for (int i=0;i<8;i++)
        {
            for (int j=0;j<8;j++)
            { if (board.board[i][j]!=null)
            {
                if ((!board.board[i][j].getColor().equals(this.getColor()))) {
                    if (board.board[i][j].canMoveToPosition(board, i, j, line, column)) {
                        attack = true;
                    }
                }

            }
            }

        }
      return attack;
    }
    boolean isEmpty(ChessBoard chessBoard, int line, int column, int toLine, int toColumn)
    {
        boolean empty=true;
        if (chessBoard.board[toLine][toColumn]!=null) {
            if (this.getColor().equals(chessBoard.board[toLine][toColumn].getColor())) {
                empty = false;
            }
        }

        return empty;
    }

}