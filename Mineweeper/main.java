import java.util.*;


class Cell{

	public int val;
	public boolean isBomb = false;
	public int row, col;
	public boolean isexposed = false;
	public boolean isGussed = false;
	public boolean isEmpty = false;
	
	
	public boolean flip(int c , int r){
	
		if (isGussed == false){
			isGussed = true;
		}
	
		return true;
	}
	
	public boolean toggleGuess(){
	
		return true;
	
	}

}

class Board{

	public int nRows;
	public int nCols;
	public int nBombs;
	public Cell[][] cells;
	public Cell[] Bombs;
	public Cell[] Empty;
	
	
	public void setRow(int val){
	
		nRows = val;
	
	}

	public void setCol(int val){
	
		nCols = val;
	
	}
	
	
	public void SetCells(){
	
		for(int i=0 ; i < nRows ; i++){
			for (int j = 0 ;  j < nCols ; j++){
				Cell newCell = new Cell();
				newCell.col = j;
				newCell.row = i;
				cells[i][j] = newCell;
			}
		
		
		}
	
	}
	
	public void setBombs(){
		
		int i,j;
		for (Cell cell : Bombs){
			i = cell.row;
			j = cell.col;
			cells[i][j].isBomb = true;
		}
	
	}
	
	public void set_emps(){
		int i,j;
		for (Cell cell : Empty){
			i = cell.row;
			j = cell.col;
			cells[i][j].isEmpty = true;
		}
	
	}
	
	
	public void set_nums(){
		int numbombs = 0;
		for (int i=0 ; i < nRows ; i++){
			for(int j = 0 ;  j < nCols ; j++){
				numbombs = 0;
				if(cells[i][j].isBomb != true && cells[i][j].isEmpty != true){
				//i-1,j - i-1,j-1 - i-1,j+1 same for i , i+1 
					if(i == 0){
						if(j == 0){
						
						}
						else{
							if(j==nCols){}
							else{}
					
						}
				
					}
					if(i == nRows-1){
						if(j == 0){
						
						}
						else{
							if(j==nCols){}
							else{}
					
						}
					
					}
					cells[i][j].val = numbombs;
				}
			}
		
		}
	
	}	
	

}


class Player{

	public String Name;
	
	
	public void Set_name(){
		Scanner sc = new Scanner(System.in);
		Name = sc.next();
	
	}
	
	public int[] set_Cell(){
		int[] a = new int[2];
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the number of rows?");
		a[0] = sc.nextInt();
		System.out.println("What is the number of columns?");
		a[1] = sc.nextInt();
		return a;
	}

}


class Game{

	public Player player;
	public Board board;
	
	
	public boolean Win(){
	
		return true;
	}
	
	public void start(){
		int[] a = new int[2];
		a = player.set_Cell();
		board.nRows = a[0];
		board.nCols = a[1];
	
	}
	
	public void Play(){
	
	}
	
	

}



public class main{

	public static void main(String[] args){}

}
