package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ProductoControlador;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestorProducto extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private ProductoControlador productoControlador;

	
	public GestorProducto(Principal principal,boolean modal) {
		super(principal,modal);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JButton btnProductoNuevo = new JButton("Producto Nuevo");
		btnProductoNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(161)
					.addComponent(btnProductoNuevo))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(79)
					.addComponent(btnProductoNuevo))
		);
		contentPanel.setLayout(gl_contentPanel);
	}
	
	public ProductoControlador getProductoControlador() {
		return productoControlador;
	}


	public void setProductoControlador(ProductoControlador productoControlador) {
		this.productoControlador = productoControlador;
	}
}
