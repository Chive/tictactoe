package dakitoto.tictactoe.control;

import dakitoto.tictactoe.board.board;
import dakitoto.tictactoe.gui.gui;

public class player {
	
	private int playerAtTurn=2;
	private board board;
	private boolean multiplayer;
	private gui gui;
	private AI ai;
	private boolean GameFinisched;
	
	public player(board board,boolean multiplayer){
		this.board=board;
		ai = new AI(board, this);
		this.setMultiplayer(multiplayer);
	}
	
	
	public void playerSetValueAt(int position){
		if(!this.isGameFinisched()){
			if(board.isFieldEmpty(position)){
				this.board.setValueAt(this.getPlayerAtTurn(), position);
				gui.Update();
				switchPlayerAtTurn();
			}
		}else{
			//System.out.println("game not finisheds");
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
	
	public board getBoard(){
		return board;
	}

	public int nextTurn() {
		
		if(board.checkPlayerWin(1)){return 1;}
		if(board.checkPlayerWin(2)){return 2;}
		if(board.isBoardFull()){return 3;}
		
		if(!isMultiplayer()){
			if(this.getPlayerAtTurn()==2){
				ai.nextTurn();
			}
		}
		
		return 0;
		
	}

	public boolean isMultiplayer() {
		return multiplayer;
	}

	public void setMultiplayer(boolean multiplayer) {
		this.multiplayer = multiplayer;
	}

	public void setGUI(gui gui2) {
		this.gui=gui2;
		
	}


	public boolean isGameFinisched() {
		return GameFinisched;
	}


	public void setGameFinisched(boolean gameFinisched) {
		GameFinisched = gameFinisched;
	}
	
}
