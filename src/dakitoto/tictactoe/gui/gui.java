// created with window builder: http://download.eclipse.org/windowbuilder/WB/integration/4.2/

package dakitoto.tictactoe.gui;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import dakitoto.tictactoe.control.player;
import java.awt.Font;

public class gui extends JFrame{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*private final Action action_0 = new SwingAction_0();
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
	private final Action action_TwoPlayer = new SwingAction_TwoPlayer();*/
	

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
		//EventQueue.invokeLater(new Runnable() {
			
				try {
					gui window = new gui(new player(new board(), true),new Main());
				} catch (Exception e) {
					e.printStackTrace();
				}
			


	}*/

	/**
	 * Create the application.
	 */
	private player player;
	
	public gui(player player) {
		this.player=player;
		player.setGUI(this);
		initialize();
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
		
		button_6 = new JButton("6");
		button_6.setFont(new Font("Tahoma", Font.BOLD, 22));
		button_6.addActionListener(new SwingAction_6());
		panel_3_1.add(button_6);
		
		button_7 = new JButton("7");
		button_7.setFont(new Font("Tahoma", Font.BOLD, 22));
		button_7.addActionListener(new SwingAction_7());
		panel_3_1.add(button_7);
		
		button_8 = new JButton("8");
		button_8.setFont(new Font("Tahoma", Font.BOLD, 22));
		button_8.addActionListener(new SwingAction_8());
		panel_3_1.add(button_8);
		
		button_3 = new JButton("3");
		button_3.setFont(new Font("Tahoma", Font.BOLD, 22));
		button_3.addActionListener(new SwingAction_3());
		panel_3_1.add(button_3);
		
		button_4 = new JButton("4");
		button_4.setFont(new Font("Tahoma", Font.BOLD, 22));
		button_4.addActionListener(new SwingAction_4());
		panel_3_1.add(button_4);
		
		button_5 = new JButton("5");
		button_5.setFont(new Font("Tahoma", Font.BOLD, 22));
		button_5.addActionListener(new SwingAction_5());
		panel_3_1.add(button_5);
		
		button_0 = new JButton("0");
		button_0.setFont(new Font("Tahoma", Font.BOLD, 22));
		button_0.addActionListener(new SwingAction_0());
		panel_3_1.add(button_0);
		
		button_1 = new JButton("1");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		button_1.addActionListener(new SwingAction_1());
		panel_3_1.add(button_1);
		
		button_2 = new JButton("2");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		button_2.addActionListener(new SwingAction_2());
		panel_3_1.add(button_2);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnSpiel = new JMenu("Spiel");
		menuBar.add(mnSpiel);
		
		JMenu aboutmn = new JMenu("?");
		menuBar.add(aboutmn);
		
		JMenu mnNeu = new JMenu("Neu");
		mnSpiel.add(mnNeu);
		
		JMenuItem mntmSpieler = new JMenuItem("1 Spieler");
		mntmSpieler.addActionListener(new SwingAction_OnePlayer());
		mnNeu.add(mntmSpieler);
		
		JMenuItem mntmSpieler_1 = new JMenuItem("2 Spieler");
		mntmSpieler_1.addActionListener(new SwingAction_TwoPlayer());
		mnNeu.add(mntmSpieler_1);
		
		JMenuItem hilfemenu = new JMenuItem("Hilfe");
		aboutmn.add(hilfemenu);
		hilfemenu.addActionListener(new SwingAction_Help());
		
		JMenuItem mntmBeenden = new JMenuItem("Beenden");
		mntmBeenden.addActionListener(new SwingAction_Quit());
		mnSpiel.add(mntmBeenden);
		
		UpdateClear();
		
		setVisible(true);
	}

	
	
	public void Update(){
	
		System.out.println("Update-----------------------------------------");
	
		if(player.getBoard().valueAt(0)!=0){
			if(player.getBoard().valueAt(0)==1){
				
				button_0.setText("X");
				
			//	Icon icon=new ImageIcon("X.gif");
			//	button_0.setIcon(icon);
			//	button_0.setFocusPainted( false );
				
			//	System.out.println("Button image: "+button_0.getIcon());
			}else{
				button_0.setText("O");
			}
		}
		if(player.getBoard().valueAt(1)!=0){
			if(player.getBoard().valueAt(1)==1){
				button_1.setText("X");
			}else{
				button_1.setText("O");
			}
		}
		if(player.getBoard().valueAt(2)!=0){
			if(player.getBoard().valueAt(2)==1){
				button_2.setText("X");
			}else{
				button_2.setText("O");
			}
		}
		if(player.getBoard().valueAt(3)!=0){
			if(player.getBoard().valueAt(3)==1){
				button_3.setText("X");
			}else{
				button_3.setText("O");
			}
		}
		if(player.getBoard().valueAt(4)!=0){
			if(player.getBoard().valueAt(4)==1){
				button_4.setText("X");
			}else{
				button_4.setText("O");
			}
		}
		if(player.getBoard().valueAt(5)!=0){
			if(player.getBoard().valueAt(5)==1){
				button_5.setText("X");
			}else{
				button_5.setText("O");
			}
		}
		if(player.getBoard().valueAt(6)!=0){
			if(player.getBoard().valueAt(6)==1){
				button_6.setText("X");
			}else{
				button_6.setText("O");
			}
		}
		if(player.getBoard().valueAt(7)!=0){
			if(player.getBoard().valueAt(7)==1){
				button_7.setText("X");
			}else{
				button_7.setText("O");
			}
		}
		if(player.getBoard().valueAt(8)!=0){
			if(player.getBoard().valueAt(8)==1){
				button_8.setText("X");
			}else{
				button_8.setText("O");
			}
		}
	}
	
	public void showWinWindow(String text){
		JOptionPane.showMessageDialog(null,text);
		
		/*
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
	     int x = (d.width - getSize().width) / 2;
	     int y = (d.height - getSize().height) / 2;
	     PopupFactory factory = PopupFactory.getSharedInstance();
	     Popup popup = factory.getPopup(new JFrame(), new JLabel(text), x, y);
	     popup.show();*/
	}
	
	
	
	public void UpdateClear(){
		button_0.setText("");
		button_1.setText("");
		button_2.setText("");
		button_3.setText("");
		button_4.setText("");
		button_5.setText("");
		button_6.setText("");
		button_7.setText("");
		button_8.setText("");
	}
	
	
	
	public class SwingAction_6 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("button 6 clicked");
			player.playerSetValueAt(6);
			//Update();
		}
	}
	public class SwingAction_7 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("button 7 clicked");
			player.playerSetValueAt(7);
			//Update();
		}
	}
	public class SwingAction_8 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("button 8 clicked");
			player.playerSetValueAt(8);
			//Update();
		}
	}
	public class SwingAction_3 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("button 3 clicked");
			player.playerSetValueAt(3);
			//Update();
		}
	}
	public class SwingAction_4 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("button 4 clicked");
			player.playerSetValueAt(4);
			//Update();
		}
	}
	public class SwingAction_5 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("button 5 clicked");
			player.playerSetValueAt(5);
			//Update();
		}
	}
	public class SwingAction_0 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("button 0 clicked");
			player.playerSetValueAt(0);
			//Update();
		}
	}
	public class SwingAction_1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("button 1 clicked");
			player.playerSetValueAt(1);
			//Update();
		}
	}
	public class SwingAction_2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("button 2 clicked");
			player.playerSetValueAt(2);
			//Update();
		}
	}
	public class SwingAction_Quit implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
	public class SwingAction_OnePlayer implements ActionListener {
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
	public class SwingAction_TwoPlayer implements ActionListener {
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
	public class SwingAction_Help implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			showWinWindow("TicTacToe ist ein kleines Spiel zum Zeitvertreib. Man spielt es auf einem 3*3 Spielfeld.\n " +
					"Die zwei Spieler setzten nacheinander jeweils ein Zeichen auf eines der Felder. \n Auf einem Feld kann nur " +
					"ein Zeichen sein. Wer zuerst drei Zeichen in einer Reihe gesetzt hat gewinnt das Spiel. \n Wenn das Spielfeld voll ist " +
					"und keiner der" +
					" Spieler drei seiner Zeichen in einer Reihe hat so endet das Spiel unentschieden. ");
		}
	}
}
