package dakitoto.tictactoe.board;

public class board {
	
	private int[] board= new int[9];
	
	
	public board(){
		board= new int[9];
	}
	
	public void setValueAt(int player, int pos){
		board[pos]=player;
	}
	
	public void clearBoard(){
		for(int i=0; i<9;i++){
			board[i]=0;
		}
	}
	
}
