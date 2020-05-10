package Interfaz;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.awt.Cursor;


import BD.DataBase;
import Modelo.Empleado;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class mostrar extends JDialog {
	private JTable tabla; //tabla que contendra los datos de la base de datos /
    private JScrollPane scroll; //scroll agregara barras verticales y horizontales a la tabla
    private ModeloTabla modeloTabla; //modelo de vista de la tabla
    private Empleado arrayEmpleados[] = new Empleado[100];

	/**
	 * Create the application.
	 * @param b 
	 * @param frame 
	 */
	public mostrar(JFrame frame, boolean b) {
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
		btnRegresar.setForeground(new Color(255, 204, 0));
		btnRegresar.setBackground(new Color(0, 0, 0));
		btnRegresar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRegresar.setBounds(734, 417, 99, 30);
		getContentPane().add(btnRegresar);
		
		JButton btnASC = new JButton("Ascendente");
		btnASC.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnASC.setBackground(new Color(0, 0, 0));
		btnASC.setForeground(new Color(255, 204, 0));
		btnASC.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnASC.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		Ordenar.QuickSort_IDASC(arrayEmpleados, 0, Ordenar.lenght_array(arrayEmpleados)-1);
        		
        		modeloTabla.llenarTabla(arrayEmpleados); //que llena la tabla
        	}
        });
        btnASC.setBounds(160, 63, 144, 25);
        getContentPane().add(btnASC);
        
        JButton btnDESC = new JButton("Descendente");
        btnDESC.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnDESC.setBackground(new Color(0, 0, 0));
        btnDESC.setForeground(new Color(255, 204, 0));
        btnDESC.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnDESC.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		Ordenar.QuickSort_IDDESC(arrayEmpleados, 0, Ordenar.lenght_array(arrayEmpleados)-1);
        		
        		modeloTabla.llenarTabla(arrayEmpleados); //que llena la tabla
        	}
        });
        btnDESC.setBounds(515, 63, 158, 25);
        getContentPane().add(btnDESC);
		
		initTable();
		setBounds(100, 100, 883, 496);
		setDefaultCloseOperation(1);
		
		setVisible(true);
	}
	
	private void initTable()
	{
		tabla = new JTable(); //instancia de la tabla que tendra los datos de la tabla departamentos de la base de datos
	       
        modeloTabla = new ModeloTabla(null,getColumnas());
       
        tabla.setModel(modeloTabla); //se establece modeloTabla como el modelo de vista de la tabla  
       
        //el metodo fill le asigna el valor null a todas las posiciones del arreglo,
        //por lo tanto lo vacia
        Arrays.fill(arrayEmpleados, null);
        
        arrayEmpleados = DataBase.empleadosDAO.getEmpleados();
        
        modeloTabla.llenarTabla(arrayEmpleados);
       
        scroll = new JScrollPane(tabla); //se el agrega las barras vertical y horizontal a la tabla
        
        scroll.setBounds(31, 116, 802, 277);
        
        getContentPane().add(scroll); //se agrega al panel
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 0, 0));
        panel.setForeground(new Color(0, 0, 0));
        panel.setBounds(0, 0, 867, 34);
        getContentPane().add(panel);
        
        JLabel lblMostrandoLosEmpleados = new JLabel("Mostrando los Empleados");
        panel.add(lblMostrandoLosEmpleados);
        lblMostrandoLosEmpleados.setForeground(new Color(255, 204, 0));
        lblMostrandoLosEmpleados.setFont(new Font("Tahoma", Font.BOLD, 17));
       
	}
	
	private String[] getColumnas() //metodo que retornna el nombre de las columnas de la tabla
    {
        String titulos[] = {"Id", "Codigo", "Nombre", "Apellido", "Edad", "Telefono", "Salario Base", "Puesto", "Pais", "Departamento"}; //titulos de los campos de la tabla
        
        return titulos;
    }
	
}
