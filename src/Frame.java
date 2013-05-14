import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Frame extends JFrame {

	public Frame() {
		add(new Board());
		setTitle("game");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1000, 600);
		setLocationRelativeTo(null);
		setVisible(true); 
		setResizable(false);
		}
//stephen has cancer
	// shrek has layers
	
	
	public static void main(String[] args) {
		new Frame();

	}

}
