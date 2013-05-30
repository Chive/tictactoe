package dakitoto.tictactoe.control;

import dakitoto.tictactoe.board.board;

public class player {
	
	private int playerAtTurn=1;
	private board board;
	private boolean multiplayer;
	
	public player(board board,boolean multiplayer){
		this.board=board;
		this.multiplayer=multiplayer;
	}
	
	public void playerSetValueAt(int position){
		if(board.isFieldEmpty(position)){
			this.board.setValueAt(this.getPlayerAtTurn(), position);
			switchPlayerAtTurn();
		}
	}


	public int getPlayerAtTurn() {
		return playerAtTurn;
	}


	public void setPlayerAtTurn(int playerAtTurn) {
		this.playerAtTurn = playerAtTurn;
	}
	
	public void switchPlayerAtTurn() {
		if(this.playerAtTurn == 1){
			this.playerAtTurn = 2;
		}else{
			this.playerAtTurn = 1;
		}
			
	}

	public int nextTurn() {
		if(board.checkPlayerWin(1)){return 1;}
		if(board.checkPlayerWin(2)){return 2;}
		return 0;
		
	}
	
}
