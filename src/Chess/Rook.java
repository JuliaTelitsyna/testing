package Chess;

public class Rook extends ChessPiece {
    // String color;

    public Rook(String color) {
        super(color);
    }

    public String getColor() {
        return this.color;
    }

    String getSymbol() {
        return "R";
    }

    boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        boolean can = false;
        if (this.isEmpty(chessBoard,line,column,toLine,toColumn)) {

            if (((line >= 0) && (line <= 7)) && ((column >= 0) && (column <= 7)) && ((toLine >= 0) && (toLine <= 7)) && ((toColumn >= 0) && (toColumn <= 7))) {


                if ((((toLine - line) == 0) || ((column - toColumn) == 0)) && (((toLine - line) != 0) || ((column - toColumn) != 0))) {

                    if (this.isSvobodno( chessBoard,line,column,toLine,toColumn)) {
                        can = true;
                    }
                }


            }
        }
        return can;
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
    boolean isSvobodno (ChessBoard chessBoard, int line, int column, int toLine, int toColumn)
    { boolean svobodno=true;
        if ((toColumn-column)>=2)
        {
            for (int i=1;i<(toColumn-column);i++)
            {
                if (!(chessBoard.board[line][column+i]==null))
                {
                    svobodno=false;
                }
            }
        }
        if ((toColumn-column)<=-2)
        {
            for (int i=1;i<(column-toColumn);i++)
            {
                if (!(chessBoard.board[line][column-i]==null))
                {
                    svobodno=false;
                }
            }
        }
        if ((toLine-line)>=2)
        {
            for (int i=1;i<(toLine-line);i++)
            {
                if (!(chessBoard.board[line+i][column]==null))
                {
                    svobodno=false;
                }
            }
        }
        if ((toLine-line)<=-2)
        {
            for (int i=1;i<(-toLine+line);i++)
            {
                if (!(chessBoard.board[line-i][column]==null))
                {
                    svobodno=false;
                }
            }
        }
        return svobodno;
    }
}
