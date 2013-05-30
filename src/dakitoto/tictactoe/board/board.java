package dakitoto.tictactoe.board;

public class board {
	
	private int[] board= new int[9];
	
	
	public board(){
		board= new int[9];
		clearBoard();
	}
	
	public int valueAt(int pos){
		return board[pos];
	}
	
	public void setValueAt(int player, int pos){
		board[pos]=player;
	}
	
	public boolean isFieldEmpty(int pos){
		if(board[pos]==0){
			return true;
		}
		return false;
		
	}
	
	public void clearBoard(){
		for(int i=0; i<9;i++){
			board[i]=0;
		}
	}
	
	public boolean isBoardEmpty(){
		
		if( board[0]==0 && 
			board[1]==0 &&
			board[2]==0 &&
			board[3]==0 &&
			board[4]==0 &&
			board[5]==0 &&
			board[6]==0 &&
			board[7]==0 &&
			board[8]==0 ){
			return true;
		}
		return false;
	}
	
	
	public boolean checkPlayerWin(int player){ // 1= erster Spieler  2= 2. oder ComputerSpieler
		
		if(board[6]==player && board[7]==player && board[8]==player){return true;}
		if(board[3]==player && board[4]==player && board[5]==player){return true;}
		if(board[0]==player && board[1]==player && board[2]==player){return true;}
		
		if(board[6]==player && board[3]==player && board[0]==player){return true;}
		if(board[7]==player && board[4]==player && board[1]==player){return true;}
		if(board[8]==player && board[5]==player && board[2]==player){return true;}
		
		if(board[6]==player && board[4]==player && board[2]==player){return true;}
		if(board[0]==player && board[4]==player && board[8]==player){return true;}
		
		return false;
	}
	
	
}

/*

6 7 8
3 4 5
0 1 2

*/