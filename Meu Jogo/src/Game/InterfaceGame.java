package Game;

import javax.swing.JFrame;

public class InterfaceGame extends JFrame {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InterfaceGame() {
			
		setTitle("MyGame");
		setSize(1024, 728);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		this.setResizable(true);
		setVisible(true);
	}
}
