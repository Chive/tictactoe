// main class
// tp

package dakitoto.tictactoe;

import dakitoto.tictactoe.board.board;
import dakitoto.tictactoe.control.multiplayer;

public class Main {
	public static void main(String[] args){
		board board= new board();
		multiplayer player= new multiplayer(board);
		
	}
}
