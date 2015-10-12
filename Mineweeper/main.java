import java.util.*;


public class Cell{

	public int val;
	public boolean isBomb;
	public int row, col;
	public boolean isexposed;
	public boolean isGussed;
	
	public boolean flip(){}
	
	public boolean toggleGuess(){}

}

public class Board{

	public int nRows;
	public int nCols;
	public int nBombs;
	public Cell[][] cells;
	public Cell[] Bombs;
	
	
	public void setRow(int val){}

	public void setCol(int val){}
	
	public void setBombs(Cell[] Bombs){}
	
	public void set_nums(){}	
	

}


public class Player{

	public String Name;
	
	public void set_Cell(){}

}


public class Game{

	public Player player;
	public Board board;
	
	public boolean Win(){}
	
	public void set_Cell(){}
	
	

}
