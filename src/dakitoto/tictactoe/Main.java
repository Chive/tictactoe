// main class
// tp

package dakitoto.tictactoe;

import dakitoto.tictactoe.board.board;
import dakitoto.tictactoe.control.player;
import dakitoto.tictactoe.gui.gui;

public class Main {
	
	private board board;
	private player player;
	private gui gui;
	
	public Main(){
		board= new board();
		player= new player(board,false);
		
		gui= new gui(player);
		
		
		int winningPlayer=0;
		
		while (true){
			
			winningPlayer=player.nextTurn();
			
			if(winningPlayer!=0 && !player.isGameFinisched()){
				if(winningPlayer!=3){
					if(winningPlayer==2 && !player.isMultiplayer()){
						System.out.println("Sieg von Computer-Spieler");
					}else{
						System.out.println("Sieg von Spieler "+ winningPlayer);
					}
				}else{
					System.out.println("Unentschieden");
				}
				player.setGameFinisched(true);
			}
			
			
		}
		
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args){
		new Main();
	}
}
