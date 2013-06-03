// created with window builder: http://download.eclipse.org/windowbuilder/WB/integration/4.2/

package dakitoto.tictactoe.gui;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.AbstractAction;
import javax.swing.Action;

import dakitoto.tictactoe.Main;
import dakitoto.tictactoe.control.player;

public class gui extends JFrame{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final Action action_0 = new SwingAction_0();
	private final Action action_1 = new SwingAction_1();
	private final Action action_2 = new SwingAction_2();
	private final Action action_3 = new SwingAction_3();
	private final Action action_4 = new SwingAction_4();
	private final Action action_5 = new SwingAction_5();
	private final Action action_6 = new SwingAction_6();
	private final Action action_7 = new SwingAction_7();
	private final Action action_8 = new SwingAction_8();
	private final Action action_Quit = new SwingAction_Quit();
	private final Action action_OnePlayer = new SwingAction_OnePlayer();
	private final Action action_TwoPlayer = new SwingAction_TwoPlayer();
	

	JButton button_6 = new JButton("6");
	JButton button_7 = new JButton("7");
	JButton button_8 = new JButton("8");
	JButton button_3 = new JButton("3");
	JButton button_4 = new JButton("4");
	JButton button_5 = new JButton("5");
	JButton button_0 = new JButton("0");
	JButton button_1 = new JButton("1");
	JButton button_2 = new JButton("2");
	
	

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui window = new gui(new player(new board(), true),new Main());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	private player player;
	private Main main;
	
	public gui(player player, Main main) {
		this.player=player;
		player.setGUI(this);
		initialize();
		this.main= main;
	}
	
	
	


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//frmTicTacToe = new JFrame();
		setTitle("Tic Tac Toe");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		getContentPane().add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3_1 = new JPanel();
		panel_3.add(panel_3_1);
		panel_3_1.setLayout(new GridLayout(3, 0, 0, 0));
		
		JButton button_6 = new JButton("6");
		button_6.setAction(action_6);
		panel_3_1.add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.setAction(action_7);
		panel_3_1.add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.setAction(action_8);
		panel_3_1.add(button_8);
		
		JButton button_3 = new JButton("3");
		button_3.setAction(action_3);
		panel_3_1.add(button_3);
		
		JButton button_4 = new JButton("4");
		button_4.setAction(action_4);
		panel_3_1.add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.setAction(action_5);
		panel_3_1.add(button_5);
		
		JButton button_0 = new JButton("0");
		button_0.setAction(action_0);
		panel_3_1.add(button_0);
		
		JButton button_1 = new JButton("1");
		button_1.setAction(action_1);
		panel_3_1.add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.setAction(action_2);
		panel_3_1.add(button_2);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnSpiel = new JMenu("Spiel");
		menuBar.add(mnSpiel);
		
		JMenu mnNeu = new JMenu("Neu");
		mnSpiel.add(mnNeu);
		
		JMenuItem mntmSpieler = new JMenuItem("1 Spieler");
		mntmSpieler.setAction(action_OnePlayer);
		mnNeu.add(mntmSpieler);
		
		JMenuItem mntmSpieler_1 = new JMenuItem("2 Spieler");
		mntmSpieler_1.setAction(action_TwoPlayer);
		mnNeu.add(mntmSpieler_1);
		
		JMenuItem mntmBeenden = new JMenuItem("Beenden");
		mntmBeenden.setAction(action_Quit);
		mnSpiel.add(mntmBeenden);
		
		setVisible(true);
	}
	
	
	
	public void Update(){
	
		System.out.println("Update-----------------------------------------");
	
		if(player.getBoard().valueAt(0)!=0){
			if(player.getBoard().valueAt(0)==1){
				((SwingAction_0) action_0).setNewText("X");
			}else{
				((SwingAction_0) action_0).setNewText("O");
			}
		}
		if(player.getBoard().valueAt(1)!=0){
			if(player.getBoard().valueAt(1)==1){
				((SwingAction_1) action_1).setNewText("X");
			}else{
				((SwingAction_1) action_1).setNewText("O");
			}
		}
		if(player.getBoard().valueAt(2)!=0){
			if(player.getBoard().valueAt(2)==1){
				((SwingAction_2) action_2).setNewText("X");
			}else{
				((SwingAction_2) action_2).setNewText("O");
			}
		}
		if(player.getBoard().valueAt(3)!=0){
			if(player.getBoard().valueAt(3)==1){
				((SwingAction_3) action_3).setNewText("X");
			}else{
				((SwingAction_3) action_3).setNewText("O");
			}
		}
		if(player.getBoard().valueAt(4)!=0){
			if(player.getBoard().valueAt(4)==1){
				((SwingAction_4) action_4).setNewText("X");
			}else{
				((SwingAction_4) action_4).setNewText("O");
			}
		}
		if(player.getBoard().valueAt(5)!=0){
			if(player.getBoard().valueAt(5)==1){
				((SwingAction_5) action_5).setNewText("X");
			}else{
				((SwingAction_5) action_5).setNewText("O");
			}
		}
		if(player.getBoard().valueAt(6)!=0){
			if(player.getBoard().valueAt(6)==1){
				((SwingAction_6) action_6).setNewText("X");
			}else{
				((SwingAction_6) action_6).setNewText("O");
			}
		}
		if(player.getBoard().valueAt(7)!=0){
			if(player.getBoard().valueAt(7)==1){
				((SwingAction_7) action_7).setNewText("X");
			}else{
				((SwingAction_7) action_7).setNewText("O");
			}
		}
		if(player.getBoard().valueAt(8)!=0){
			if(player.getBoard().valueAt(8)==1){
				((SwingAction_8) action_8).setNewText("X");
			}else{
				((SwingAction_8) action_8).setNewText("O");
			}
		}
	}

	
	public void UpdateClear(){
		((SwingAction_0) action_0).setNewText("");
		((SwingAction_1) action_1).setNewText("");
		((SwingAction_2) action_2).setNewText("");
		((SwingAction_3) action_3).setNewText("");
		((SwingAction_4) action_4).setNewText("");
		((SwingAction_5) action_5).setNewText("");
		((SwingAction_6) action_6).setNewText("");
		((SwingAction_7) action_7).setNewText("");
		((SwingAction_8) action_8).setNewText("");
	}
	
	
	
	private class SwingAction_6 extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public SwingAction_6() {
			//putValue(NAME, "6");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		
		public void setNewText(String text){
			putValue(NAME, text);
		}
		
		public void actionPerformed(ActionEvent e) {
			System.out.println("button 6 clicked");
			player.playerSetValueAt(6);
			//Update();
		}
	}
	private class SwingAction_7 extends AbstractAction {
		public void setNewText(String text){
			putValue(NAME, text);
		}
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public SwingAction_7() {
			////putValue(NAME, "7");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			System.out.println("button 7 clicked");
			player.playerSetValueAt(7);
			//Update();
		}
	}
	private class SwingAction_8 extends AbstractAction {
		public void setNewText(String text){
			putValue(NAME, text);
		}
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public SwingAction_8() {
			//putValue(NAME, "8");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			System.out.println("button 8 clicked");
			player.playerSetValueAt(8);
			//Update();
		}
	}
	private class SwingAction_3 extends AbstractAction {
		public void setNewText(String text){
			putValue(NAME, text);
		}
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public SwingAction_3() {
			//putValue(NAME, "3");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			System.out.println("button 3 clicked");
			player.playerSetValueAt(3);
			//Update();
		}
	}
	private class SwingAction_4 extends AbstractAction {
		public void setNewText(String text){
			putValue(NAME, text);
		}
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public SwingAction_4() {
			//putValue(NAME, "4");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			System.out.println("button 4 clicked");
			player.playerSetValueAt(4);
			//Update();
		}
	}
	private class SwingAction_5 extends AbstractAction {
		public void setNewText(String text){
			putValue(NAME, text);
		}
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public SwingAction_5() {
			//putValue(NAME, "5");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			System.out.println("button 5 clicked");
			player.playerSetValueAt(5);
			//Update();
		}
	}
	private class SwingAction_0 extends AbstractAction {
		public void setNewText(String text){
			putValue(NAME, text);
		}
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public SwingAction_0() {
			//putValue(NAME, "0");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			System.out.println("button 0 clicked");
			player.playerSetValueAt(0);
			//Update();
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public void setNewText(String text){
			putValue(NAME, text);
		}
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public SwingAction_1() {
			//putValue(NAME, "1");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			System.out.println("button 1 clicked");
			player.playerSetValueAt(1);
			//Update();
		}
	}
	private class SwingAction_2 extends AbstractAction {
		public void setNewText(String text){
			putValue(NAME, text);
		}
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public SwingAction_2() {
			//putValue(NAME, "2");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			System.out.println("button 2 clicked");
			player.playerSetValueAt(2);
			//Update();
		}
	}
	private class SwingAction_Quit extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public SwingAction_Quit() {
			putValue(NAME, "Beenden");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
	private class SwingAction_OnePlayer extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public SwingAction_OnePlayer() {
			putValue(NAME, "1 Spieler");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			player.getBoard().clearBoard();
			UpdateClear();
			if(player.getPlayerAtTurn()==1){
				player.setPlayerAtTurn(1);
			}else{
				player.setPlayerAtTurn(2);
			}
			player.setMultiplayer(false);
			player.setGameFinisched(false);
		}
	}
	private class SwingAction_TwoPlayer extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public SwingAction_TwoPlayer() {
			putValue(NAME, "2 Spieler");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			player.getBoard().clearBoard();
			UpdateClear();
			if(player.getPlayerAtTurn()==1){
				player.setPlayerAtTurn(1);
			}else{
				player.setPlayerAtTurn(2);
			}
			player.setMultiplayer(true);
			player.setGameFinisched(false);
			
		}
	}
}
