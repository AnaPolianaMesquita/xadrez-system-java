package boardgame;//jogo de tabuleiro

public class Position {//posi��o
	private int row;//linha
	private int column;//coluna
	
	public Position(int row, int column) {//construtor 
		this.row = row;
		this.column = column;
	}

	public int getRow() {//permite o acesso de row e column
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
	@Override
	public String toString() {
		return row+","+column;
	}
}
