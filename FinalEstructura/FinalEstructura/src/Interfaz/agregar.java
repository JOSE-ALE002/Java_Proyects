package Interfaz;



import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.concurrent.ThreadLocalRandom;

import BD.*;
import Modelo.Empleado;

//import Modelo.*;
import javax.swing.JPanel;
import java.awt.Cursor;

@SuppressWarnings("serial")
public class agregar extends JDialog{

//	private JFrame frmAgregarNuevoEmpleado;
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textEdad;
	private JTextField textSalBase;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox_1;
    @SuppressWarnings("rawtypes")
	private JComboBox comboBox_2;
    private JTextField textTelefono;
    private Empleado arrayEmpleados[] = new Empleado[100];
    int tamanio; 
	/**
	 * Create the application.
	 * @param b 
	 * @param frame 
	 */
	public agregar(JFrame frame, boolean b) {
		super(frame, b);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initialize() {
	//	frmAgregarNuevoEmpleado = new JFrame();
		getContentPane().setForeground(new Color(255, 204, 0));
		setTitle("Agregar Nuevo Empleado");
		getContentPane().setBackground(new Color(255, 204, 51));
		getContentPane().setLayout(null);
		
		JLabel lblNombreDelEmpleado = new JLabel("Nombre del Empleado:");
		lblNombreDelEmpleado.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNombreDelEmpleado.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombreDelEmpleado.setBounds(160, 38, 153, 19);
		getContentPane().add(lblNombreDelEmpleado);
		
		textNombre = new JTextField();
		textNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				
				char c=evt.getKeyChar();

			    if(Character.isAlphabetic(c) ||c==KeyEvent.VK_BACK_SPACE)   {
			    	
			    	
			    }else {
			    	evt.consume();
				    JOptionPane.showMessageDialog(null, "Está ingresando caracteres incorrectos");
			    }
			}
		});
		textNombre.setFont(new Font("Tahoma", Font.BOLD, 12));
		textNombre.setBackground(new Color(255, 204, 51));
		textNombre.setCaretColor(new Color(0, 0, 0));
		textNombre.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textNombre.setColumns(10);
		textNombre.setBounds(323, 38, 153, 20);
		getContentPane().add(textNombre);
		
		JLabel lblApellidoDelEmpleado = new JLabel("Apellido del Empleado:");
		lblApellidoDelEmpleado.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblApellidoDelEmpleado.setHorizontalAlignment(SwingConstants.RIGHT);
		lblApellidoDelEmpleado.setBounds(160, 95, 153, 14);
		getContentPane().add(lblApellidoDelEmpleado);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEdad.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEdad.setBounds(267, 145, 46, 14);
		getContentPane().add(lblEdad);
		
		JLabel lblPuesto = new JLabel("Puesto:");
		lblPuesto.setForeground(Color.BLACK);
		lblPuesto.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPuesto.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPuesto.setBounds(218, 198, 95, 14);
		getContentPane().add(lblPuesto);
		
		JLabel lblNewLabel = new JLabel("Salario Base:");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(193, 246, 120, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblPais = new JLabel("Pais:");
		lblPais.setForeground(Color.BLACK);
		lblPais.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPais.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPais.setBounds(267, 298, 46, 14);
		getContentPane().add(lblPais);
		
		JLabel lblDepartamento = new JLabel("Departamento:");
		lblDepartamento.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDepartamento.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDepartamento.setBounds(181, 344, 132, 14);
		getContentPane().add(lblDepartamento);
		
		JLabel lblNumeroDeTelefono = new JLabel("Numero de Telefono:");
		lblNumeroDeTelefono.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumeroDeTelefono.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNumeroDeTelefono.setBounds(160, 395, 153, 14);
		getContentPane().add(lblNumeroDeTelefono);
		
		textApellido = new JTextField();
		textApellido.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char c=evt.getKeyChar();

			    if(Character.isAlphabetic(c)  ||c==KeyEvent.VK_BACK_SPACE )   {
			    	
			    	
			    }else {
			    	evt.consume();
				    JOptionPane.showMessageDialog(null, "Está ingresando caracteres incorrectos");
			    }
			}
		});
		textApellido.setFont(new Font("Tahoma", Font.BOLD, 12));
		textApellido.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textApellido.setBackground(new Color(255, 204, 51));
		textApellido.setBounds(323, 93, 153, 20);
		getContentPane().add(textApellido);
		textApellido.setColumns(10);
		
		textEdad = new JTextField();
		textEdad.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char c=evt.getKeyChar();

				 if(Character.isDigit(c) ||c==KeyEvent.VK_BACK_SPACE ) {
	
					 if (textEdad.getText().length()== 2) {

				         evt.consume(); 
				    } 
				 }else {
					
					 evt.consume();     	
					 JOptionPane.showMessageDialog(null, "Está ingresando caracteres incorrectos");
				 }
			}
		});
		textEdad.setFont(new Font("Tahoma", Font.BOLD, 12));
		textEdad.setBackground(new Color(255, 204, 51));
		textEdad.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textEdad.setBounds(323, 143, 86, 20);
		getContentPane().add(textEdad);
		textEdad.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comboBox.setForeground(Color.BLACK);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		//Puestos de trabajo
		comboBox.addItem("--Seleccionar--");
		comboBox.addItem("Mantenimiento");
		comboBox.addItem("Contador");
		comboBox.addItem("Secretario");
		comboBox.addItem("Publicidad");
		comboBox.addItem("Gerente");
		comboBox.addItem("Asistente");
		comboBox.setBackground(new Color(255, 204, 51));
		comboBox.setBounds(323, 196, 132, 20);
		getContentPane().add(comboBox);
		
	
		
		textSalBase = new JTextField();
		textSalBase.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				
				char c=evt.getKeyChar();

				 if(Character.isDigit(c)|| c == '.' ||c==KeyEvent.VK_BACK_SPACE){
					
				 }else {
					 evt.consume();     	
					 JOptionPane.showMessageDialog(null, "Está ingresando caracteres incorrectos");
					 
				 }
			}
		});
		textSalBase.setFont(new Font("Tahoma", Font.BOLD, 12));
		textSalBase.setBackground(new Color(255, 204, 51));
		textSalBase.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textSalBase.setBounds(323, 244, 86, 20);
		getContentPane().add(textSalBase);
		textSalBase.setColumns(10);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comboBox_1.setForeground(new Color(0, 0, 0));
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ObtenerDepartamentos(); 
			}
		});
		comboBox_1.setBorder(null);
		comboBox_1.addItem("--Seleccionar--");
		comboBox_1.addItem("El Salvador");
		comboBox_1.addItem("Guatemala");
		comboBox_1.addItem("Honduras");
		comboBox_1.addItem("Nicaragua");
		comboBox_1.addItem("Costa Rica");
		comboBox_1.addItem("Panama");
		
		comboBox_1.setBackground(new Color(255, 204, 51));
		comboBox_1.setBounds(323, 296, 132, 20);
		getContentPane().add(comboBox_1);
		
		 comboBox_2 = new JComboBox();
		 comboBox_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		 comboBox_2.addItem("Primero selecciona un Pais");
		//ObtenerDepartamentos(comboBox.getSelectedItem().toString());
		comboBox_2.setBackground(new Color(255, 204, 51));
		comboBox_2.setBounds(323, 342, 194, 20);
		getContentPane().add(comboBox_2);
		
		textTelefono = new JTextField();
		textTelefono.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				
				char c=evt.getKeyChar();

				 if(!(Character.isDigit(c))) {
					 evt.consume();     	
					 JOptionPane.showMessageDialog(null, "Está ingresando caracteres incorrectos");
					 
				 }else {
					 if (textTelefono.getText().length()== 13) {

				         evt.consume(); 
				    } 
				 }
			}
		});
		textTelefono.setFont(new Font("Tahoma", Font.BOLD, 12));
		textTelefono.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textTelefono.setBackground(new Color(255, 204, 51));
		textTelefono.setBounds(323, 393, 132, 20);
		getContentPane().add(textTelefono);
		textTelefono.setColumns(10);
		
		JButton btnGuardarEmpleado = new JButton("Guardar Empleado");
		btnGuardarEmpleado.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGuardarEmpleado.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				
				if(textNombre.getText().isEmpty() || textApellido.getText().isEmpty() || textEdad.getText().isEmpty() 
						|| comboBox.getSelectedItem().equals("--Seleccionar--") || textSalBase.getText().isEmpty() 
						|| comboBox_1.getSelectedItem().equals("--Seleccionar--") || textTelefono.getText().isEmpty() ) {
					
					JOptionPane.showMessageDialog(null, "Hay Campos Vacios");
				}else {
					
					arrayEmpleados = DataBase.empleadosDAO.getEmpleados();//Se llena el arreglo con los datos de la tabla
					tamanio = Ordenar.lenght_array(arrayEmpleados); //Se obtiene el tamanio del arreglo
					
					if(tamanio == 100){
						
						JOptionPane.showMessageDialog(null, "Se ha alcanzado el Numero Limite de Empleados");
						
				}else {
						
					String letraNombre = textNombre.getText().substring(0, 1);
					String letraApellido = textApellido.getText().substring(0, 1);
					String Edad = textEdad.getText();
					
					int n = ThreadLocalRandom.current().nextInt(1, 8+1);
					String al = String.valueOf(n); 
					String Codigo = letraNombre.concat(letraApellido).concat(Edad).concat("19").concat(al);
					String Nombre  = textNombre.getText();
				    String Apellido = textApellido.getText();
				    //String Edad = textEdad.getText();
				    int edad = Integer.parseInt(Edad);
				    String Telefono = textTelefono.getText();
				    //String SalBase = textSalBase.getText();
				    double SalBase = Double.parseDouble(textSalBase.getText()); 
				    String Puesto = comboBox.getSelectedItem().toString();
				    String Pais = comboBox_1.getSelectedItem().toString();
				    String Departamento = comboBox_2.getSelectedItem().toString();
					DataBase.empleadosDAO.nuevoRegistro(Codigo, Nombre, Apellido, edad, Telefono, SalBase, Puesto, Pais,Departamento);

					arrayEmpleados = DataBase.empleadosDAO.getEmpleados();//Se llena el arreglo con los datos de la tabla
					
					tamanio = Ordenar.lenght_array(arrayEmpleados);//Se obtiene el tamanio del arreglo
					
					JOptionPane.showMessageDialog(null, "El Codigo del Empleado Agregado es: "+Codigo +" \n"
							+ "El numero de Empleados Actualues es de: "+ tamanio);
					
					//Se resetean los elementos
					textNombre.setText(null);
					textApellido.setText(null);
					textEdad.setText(null);
					comboBox.setSelectedItem("--Seleccionar--");
					textSalBase.setText(null);
					comboBox_1.setSelectedItem("--Seleccionar--");
					textTelefono.setText(null);
					comboBox_2.removeAllItems();
					comboBox_2.addItem("Primero selecciona un Pais");
					}
				}
				
				//DataBase.empleadosDAO.nuevoRegistro("asa", "Pacheco", "kgmkg", 80, "212", 232.1212, "hghj", "hgj","as");
			}
		});
		btnGuardarEmpleado.setForeground(new Color(255, 204, 0));
		btnGuardarEmpleado.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnGuardarEmpleado.setBackground(new Color(0, 0, 0));
		btnGuardarEmpleado.setBounds(181, 488, 181, 38);
		getContentPane().add(btnGuardarEmpleado);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegresar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				setVisible(false);
				
			}
		});
		btnRegresar.setForeground(new Color(255, 204, 0));
		btnRegresar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRegresar.setBackground(new Color(0, 0, 0));
		btnRegresar.setBounds(449, 488, 108, 38);
		getContentPane().add(btnRegresar);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 454, 705, 83);
		getContentPane().add(panel);
		setBounds(100, 100, 721, 575);
		setDefaultCloseOperation(1);
		
		setVisible(true);
	}
	
	@SuppressWarnings("unchecked")
	private void ObtenerDepartamentos() {
		
	
		
		if(comboBox_1.getSelectedItem().equals("El Salvador")) {
			
			comboBox_2.removeAllItems();
			comboBox_2.addItem("San Salvador");
			comboBox_2.addItem("San Miguel");
			comboBox_2.addItem("Santa Ana");
			comboBox_2.addItem("San Vicente");
			comboBox_2.addItem("Sonsonate");
			comboBox_2.addItem("La Paz");
			comboBox_2.addItem("Cabanas");
			comboBox_2.addItem("Usulutan");
			comboBox_2.addItem("La Union");
			textTelefono.setText(null);
			textTelefono.setText("+503 ");
			
		}else if(comboBox_1.getSelectedItem().equals("Guatemala")) {
			comboBox_2.removeAllItems();
			comboBox_2.addItem("Petén");
			comboBox_2.addItem("Izabal");
			comboBox_2.addItem("Quiché");
			comboBox_2.addItem("Huehuetenango");
			comboBox_2.addItem("Escuintla");
			comboBox_2.addItem("San Marcos");
			comboBox_2.addItem("Jutiapa");
			comboBox_2.addItem("Baja Verapaz");
			comboBox_2.addItem("Santa Rosa");
			comboBox_2.addItem("Zacapa");
			textTelefono.setText(null);
			textTelefono.setText("+502 ");
			
			
		}else if(comboBox_1.getSelectedItem().equals("Honduras")) {
			comboBox_2.removeAllItems();
			comboBox_2.addItem("Atlántida");
			comboBox_2.addItem("Choluteca");
			comboBox_2.addItem("Colón");
			comboBox_2.addItem("Comayagua");
			comboBox_2.addItem("Copán");
			comboBox_2.addItem("Cortes");
			comboBox_2.addItem("El Paraíso");
			comboBox_2.addItem("Francisco Morazán");
			comboBox_2.addItem("Gracias a Dios");
			comboBox_2.addItem("Intibucá");
			textTelefono.setText(null);
			textTelefono.setText("+504 ");
			
		}else if(comboBox_1.getSelectedItem().equals("Nicaragua")) {
			comboBox_2.removeAllItems();
			comboBox_2.addItem("Chinandega");
			comboBox_2.addItem("Leon");
			comboBox_2.addItem("Managua");
			comboBox_2.addItem("Masaya");
			comboBox_2.addItem("Carazo");
			comboBox_2.addItem("Granada");
			comboBox_2.addItem("Rivas");			
			textTelefono.setText(null);
			textTelefono.setText("+505 ");
			
		}else if(comboBox_1.getSelectedItem().equals("Costa Rica")) {
			comboBox_2.removeAllItems();
			comboBox_2.addItem("San José");
			comboBox_2.addItem("Alajuela");
			comboBox_2.addItem("Cartago");
			comboBox_2.addItem("Heredia");
			comboBox_2.addItem("Guanacaste");
			comboBox_2.addItem("Puntarenas");
			comboBox_2.addItem("Limón");
			textTelefono.setText(null);
			textTelefono.setText("+506 ");
			
			
		}else if(comboBox_1.getSelectedItem().equals("Panama")) {
			comboBox_2.removeAllItems();
			comboBox_2.addItem("Provincia de Bocas del Toro");
			comboBox_2.addItem("Provincia de Coclé");
			comboBox_2.addItem("Provincia de Colón");
			comboBox_2.addItem("Provincia de Chiriquí");
			comboBox_2.addItem("Provincia de Darién");
			comboBox_2.addItem("Provincia de Herrera");
			comboBox_2.addItem("Provincia de Los Santos");
			comboBox_2.addItem("Provincia de Panamá");
			comboBox_2.addItem("Provincia de Veraguas");
			comboBox_2.addItem("Provincia de Panamá Oeste");
			textTelefono.setText(null);
			textTelefono.setText("+507 ");
		}
		
		
	}
}
