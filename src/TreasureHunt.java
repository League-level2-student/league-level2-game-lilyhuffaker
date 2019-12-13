import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;

public class TreasureHunt {
	JFrame frame;
	final int _width = 800;
	final int _height = 800;
	
	public static void main(String[] args) {
		new TreasureHunt().setup();
	}
	
	 TreasureHunt() {
		frame = new JFrame();
	}
	
	void setup() {
		frame.setVisible(true);
		frame.setSize(_width, _height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void setDefaultCloseOperation(int exitOnClose) {
		// TODO Auto-generated method stub
		
	}
}
