package boardgame;

public class Piece {//peça
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position= null;
	}

	protected Board getBoard() {//n usa o set pra ninguem alterar 
		return board;//protected pq é uso interno da camada tabuleiro
	}
	

	
	
	

}
