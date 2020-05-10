import javax.swing.JFrame; 

public class Figuras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame formu = new JFrame("Figuras"); 
		formu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LineasRectas lr = new LineasRectas(); 	//Crear un objeto: instancearlo
		formu.add(lr);
		formu.setSize(360, 360);
		formu.setVisible(true);
		}
}

