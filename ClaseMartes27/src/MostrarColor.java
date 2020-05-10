import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel; 
import javax.swing.JButton; 
import java.awt.BorderLayout;
import javax.swing.JColorChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MostrarColor extends JFrame {
		JButton Cambiar; 
		Color color=Color.DARK_GRAY; 
		JPanel colorJpanel; 
		
		public MostrarColor()				//NO DESDE UNA INSTANCIA, DESDE UNA HERENCIA
		{
			super("SLECTOR DE COLORES"); 
			colorJpanel=new JPanel(); 		//constructor	
			colorJpanel.setBackground(color);
			Cambiar = new JButton("CAMBIAR"); //constructor 
			
			Cambiar.addActionListener(
					
					new ActionListener() {
						 
						@Override
						 public void actionPerformed(ActionEvent e)
						 {
							 color=JColorChooser.showDialog(MostrarColor.this, "Selecione un color", color);
							 if (color==null)
							 {
								 color=Color.LIGHT_GRAY; 
								 
							 }
							 colorJpanel.setBackground(color);
						 }
					}
			);
			
			add(colorJpanel, BorderLayout.CENTER); 
			add(Cambiar, BorderLayout.SOUTH);
			setSize(400,130);
			setVisible(true);
		}
		
}
