import java.awt.Image;
import javax.swing.ImageIcon;

public class bullet {

	private int a, b;
	private Image bullet;
	boolean visible;

	private final int board_width = 1000;
	private final int speed = 12;

	public bullet(int a, int b) {

		ImageIcon icon = new ImageIcon(this.getClass()
				.getResource("bullet.png"));
		bullet = icon.getImage();
		visible = true;
		this.a = a;
		this.b = b;

	}

	public Image getImage() {
		return bullet;
	}

	public int getX() {
		return a;
	}

	public int getY() {
		return b;
	}

	public boolean isVisible() {
		return visible;
	}

	public void move() {
		a += speed;
		if (a > board_width) {
			visible = false;
		}
	}
}
