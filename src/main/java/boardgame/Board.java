package boardgame;

public class Board {//tabuleiro 
	
	private int rows;
	private int columns;//conjunto..
	private Piece[][] pieces;//matriz de pe�as
	
	
	public Board(int rows, int columns) {
		if (rows <1 || columns <1) {//exce��o
			throw new BoardException("Error creating board: tem que ter uma linha e coluna");
		}
		this.rows = rows;
		this.columns = columns;
		pieces= new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}
	
	public Piece piece(int row, int column) {
		if(!positionExists(row,column)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[row][column];
	}
	public Piece piece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	public void placePiece(Piece piece, Position position) {//vai em pe�as na linha e coluna atribui dentro o argumento
		if(thereIsAPiece(position)) {
			throw new BoardException("There is already a piece on position"+position);
		}
		pieces[position.getRow()][position.getColumn()]=piece; 
		piece.position=position;
	}
	private boolean positionExists(int row, int column) {
		return row>=0 && row< rows && column >=0 &&column< columns;
	}
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(),position.getColumn());
	}
	
	public boolean thereIsAPiece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return piece(position)!=null;
	}

}
