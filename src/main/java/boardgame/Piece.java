package boardgame;

public abstract class Piece {//peça
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position= null;
	}

	protected Board getBoard() {//n usa o set pra ninguem alterar 
		return board;//protected pq é uso interno da camada tabuleiro
	}
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	public boolean isThereAnyPossibleMove(){//varere na matriz uma acao verdadeira
		boolean[][]mat=possibleMoves();
		for (int i=0; i<mat.length;i++) {
			for(int j=0;j<mat.length;j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}	

}
