package Interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JPanel;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DebugGraphics;
import javax.swing.SwingConstants;

public class menu {

	private JFrame frame;
	private JButton btnNuevo;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu window = new menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public menu() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	@SuppressWarnings("unused")
	private void initialize() throws IOException {
		frame = new JFrame();
		frame.setBounds(100, 100, 844, 540);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 828, 98);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Menu Principal");
		lblNewLabel.setFont(new Font("Subpear", Font.PLAIN, 34));
		lblNewLabel.setForeground(new Color(255, 204, 0));
		lblNewLabel.setBounds(310, 27, 225, 60);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		panel_1.setBackground(new Color(255, 204, 51));
		panel_1.setBounds(0, 97, 828, 405);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		
		BufferedImage btnnuevo = ImageIO.read(new File("imagenes/nuevo-usuario.png"));
		BufferedImage btnborrar = ImageIO.read(new File("imagenes/borrar-usuario.png"));
		BufferedImage btnbuscar = ImageIO.read(new File("imagenes/buscar-simbolo-de-interfaz-de-usuario.png"));
		BufferedImage btnmostrar = ImageIO.read(new File("imagenes/mostrar.png"));
		BufferedImage btnsalir = ImageIO.read(new File("imagenes/salir-al-boton-de-la-aplicacion.png"));

		btnNuevo = new JButton(new ImageIcon(menu.class.getResource("/resources/nuevo-usuario.png")));
		btnNuevo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				new agregar(frame, true);
			
			}
		});
		btnNuevo.setFocusPainted(false);
		btnNuevo.setContentAreaFilled(false);
		btnNuevo.setOpaque(false);
		btnNuevo.setRolloverIcon(new ImageIcon(menu.class.getResource("/resources/nuevo-usuario(1).png")));
		btnNuevo.setHorizontalAlignment(SwingConstants.LEFT);
		btnNuevo.setVerticalAlignment(SwingConstants.TOP);
		btnNuevo.setRolloverSelectedIcon(null);
		btnNuevo.setPressedIcon(new ImageIcon(menu.class.getResource("/resources/nuevo-usuario.png")));
		btnNuevo.setDisabledSelectedIcon(null);
		btnNuevo.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		btnNuevo.setBorderPainted(false);
		btnNuevo.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNuevo.setBackground(new Color(255, 204, 51));
		btnNuevo.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNuevo.setBounds(20, 70, 161, 161);
		panel_1.add(btnNuevo);
		
		JButton btnMostrar = new JButton(new ImageIcon(menu.class.getResource("/resources/mostrar.png")));
		btnMostrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new mostrar(frame, true);
			}
		});
		btnMostrar.setFocusPainted(false);
		btnMostrar.setContentAreaFilled(false);
		btnMostrar.setOpaque(false);
		btnMostrar.setPressedIcon(new ImageIcon(menu.class.getResource("/resources/mostrar.png")));
		btnMostrar.setRolloverIcon(new ImageIcon(menu.class.getResource("/resources/mostrar(1).png")));
		btnMostrar.setHorizontalAlignment(SwingConstants.LEFT);
		btnMostrar.setVerticalAlignment(SwingConstants.TOP);
		btnMostrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnMostrar.setBackground(new Color(255, 204, 51));
		btnMostrar.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnMostrar.setBounds(225, 70, 161, 161);
		panel_1.add(btnMostrar);
		
		JButton btnBuscar = new JButton(new ImageIcon(menu.class.getResource("/resources/buscar-simbolo-de-interfaz-de-usuario.png")));
		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new buscar(frame, true);
			}
		});
		btnBuscar.setFocusPainted(false);
		btnBuscar.setContentAreaFilled(false);
		btnBuscar.setOpaque(false);
		btnBuscar.setPressedIcon(new ImageIcon(menu.class.getResource("/resources/buscar-simbolo-de-interfaz-de-usuario.png")));
		btnBuscar.setRolloverIcon(new ImageIcon(menu.class.getResource("/resources/buscar-simbolo-de-interfaz-de-usuario(1).png")));
		btnBuscar.setVerticalAlignment(SwingConstants.TOP);
		btnBuscar.setHorizontalAlignment(SwingConstants.LEFT);
		btnBuscar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnBuscar.setBackground(new Color(255, 204, 51));
		btnBuscar.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnBuscar.setBounds(432, 70, 161, 161);
		panel_1.add(btnBuscar);
		
		JButton btnEliminar = new JButton(new ImageIcon(menu.class.getResource("/resources/borrar-usuario.png")));
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new eliminar(frame, true);
			}
		});
		btnEliminar.setContentAreaFilled(false);
		btnEliminar.setHorizontalAlignment(SwingConstants.LEFT);
		btnEliminar.setOpaque(false);
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEliminar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnEliminar.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnEliminar.setFocusPainted(false);
		btnEliminar.setVerticalAlignment(SwingConstants.TOP);
		btnEliminar.setRolloverIcon(new ImageIcon(menu.class.getResource("/resources/borrar-usuario (1).png")));
		btnEliminar.setPressedIcon(new ImageIcon(menu.class.getResource("/resources/borrar-usuario.png")));
		btnEliminar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnEliminar.setBackground(new Color(255, 204, 51));
		btnEliminar.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnEliminar.setBounds(636, 70, 161, 161);
		panel_1.add(btnEliminar);
		
		JButton btnSalir = new JButton(new ImageIcon(menu.class.getResource("/resources/salir-al-boton-de-la-aplicacion.png")));
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				int n = JOptionPane.showConfirmDialog(
			            null,
			            "Realmente quieres salir?",
			            "Saliendo del Programa",
			            JOptionPane.YES_NO_OPTION);

			        if(n == JOptionPane.YES_OPTION){
			        	
			        	 System.exit(0);//Termina la ejecusion
			        }
			        else { 
			        }
			}
		});
		btnSalir.setFocusPainted(false);
		btnSalir.setContentAreaFilled(false);
		btnSalir.setRolloverIcon(new ImageIcon(menu.class.getResource("/resources/salir-al-boton-de-la-aplicacion(1).png")));
		btnSalir.setPressedIcon(new ImageIcon(menu.class.getResource("/resources/salir-al-boton-de-la-aplicacion.png")));
		btnSalir.setRolloverSelectedIcon(null);
		btnSalir.setVerticalAlignment(SwingConstants.TOP);
		btnSalir.setHorizontalAlignment(SwingConstants.LEFT);
		btnSalir.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnSalir.setBackground(new Color(255, 204, 51));
		btnSalir.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnSalir.setBounds(738, 314, 80, 80);
		panel_1.add(btnSalir);
		
		JLabel lblAgregar = new JLabel("Agregar ");
		lblAgregar.setFont(new Font("Street Variation", Font.PLAIN, 15));
		lblAgregar.setBounds(75, 242, 64, 27);
		panel_1.add(lblAgregar);
		
		JLabel lblMostrar = new JLabel("Mostrar");
		lblMostrar.setFont(new Font("Street Variation", Font.PLAIN, 15));
		lblMostrar.setBounds(275, 242, 54, 27);
		panel_1.add(lblMostrar);
		
		JLabel lblBuscar = new JLabel("Buscar");
		lblBuscar.setFont(new Font("Street Variation", Font.PLAIN, 15));
		lblBuscar.setBounds(489, 242, 54, 27);
		panel_1.add(lblBuscar);
		
		JLabel lblEliminar = new JLabel("Eliminar");
		lblEliminar.setFont(new Font("Street Variation", Font.PLAIN, 15));
		lblEliminar.setBounds(699, 242, 54, 29);
		panel_1.add(lblEliminar);
	}
}
