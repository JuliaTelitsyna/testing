package Chess;

import Chess.ChessBoard;

abstract public class ChessPiece {
    public String color;
    boolean check=true;
public ChessPiece (String color)
{this.color=color;}
    public String getColor()
    { return this.color;}

     abstract boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn);

    abstract String getSymbol();
    // какую фигуру я должна тут вернуть


}
