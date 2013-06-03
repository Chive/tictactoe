package dakitoto.tictactoe.control;

import dakitoto.tictactoe.board.board;
public class AI {

	private board board;
	private player player;
	
	public AI(board board, player player){
		this.board=board;
		this.player=player;
	}
	
	private boolean beginnHuman;
	
	public void nextTurn(){
		System.out.println("AI zug");
		
		
		//////////////////////////////////////////// First Move
		if(board.isBoardEmpty()){
			player.playerSetValueAt(6);
			beginnHuman=false;
			return;
		}
		
		if(     board.valueAt(0)==1^
				board.valueAt(1)==1^
				board.valueAt(2)==1^
				board.valueAt(3)==1^
				board.valueAt(4)==1^
				board.valueAt(5)==1^
				board.valueAt(6)==1^
				board.valueAt(7)==1^
				board.valueAt(8)==1){
			beginnHuman=true;
		}
		
		
		System.out.println("Spieler beginn "+ beginnHuman);
		//////////////////////////////////////////// Possible Win check
		int i=0;
		if((i=possibleWin(6,7,8))!=-1){
			player.playerSetValueAt(i);
			return;
		}
		if((i=possibleWin(3,4,5))!=-1){
			player.playerSetValueAt(i);
			return;
		}
		if((i=possibleWin(0,1,2))!=-1){
			player.playerSetValueAt(i);
			return;
		}
		if((i=possibleWin(6,3,0))!=-1){
			player.playerSetValueAt(i);
			return;
		}
		if((i=possibleWin(7,4,1))!=-1){
			player.playerSetValueAt(i);
			return;
		}
		if((i=possibleWin(8,5,2))!=-1){
			player.playerSetValueAt(i);
			return;
		}
		if((i=possibleWin(6,4,2))!=-1){
			player.playerSetValueAt(i);
			return;
		}
		if((i=possibleWin(0,4,8))!=-1){
			player.playerSetValueAt(i);
			return;
		}
		
		
		//////////////////////////////////Possible Deny check
		
		i=0;
		if((i=possibleDeny(6,7,8))!=-1){
			player.playerSetValueAt(i);
			return;
		}
		if((i=possibleDeny(3,4,5))!=-1){
			player.playerSetValueAt(i);
			return;
		}
		if((i=possibleDeny(0,1,2))!=-1){
			player.playerSetValueAt(i);
			return;
		}
		if((i=possibleDeny(6,3,0))!=-1){
			player.playerSetValueAt(i);
			return;
		}
		if((i=possibleDeny(7,4,1))!=-1){
			player.playerSetValueAt(i);
			return;
		}
		if((i=possibleDeny(8,5,2))!=-1){
			player.playerSetValueAt(i);
			return;
		}
		if((i=possibleDeny(6,4,2))!=-1){
			player.playerSetValueAt(i);
			return;
		}
		if((i=possibleDeny(0,4,8))!=-1){
			player.playerSetValueAt(i);
			return;
		}
		
		///////////////////////////////AI Secondary Move
		
		
		if(beginnHuman){
			if(board.valueAt(4)==1 && board.valueAt(6)==0){
				player.playerSetValueAt(6);
				return;
			}else{
				if(board.valueAt(4)==0){
					player.playerSetValueAt(4);
					return;
				}
			}
		
			if(board.valueAt(4)==2){
				if(board.valueAt(0)==1 && board.valueAt(8)==1){
					if(board.valueAt(1)==0){
						player.playerSetValueAt(1);
						return;
					}
					if(board.valueAt(3)==0){
						player.playerSetValueAt(3);
						return;
					}
				}
				if(board.valueAt(2)==1 && board.valueAt(6)==1){
					if(board.valueAt(1)==0){
						player.playerSetValueAt(1);
						return;
					}
					if(board.valueAt(3)==0){
						player.playerSetValueAt(3);
						return;
					}
				}
			}
			
			if(board.valueAt(4)==1 && board.valueAt(2)==0){
				player.playerSetValueAt(2);
				return;
			}
		}
				
		if((board.valueAt(7)==0 && board.valueAt(8)==0)){
			player.playerSetValueAt(8);
			return;
		}
		
		if((board.valueAt(3)==0 && board.valueAt(0)==0)){
			player.playerSetValueAt(0);
			return;
		}
		
		if(board.valueAt(8)==1 && board.valueAt(3)==1 && board.valueAt(2)==0){
			player.playerSetValueAt(2);
			return;
		}
		
		if(board.valueAt(0)==1 && board.valueAt(7)==1 && board.valueAt(2)==0){
			player.playerSetValueAt(2);
			return;
		}
		
		
		if((board.valueAt(4)==0)){
			player.playerSetValueAt(4);
			return;
		}
		
		if((board.valueAt(0)==0)){
			player.playerSetValueAt(0);
			return;
		}
		if((board.valueAt(2)==0)){
			player.playerSetValueAt(2);
			return;
		}
		if((board.valueAt(8)==0)){
			player.playerSetValueAt(8);
			return;
		}
		
		if((board.valueAt(6)==0)){
			player.playerSetValueAt(6);
			return;
		}
		
		if((board.valueAt(7)==0)){
			player.playerSetValueAt(7);
			return;
		}
		if((board.valueAt(3)==0)){
			player.playerSetValueAt(3);
			return;
		}
		if((board.valueAt(5)==0)){
			player.playerSetValueAt(5);
			return;
		}
		if((board.valueAt(1)==0)){
			player.playerSetValueAt(1);
			return;
		}
		
		
		
	}
	
	
	public int possibleWin(int p1, int p2, int p3){
		
		if((board.valueAt(p1)==2) && (board.valueAt(p2)==2) && (board.valueAt(p3)==0)){return p3;}
		
		if((board.valueAt(p1)==2) && (board.valueAt(p3)==2) && (board.valueAt(p2)==0)){return p2;}
		
		if((board.valueAt(p3)==2) && (board.valueAt(p2)==2) && (board.valueAt(p1)==0)){return p1;}
		
		
		return -1;
	}
	
	
	public int possibleDeny(int p1, int p2, int p3){
		
		if((board.valueAt(p1)==1) && (board.valueAt(p2)==1) && (board.valueAt(p3)==0)){return p3;}
		
		if((board.valueAt(p1)==1) && (board.valueAt(p3)==1) && (board.valueAt(p2)==0)){return p2;}
		
		if((board.valueAt(p3)==1) && (board.valueAt(p2)==1) && (board.valueAt(p1)==0)){return p1;}
		
		
		return -1;
	}
	
}

/*

6 7 8
3 4 5
0 1 2

*/
