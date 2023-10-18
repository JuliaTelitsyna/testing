package Chess;

public class Pawn extends ChessPiece {
    // String color;

    public Pawn (String color) {
        super(color);
    }

    public String getColor() {
        return this.color;
    }

    String getSymbol() {
        return "P";
    }

    boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        boolean can = false;

       if (this.isEmpty(chessBoard,line,column,toLine,toColumn))
        {
            if (((line >= 0) && (line <= 7)) && ((column >= 0) && (column <= 7)) && ((toLine >= 0) && (toLine <= 7)) && ((toColumn >= 0) && (toColumn <= 7))) {

                if (this.check = true) {
                    if (((toLine - line) == 2) && ((column - toColumn) == 0)) {
                        can = true;
                    }
                }
                if (((toLine - line) == 1) && ((column - toColumn) == 0)) {
                    can = true;
                }


            }
        }

        return can;
        }

    boolean isEmpty(ChessBoard chessBoard, int line, int column, int toLine, int toColumn)
    {
        boolean empty=true;
        if (this.getColor().equals(chessBoard.board[toLine][toColumn]))
        {empty=false;}
        return empty;
    }
    }





