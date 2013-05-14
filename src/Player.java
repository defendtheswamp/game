import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Timer;

import javax.swing.ImageIcon;


public class Player {

	private String player = "player.png";
	private Timer timer1;
	boolean isjumping = false;
	private int g = 4;
	private int dx;
	private int dy;
	private int x;
	private int y;
	private int width;
	private int height;
	private Image image;

	private ArrayList bullets;
	
	private final int size=40;
	
	public Player() {
		ImageIcon icon = new ImageIcon(this.getClass().getResource(player));
		image = icon.getImage();
		width = image.getWidth(null);
	    height = image.getHeight(null);
		bullets = new ArrayList();
		x = 0;
		y = 500;
	}

	public void move() {
		x += dx;
		y += dy;
	if ( y <500){
		y += g;
	
	}
	if (y<350) y = 350;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Image getImage() {
		return image;
	}

	public ArrayList getBullets(){
		return bullets;
	}
	
	public Rectangle getBounds() {
	    return new Rectangle(x, y, width, height);
	}
	

	public void keyPressed(KeyEvent e) {
		
		
		int key = e.getKeyCode();
		
			
				
		if (key == KeyEvent.VK_LEFT) {
			dx = -1;
		}

		if (key == KeyEvent.VK_RIGHT) {
			dx = 1;
		}

		if (key == KeyEvent.VK_UP) {
			dy += -8;
					
				
			
			}
		
		
		if (key == KeyEvent.VK_SPACE);{
	shoot(e);
		}
			}
	
 
	
	
	
	private void shoot(KeyEvent e){
		int key = e.getKeyCode();
			
			if (key == KeyEvent.VK_SPACE){
		 bullets.add(new bullet(x + size, y + size));}
		
	}

	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
   
		if (key == KeyEvent.VK_LEFT) {
			dx = 0;
		}

		if (key == KeyEvent.VK_RIGHT) {
			dx = 0;
		}
		if (key == KeyEvent.VK_UP) {
			dy = 0;
		}
		
	
}
	}
