package Interfaz;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import BD.DataBase;
import Modelo.Empleado;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

@SuppressWarnings("serial")
public class buscar extends JDialog {

	private JButton btnNewButton;
	private JLabel lblBuscarEmpleados;
	private JLabel lblBuscar;
	private JButton btnBuscar;
	@SuppressWarnings("rawtypes")
	private JComboBox cmbCriterio;
    private JButton btnIdAsc;
    private JButton btnDescID;
    private JButton btnEdadAsc;
    private  JButton btnEdadDesc;
    private JButton btnSalarioAsc;
    private JButton btnSalarioDesc;
	private JTable tabla; //tabla que contendra los datos de la base de datos /
    private JScrollPane scroll; //scroll agregara barras verticales y horizontales a la tabla
    private ModeloTabla modeloTabla; //modelo de vista de la tabla
    private Empleado arrayEmpleados[] = new Empleado[100];
    private JTextField tfBuscar;

	/**
	 * Create the application.
	 * @param b 
	 * @param frame 
	 */
	public buscar(JFrame frame, boolean b) {
		super(frame, b);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initialize() {

		getContentPane().setBackground(new Color(255, 204, 51));
		getContentPane().setLayout(null);
		
		btnNewButton = new JButton("Regresar");
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setVisible(false);
			}
		});
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setForeground(new Color(255, 204, 0));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setBounds(747, 508, 120, 32);
		getContentPane().add(btnNewButton);
		setBounds(100, 100, 918, 589);
		setDefaultCloseOperation(1);
		
		tfBuscar = new JTextField();
		tfBuscar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				
				char c=evt.getKeyChar();

				 if((Character.isDigit(c)||c==KeyEvent.VK_SPACE )) {
					 evt.consume();     	
					 JOptionPane.showMessageDialog(null, "Está ingresando caracteres incorrectos");
					 
				 }else {
					  
				 }
			}
		});
        tfBuscar.setBounds(254, 60, 205, 32);
        getContentPane().add(tfBuscar);
        tfBuscar.setColumns(10);
        
        lblBuscar = new JLabel("Buscar");
        lblBuscar.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblBuscar.setBounds(186, 56, 70, 36);
        getContentPane().add(lblBuscar);
        
        btnBuscar = new JButton("Buscar");
        btnBuscar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnBuscar.setForeground(new Color(255, 204, 0));
        btnBuscar.setBackground(new Color(0, 0, 0));
        btnBuscar.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnBuscar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		if(tfBuscar.getText().isEmpty() && cmbCriterio.getSelectedItem().toString().equals("Nombre") 
        				|| tfBuscar.getText().isEmpty() && cmbCriterio.getSelectedItem().toString().equals("Apellido"))
        		{
        			JOptionPane.showMessageDialog(null, "Ingrese los datos", "Advertencia", JOptionPane.WARNING_MESSAGE);
        		}
        		else {
        			
        			//el metodo fill le asigna el valor null a todas las posiciones del arreglo,
        	        //por lo tanto lo vacia
        	        Arrays.fill(arrayEmpleados, null);
            		
            		if(cmbCriterio.getSelectedItem().toString().equals("Nombre"))
            		{
            			arrayEmpleados = DataBase.empleadosDAO.buscarRegistros(DataBase.TEMPLEADOS_NOMBRE , tfBuscar.getText());
            		
            			modeloTabla.llenarTabla(arrayEmpleados); //metodo que llena la tabla
            			
            		}
            		else if (cmbCriterio.getSelectedItem().toString().equals("Apellido")) {
            			arrayEmpleados = DataBase.empleadosDAO.buscarRegistros(DataBase.TEMPLEADOS_APELLIDO , tfBuscar.getText());
            			
            			modeloTabla.llenarTabla(arrayEmpleados); //metodo que llena la tabla
            			
            		}else if(cmbCriterio.getSelectedItem().toString().equals("Seleccionar")){
            			
            			remove(scroll);
            			initTable();
            			modeloTabla.llenarTabla(arrayEmpleados);
            			
            		}
            		
            		
            		tfBuscar.setText(null);
        		}
        		
        	}
        });
        btnBuscar.setBounds(482, 60, 101, 32);
        getContentPane().add(btnBuscar);
        
        cmbCriterio = new JComboBox();
        cmbCriterio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        cmbCriterio.setBackground(new Color(255, 204, 0));
        cmbCriterio.setFont(new Font("Tahoma", Font.BOLD, 11));
        cmbCriterio.setBounds(621, 60, 126, 32);
        
        //se agregan los items al combobox
        cmbCriterio.addItem("Seleccionar");
        cmbCriterio.addItem("Nombre");
        cmbCriterio.addItem("Apellido");
        
        getContentPane().add(cmbCriterio);
        
        
        btnIdAsc = new JButton("Ascendente ID");
        btnIdAsc.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnIdAsc.setBackground(new Color(0, 0, 0));
        btnIdAsc.setForeground(new Color(255, 204, 0));
        btnIdAsc.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnIdAsc.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		Ordenar.QuickSort_IDASC(arrayEmpleados, 0, Ordenar.lenght_array(arrayEmpleados)-1);
        	
        		modeloTabla.llenarTabla(arrayEmpleados); //que llena la tabla
        	
        	}
        });
        btnIdAsc.setBounds(200, 123, 146, 25);
        getContentPane().add(btnIdAsc);
        
        btnDescID = new JButton("Descendente ID");
        btnDescID.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnDescID.setBackground(new Color(0, 0, 0));
        btnDescID.setForeground(new Color(255, 204, 0));
        btnDescID.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnDescID.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		Ordenar.QuickSort_IDDESC(arrayEmpleados, 0, Ordenar.lenght_array(arrayEmpleados)-1);
        		
        		modeloTabla.llenarTabla(arrayEmpleados); //que llena la tabla
        		
        	}
        });
        btnDescID.setBounds(200, 167, 146, 25);
        getContentPane().add(btnDescID);
        
        btnEdadAsc = new JButton("Ascendente Edad");
        btnEdadAsc.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnEdadAsc.setBackground(new Color(0, 0, 0));
        btnEdadAsc.setForeground(new Color(255, 204, 0));
        btnEdadAsc.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnEdadAsc.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		Ordenar.QuickSort_EDADASC(arrayEmpleados, 0, Ordenar.lenght_array(arrayEmpleados)-1);
        		
        		modeloTabla.llenarTabla(arrayEmpleados); //que llenar la tabla
        	
        	}
        });
        btnEdadAsc.setBounds(369, 123, 169, 25);
        getContentPane().add(btnEdadAsc);        
        
        btnEdadDesc = new JButton("Descendente Edad");
        btnEdadDesc.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnEdadDesc.setBackground(new Color(0, 0, 0));
        btnEdadDesc.setForeground(new Color(255, 204, 0));
        btnEdadDesc.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnEdadDesc.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		Ordenar.QuickSort_EDADDESC(arrayEmpleados, 0, Ordenar.lenght_array(arrayEmpleados)-1);
        		
        		modeloTabla.llenarTabla(arrayEmpleados); //que llena la tabla
        		
        		
        	}
        });
        btnEdadDesc.setBounds(369, 167, 169, 25);
        getContentPane().add(btnEdadDesc);
        
        btnSalarioAsc = new JButton("Ascendente Salario");
        btnSalarioAsc.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnSalarioAsc.setBackground(new Color(0, 0, 0));
        btnSalarioAsc.setForeground(new Color(255, 204, 0));
        btnSalarioAsc.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnSalarioAsc.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		Ordenar.QuickSort_SALARIOASC(arrayEmpleados, 0, Ordenar.lenght_array(arrayEmpleados)-1);
        		
        		modeloTabla.llenarTabla(arrayEmpleados); //que llena la tabla
        		
        	
        	}
        });
        btnSalarioAsc.setBounds(565, 123, 182, 25);
        getContentPane().add(btnSalarioAsc);
        
        btnSalarioDesc = new JButton("Descendente Salario");
        btnSalarioDesc.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnSalarioDesc.setBackground(new Color(0, 0, 0));
        btnSalarioDesc.setForeground(new Color(255, 204, 0));
        btnSalarioDesc.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnSalarioDesc.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		Ordenar.QuickSort_SALARIODESC(arrayEmpleados, 0, Ordenar.lenght_array(arrayEmpleados)-1);
      
        		modeloTabla.llenarTabla(arrayEmpleados);//que llena la tabla
        		
        	}
        });
        btnSalarioDesc.setBounds(565, 167, 182, 25);
        getContentPane().add(btnSalarioDesc);
		
		initTable();
		
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
        
        modeloTabla.llenarTabla(arrayEmpleados); //que llena la tabla
       
        scroll = new JScrollPane(tabla); //se el agrega las barras vertical y horizontal a la tabla
        
        scroll.setBounds(31, 203, 836, 283);
        
        getContentPane().add(scroll); //se agrega al panel
        
        JPanel panel = new JPanel();
        
        panel.setBackground(new Color(0, 0, 0));
        panel.setBounds(0, 0, 902, 32);
        getContentPane().add(panel);
        
        lblBuscarEmpleados = new JLabel("Buscar Empleados");
        panel.add(lblBuscarEmpleados);
        lblBuscarEmpleados.setForeground(new Color(255, 204, 0));
        lblBuscarEmpleados.setFont(new Font("Tahoma", Font.BOLD, 14));
       
	}
	
	private String[] getColumnas() //metodo que retornna el nombre de las columnas de la tabla
    {
        String titulos[] = {"Id", "Codigo", "Nombre", "Apellido", "Edad", "Telefono", "Salario Base", "Puesto", "Pais", "Departamento"}; //titulos de los campos de la tabla
        
        return titulos;
    }
}
