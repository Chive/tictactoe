package dakitoto.tictactoe.control;

public class singleplayer extends player{


	private AI ai;
	
	public singleplayer(dakitoto.tictactoe.board.board board) {
		super(board, true); //true for multiplayerstatus
		ai = new AI(board, this);
	}
	
	
	public int nextTurn(){ // returns the Winning Player or 0
		if(this.getPlayerAtTurn()==2){
			ai.nextTurn();
		}
		return super.nextTurn();
	}
	
	
}
