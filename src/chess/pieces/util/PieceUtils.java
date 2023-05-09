package chess.pieces.util;

public class PieceUtils {

    public static boolean isOnBoard(int x, int y) {
        return (x >= 0 && x <= 7 && y >= 0 && y <= 7);
    }

}
