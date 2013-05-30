// created with window builder: http://download.eclipse.org/windowbuilder/WB/integration/4.2/

package dakitoto.tictactoe.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class gui {

	private JFrame frmTicTacToe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui window = new gui();
					window.frmTicTacToe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTicTacToe = new JFrame();
		frmTicTacToe.setTitle("Tic Tac Toe");
		frmTicTacToe.setBounds(100, 100, 450, 300);
		frmTicTacToe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTicTacToe.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		frmTicTacToe.getContentPane().add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3_1 = new JPanel();
		panel_3.add(panel_3_1);
		panel_3_1.setLayout(new GridLayout(3, 0, 0, 0));
		
		JButton button = new JButton("1");
		panel_3_1.add(button);
		
		JButton button_1 = new JButton("2");
		panel_3_1.add(button_1);
		
		JButton button_2 = new JButton("3");
		panel_3_1.add(button_2);
		
		JButton button_3 = new JButton("4");
		panel_3_1.add(button_3);
		
		JButton button_4 = new JButton("5");
		panel_3_1.add(button_4);
		
		JButton button_5 = new JButton("6");
		panel_3_1.add(button_5);
		
		JButton button_6 = new JButton("7");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3_1.add(button_6);
		
		JButton button_7 = new JButton("8");
		panel_3_1.add(button_7);
		
		JButton button_8 = new JButton("9");
		panel_3_1.add(button_8);
		
		JMenuBar menuBar = new JMenuBar();
		frmTicTacToe.setJMenuBar(menuBar);
		
		JMenu mnSpiel = new JMenu("Spiel");
		menuBar.add(mnSpiel);
		
		JMenu mnNeu = new JMenu("Neu");
		mnSpiel.add(mnNeu);
		
		JMenuItem mntmSpieler = new JMenuItem("1 Spieler");
		mnNeu.add(mntmSpieler);
		
		JMenuItem mntmSpieler_1 = new JMenuItem("2 Spieler");
		mnNeu.add(mntmSpieler_1);
		
		JMenuItem mntmBeenden = new JMenuItem("Beenden");
		mnSpiel.add(mntmBeenden);
	}

}
