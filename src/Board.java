import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.Timer;

public class Board extends JPanel implements ActionListener {

	private Timer timer;
	private Player player;

	public Board() {

		addKeyListener(new TAdapter());
		setFocusable(true);
		setBackground(Color.blue);
		setDoubleBuffered(true);

		player = new Player();

		timer = new Timer(5, this);
		timer.start();
	}
	
	public void paint(Graphics g) {
		super.paint(g);

		
		
		Graphics2D graphics = (Graphics2D) g;
		graphics.drawImage(player.getImage(), player.getX(), player.getY(),	this);
		
		ArrayList b = player.getBullets();
		
		for (int i = 0; i < b.size(); i++){
			bullet bt = (bullet) b.get(i);
			graphics.drawImage(bt.getImage(), bt.getX(),bt.getY(), this);
		}

		Toolkit.getDefaultToolkit().sync();
		g.dispose();

	}

	public void actionPerformed(ActionEvent e) {
		ArrayList b = player.getBullets();
		
		for (int i = 0; i < b.size(); i++){
			bullet bt = (bullet) b.get(i);
			if (bt.isVisible())
				bt.move();
			else b.remove(i);
		
		}
		
		
		player.move();
		repaint();
	}

	private class TAdapter extends KeyAdapter {
		public void keyReleased(KeyEvent e) {
			player.keyReleased(e);
		}

		public void keyPressed(KeyEvent e) {
			player.keyPressed(e);
		}

	}
}
