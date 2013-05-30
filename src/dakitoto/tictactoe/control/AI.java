package dakitoto.tictactoe.control;

import dakitoto.tictactoe.board.board;
public class AI {

	private board board;
	private player player;
	
	public AI(board board, player player){
		this.board=board;
		this.player=player;
	}
	
	
	public void nextTurn(){
		if(board.isBoardEmpty()){
			player.playerSetValueAt(6);
		}
		
		
		
	}
}
