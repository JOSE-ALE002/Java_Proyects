package Interfaz;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import BD.DataBase;
import Modelo.Empleado;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Cursor;

@SuppressWarnings("serial")
public class eliminar extends JDialog {
	
	private JTable tabla; //tabla que contendra los datos de la base de datos /
    private JScrollPane scroll; //scroll agregara barras verticales y horizontales a la tabla
    private ModeloTabla modeloTabla; //modelo de vista de la tabla
    private Empleado arrayEmpleados[] = new Empleado[100];
    private JTextField tfEliminar;
	private JButton btnEliminar;
	private JPanel panel;
    
	
	/**
	 * Create the application.
	 * @param b 
	 * @param frame 
	 */
	public eliminar(JFrame frame, boolean b) {
		super(frame, b);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		getContentPane().setBackground(new Color(255, 204, 51));
		getContentPane().setLayout(null);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegresar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
		setVisible(false);
			}
			
		});
		btnRegresar.setBackground(new Color(0, 0, 0));
		btnRegresar.setForeground(new Color(255, 204, 0));
		btnRegresar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRegresar.setBounds(689, 413, 89, 29);
		getContentPane().add(btnRegresar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(tabla.getSelectedRows().length == 0)
				{
					JOptionPane.showMessageDialog(null, "Seleccione un registro", "Advertencia", JOptionPane.WARNING_MESSAGE);
				}
				
				else {
					 
					 int indices[] = tabla.getSelectedRows();
					 
					 for(int i : indices)
					 {
						 if(DataBase.empleadosDAO.eliminarRegistro(arrayEmpleados[i].getId()) == 1 )
						 {
							 JOptionPane.showMessageDialog(null, "Se ha eliminado los registros exitosamente", "Informacion", JOptionPane.INFORMATION_MESSAGE);
						 }
						 else {
							 JOptionPane.showMessageDialog(null, "Error al intentar eliminado los registros", "Error", JOptionPane.ERROR_MESSAGE);
						 }
						 
						 Arrays.fill(arrayEmpleados, null); //vacio el arreglo
							arrayEmpleados = DataBase.empleadosDAO.getEmpleados();
							modeloTabla.llenarTabla(arrayEmpleados); //metodo que llena la tabla
						 
						 tfEliminar.setText(null);
						 	
					 }
					 
				 }
				
				
			}
		});
		btnEliminar.setBackground(new Color(0, 0, 0));
		btnEliminar.setForeground(new Color(255, 204, 0));
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEliminar.setBounds(214, 413, 131, 29);
		getContentPane().add(btnEliminar);
				
		tfEliminar = new JTextField();
        tfEliminar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char c=evt.getKeyChar();

				 if((Character.isDigit(c) ||  (c==KeyEvent.VK_BACK_SPACE)||  c==KeyEvent.VK_DELETE )) {
					
					 
				 }else {
					 evt.consume();     	
					 JOptionPane.showMessageDialog(null, "Esta ingresando caracteres incorrectos");
					 
				 }
				 
				 
			}
		});
        tfEliminar.setBounds(276, 61, 188, 28);
        getContentPane().add(tfEliminar);
        tfEliminar.setColumns(10);
        
        JLabel lbBuscar = new JLabel("Buscar");
        lbBuscar.setFont(new Font("Tahoma", Font.BOLD, 14));
        lbBuscar.setBounds(196, 66, 70, 15);
        getContentPane().add(lbBuscar);
        
        JButton bBuscar = new JButton("Buscar");
        bBuscar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        bBuscar.setBackground(new Color(0, 0, 0));
        bBuscar.setForeground(new Color(255, 204, 0));
        bBuscar.setFont(new Font("Tahoma", Font.BOLD, 11));
        bBuscar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(!tfEliminar.getText().isEmpty())
        		{
        			Arrays.fill(arrayEmpleados, null); //vacio el arreglo
        			arrayEmpleados = DataBase.empleadosDAO.buscarRegistros(Integer.parseInt(tfEliminar.getText()));
        			modeloTabla.llenarTabla(arrayEmpleados);

        		}
        		else {
        			JOptionPane.showMessageDialog(null, "Ingrese el Id", "Advertencia", JOptionPane.WARNING_MESSAGE);
        		}
        	}
        });
        bBuscar.setBounds(490, 62, 102, 25);
        getContentPane().add(bBuscar);
		
		initTable();
		
		setBounds(100, 100, 831, 491);
		setDefaultCloseOperation(1);
		setVisible(true);
	}
	
	private void initTable()
	{
		tabla = new JTable(); //instancia de la tabla que tendra los datos de la tabla departamentos de la base de datos
	       
        modeloTabla = new ModeloTabla(null,getColumnas());
       
        tabla.setModel(modeloTabla); //se establece modeloTabla como el modelo de vista de la tabla  
       
        Arrays.fill(arrayEmpleados, null); //vacio el arreglo
    	arrayEmpleados = DataBase.empleadosDAO.getEmpleados();
    	modeloTabla.llenarTabla(arrayEmpleados); //metodo que llena la tabla
       
        scroll = new JScrollPane(tabla); //se el agrega las barras vertical y horizontal a la tabla
        
        scroll.setBounds(31, 116, 747, 231);
        
        getContentPane().add(scroll); //se agrega al panel
        
        panel = new JPanel();
        panel.setBackground(new Color(0, 0, 0));
        panel.setBounds(0, 0, 815, 39);
        getContentPane().add(panel);
        
        JLabel lblEliminarEmpleado = new JLabel("Eliminar Empleado");
        panel.add(lblEliminarEmpleado);
        lblEliminarEmpleado.setForeground(new Color(255, 204, 0));
        lblEliminarEmpleado.setFont(new Font("Tahoma", Font.BOLD, 15));
        
	}
	
	private String[] getColumnas() //metodo que retornna el nombre de las columnas de la tabla
    {
        String titulos[] = {"Id", "Codigo", "Nombre", "Apellido", "Edad", "Telefono", "Salario Base", "Puesto", "Pais", "Departamento"}; //titulos de los campos de la tabla
        
        return titulos;
    } 
	
	
	
}
