package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {
	
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	//somente o get para que não possamos alterar a cor da peca
	public Color getColor() {
		return color;
	}
	
	

}
