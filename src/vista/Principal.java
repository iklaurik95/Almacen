package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ClienteControlador;
import controlador.ProductoControlador;


import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private ClienteControlador clienteControlador;
	private ProductoControlador productoControlador;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnGestorCliente = new JButton("Gestor Clientes");
		btnGestorCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clienteControlador.abrirGestorCliente();
			}
		});
		btnGestorCliente.setBounds(132, 101, 177, 23);
		contentPane.add(btnGestorCliente);
		
		JButton btnGestorProducto = new JButton("Gestor Productos");
		btnGestorProducto.setBounds(132, 160, 177, 23);
		contentPane.add(btnGestorProducto);
		
		JLabel lblAlmacen = new JLabel("ALMACEN");
		lblAlmacen.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblAlmacen.setBounds(173, 25, 136, 14);
		contentPane.add(lblAlmacen);
	}
	
	public ClienteControlador getSocioControlador() {
		return clienteControlador;
	}

	public void setClienteControlador(ClienteControlador clienteControlador) {
		this.clienteControlador = clienteControlador;
	}
	
	public ProductoControlador getProductoControlador() {
		return productoControlador;
	}

	public void setProductoControlador(ProductoControlador libroControlador) {
		this.productoControlador = productoControlador;
	}
}
