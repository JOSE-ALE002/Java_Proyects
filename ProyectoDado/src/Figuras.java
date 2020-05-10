import java.awt.Color; 
import java.awt.Graphics; 
import javax.swing.JPanel;
import java.security.SecureRandom;
import javax.swing.JOptionPane;

public class Figuras extends JPanel {
	@Override
	public void paintComponent(Graphics g){		//crear nueva ventana, basada en JPanel
		
		SecureRandom naleatorio = new SecureRandom(); 
		int na = naleatorio.nextInt(7);
		
		super.paintComponent(g);
		this.setBackground(Color.darkGray);
		g.setColor(Color.CYAN);
		g.draw3DRect(90, 90 , 180, 180, true);
		
		switch(na) {
		
			case 0:{
				na = 1;
			}
			
			case 1:{
				g.fillOval(155, 155, 50, 50);
				break;
			}
			
			case 2:{
				g.fillOval(100, 210, 50, 50);
				g.fillOval(210, 100, 50, 50);
				break;
			}
			
			case 3:{
				g.fillOval(100, 210, 50, 50);
				g.fillOval(155, 155, 50, 50);
				g.fillOval(210, 100, 50, 50);
				break;
			}
			
			case 4:{
				g.fillOval(100, 100, 50, 50);
				g.fillOval(100, 210, 50, 50);
				g.fillOval(210, 100, 50, 50);
				g.fillOval(210, 210, 50, 50);
				break;
			}
			
			case 5:{
				g.fillOval(100, 100, 50, 50);
				g.fillOval(100, 210, 50, 50);
				g.fillOval(155, 155, 50, 50);
				g.fillOval(210, 100, 50, 50);
				g.fillOval(210, 210, 50, 50);
				break;
			}
			
			case 6:{
				g.fillOval(100, 100, 50, 50);
				g.fillOval(100, 155, 50, 50);
				g.fillOval(100, 210, 50, 50);
				g.fillOval(210, 100, 50, 50);
				g.fillOval(210, 155, 50, 50);
				g.fillOval(210, 210, 50, 50);
				break;
			}
			
			case 7:{
				JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}


