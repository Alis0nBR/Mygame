package Game;

import Game.Player;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Fase extends JPanel  implements ActionListener{
	
	private Image fundo;
	private Player player;
	
	
	public Fase() {
		
		ImageIcon referencia = new ImageIcon("res\\quadrado-preto.png");
		fundo = referencia.getImage();
		
		player = new Player();
		player.load();
		
	}
	
	public void paint(Graphics g) {
		
		Graphics2D graficos = (Graphics2D) g;
		graficos.drawImage(fundo, 0, 0, null);
		graficos.drawImage(fundo, ALLBITS, ABORT, getFocusCycleRootAncestor())
		g.dispose();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		player.update();
		repaint(0);
		
	}
}