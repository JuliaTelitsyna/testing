abstract public class ChessPiece {
    String color;
    boolean chek=true;
public ChessPiece (String color)
{}
    public String getColor()
    { return this.color;}
// этот метод почему-то должен быть абстрактным
    abstract boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn);

    abstract String getSymbol();
    // какую фигуру я должна тут вернуть


}
