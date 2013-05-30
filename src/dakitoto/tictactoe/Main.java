// main class
// tp

package dakitoto.tictactoe;

import dakitoto.tictactoe.board.board;
import dakitoto.tictactoe.control.multiplayer;
import dakitoto.tictactoe.control.singleplayer;
import dakitoto.tictactoe.control.player;

public class Main {
	public static void main(String[] args){
		board board= new board();
		player player= new multiplayer(board);
		player= new singleplayer(board);
		
	}
}
