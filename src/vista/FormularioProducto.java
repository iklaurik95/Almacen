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
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormularioProducto extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldNumExistencias;
	private JTextField textFieldProveedor;
	private JTextField textFieldNombre;
	private JTextField textFieldPrecio;
	private ProductoControlador productoControlador;

		
	public FormularioProducto(GestorProducto padre,boolean modal) {
		super(padre,modal);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JLabel lblNombre = new JLabel("Nombre:");
		
		JLabel lblProveedor = new JLabel("Proveedor:");
		
		JLabel lblPrecio = new JLabel("Precio:");
		
		JLabel lblNumExistencias = new JLabel("Num. existencias:");
		
		textFieldNumExistencias = new JTextField();
		textFieldNumExistencias.setColumns(10);
		
		textFieldPrecio = new JTextField();
		textFieldPrecio.setColumns(10);
		
		textFieldProveedor = new JTextField();
		textFieldProveedor.setColumns(10);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setColumns(10);
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap(99, Short.MAX_VALUE)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNumExistencias)
						.addComponent(lblPrecio)
						.addComponent(lblProveedor)
						.addComponent(lblNombre))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(textFieldProveedor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldPrecio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldNumExistencias, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(88))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
					.addContainerGap(38, Short.MAX_VALUE)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre)
						.addComponent(textFieldNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblProveedor)
						.addComponent(textFieldProveedor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPrecio)
						.addComponent(textFieldPrecio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNumExistencias)
						.addComponent(textFieldNumExistencias, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28))
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnInsertar = new JButton("Insertar");
				btnInsertar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						//TODO
					}
				});
				btnInsertar.setActionCommand("Guardar");
				buttonPane.add(btnInsertar);
				getRootPane().setDefaultButton(btnInsertar);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//TODO
					}
				});
				cancelButton.setActionCommand("Cancelar");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	public ProductoControlador getProductoControlador() {
		return productoControlador;
	}

	public void setProductoControlador(ProductoControlador productoControlador) {
		this.productoControlador = productoControlador;
	}
}
