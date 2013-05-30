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
import javax.swing.AbstractAction;
import javax.swing.Action;

public class gui {

	private JFrame frmTicTacToe;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private final Action action_2 = new SwingAction_2();
	private final Action action_3 = new SwingAction_3();
	private final Action action_4 = new SwingAction_4();
	private final Action action_5 = new SwingAction_5();
	private final Action action_6 = new SwingAction_6();
	private final Action action_7 = new SwingAction_7();
	private final Action action_8 = new SwingAction_8();
	private final Action action_9 = new SwingAction_9();
	private final Action action_10 = new SwingAction_10();
	private final Action action_11 = new SwingAction_11();

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
		button.setAction(action);
		panel_3_1.add(button);
		
		JButton button_1 = new JButton("2");
		button_1.setAction(action_1);
		panel_3_1.add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.setAction(action_2);
		panel_3_1.add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.setAction(action_3);
		panel_3_1.add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.setAction(action_4);
		panel_3_1.add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.setAction(action_5);
		panel_3_1.add(button_5);
		
		JButton button_6 = new JButton("7");
		button_6.setAction(action_6);
		panel_3_1.add(button_6);
		
		JButton button_7 = new JButton("8");
		button_7.setAction(action_7);
		panel_3_1.add(button_7);
		
		JButton button_8 = new JButton("9");
		button_8.setAction(action_8);
		panel_3_1.add(button_8);
		
		JMenuBar menuBar = new JMenuBar();
		frmTicTacToe.setJMenuBar(menuBar);
		
		JMenu mnSpiel = new JMenu("Spiel");
		menuBar.add(mnSpiel);
		
		JMenu mnNeu = new JMenu("Neu");
		mnSpiel.add(mnNeu);
		
		JMenuItem mntmSpieler = new JMenuItem("1 Spieler");
		mntmSpieler.setAction(action_10);
		mnNeu.add(mntmSpieler);
		
		JMenuItem mntmSpieler_1 = new JMenuItem("2 Spieler");
		mntmSpieler_1.setAction(action_11);
		mnNeu.add(mntmSpieler_1);
		
		JMenuItem mntmBeenden = new JMenuItem("Beenden");
		mntmBeenden.setAction(action_9);
		mnSpiel.add(mntmBeenden);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "1");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			System.out.println("button 1 clicked");
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "2");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			System.out.println("button 2 clicked");
		}
	}
	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "3");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			System.out.println("button 3 clicked");
		}
	}
	private class SwingAction_3 extends AbstractAction {
		public SwingAction_3() {
			putValue(NAME, "4");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			System.out.println("button 4 clicked");
		}
	}
	private class SwingAction_4 extends AbstractAction {
		public SwingAction_4() {
			putValue(NAME, "5");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			System.out.println("button 5 clicked");
		}
	}
	private class SwingAction_5 extends AbstractAction {
		public SwingAction_5() {
			putValue(NAME, "6");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			System.out.println("button 6 clicked");
		}
	}
	private class SwingAction_6 extends AbstractAction {
		public SwingAction_6() {
			putValue(NAME, "7");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			System.out.println("button 7 clicked");
		}
	}
	private class SwingAction_7 extends AbstractAction {
		public SwingAction_7() {
			putValue(NAME, "8");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			System.out.println("button 8 clicked");
		}
	}
	private class SwingAction_8 extends AbstractAction {
		public SwingAction_8() {
			putValue(NAME, "9");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			System.out.println("button 9 clicked");
		}
	}
	private class SwingAction_9 extends AbstractAction {
		public SwingAction_9() {
			putValue(NAME, "Beenden");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
	private class SwingAction_10 extends AbstractAction {
		public SwingAction_10() {
			putValue(NAME, "1 Spieler");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_11 extends AbstractAction {
		public SwingAction_11() {
			putValue(NAME, "2 Spieler");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
