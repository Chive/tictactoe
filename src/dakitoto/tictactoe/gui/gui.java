package dakitoto.tictactoe.gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class gui extends JFrame {
		
	public gui(){
		setTitle("My Empty Frame");
		setSize(300,200); // default size is 0,0
		setLocation(10,200); // default is 0,0 (top left corner)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Window Listeners
		addWindowListener(new WindowAdapter() {
		  public void windowClosing(WindowEvent e) {
			System.exit(0);
		  } //windowClosing
		}); //addWindowLister
	
		// Add Panels
		Container contentPane = getContentPane();
		
		JButton button = new JButton("test");
        //Add action listener to button
        button.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed
                System.out.println("You clicked the button");
            }
        }); 
 
        getContentPane().add(button);
        pack();
        setVisible(true);
		
	}
	
	public static void main(String[] args) {
	    JFrame f = new gui();
	    f.show();
	  }
}
