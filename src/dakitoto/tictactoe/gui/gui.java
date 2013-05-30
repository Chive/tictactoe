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

public class gui {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui window = new gui();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		panel_1.add(panel);
		
		JLabel lblTicTacToe = new JLabel("Tic Tac Toe");
		panel.add(lblTicTacToe);
		
		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_2.getLayout();
		panel_1.add(panel_2);
		
		JLabel lblNeuesSpiel = new JLabel("Neues Spiel");
		panel_2.add(lblNeuesSpiel);
		
		JButton btnSpieler = new JButton("1 Spieler");
		panel_2.add(btnSpieler);
		
		JButton btnSpieler_1 = new JButton("2 Spieler");
		panel_2.add(btnSpieler_1);
		
		JPanel panel_3 = new JPanel();
		frame.getContentPane().add(panel_3, BorderLayout.CENTER);
		
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
		panel_3_1.add(button_6);
		
		JButton button_7 = new JButton("8");
		panel_3_1.add(button_7);
		
		JButton button_8 = new JButton("9");
		panel_3_1.add(button_8);
	}

}
