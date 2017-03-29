package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ClienteControlador;
import main.Main;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormularioCliente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textoId;
	private JTextField textoNombre;
	private JTextField textoTelefono;
	private JTextField textoDireccion;
	private JTextField textoCodPostal;
	private ClienteControlador clienteControlador;
	private JComboBox listaClientes;
	
	
	public FormularioCliente(GestorCliente padre, boolean modal) {
		super(padre,modal);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JLabel lblId = new JLabel("Id");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNombre = new JLabel("nombre");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblTelefono = new JLabel("telefono");
		lblTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblDireccion = new JLabel("direccion");
		lblDireccion.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblCodPostal = new JLabel("codPostal");
		lblCodPostal.setHorizontalAlignment(SwingConstants.CENTER);
		
		textoId = new JTextField();
		textoId.setHorizontalAlignment(SwingConstants.CENTER);
		textoId.setColumns(10);
		
		textoNombre = new JTextField();
		textoNombre.setHorizontalAlignment(SwingConstants.CENTER);
		textoNombre.setColumns(10);
		
		textoTelefono = new JTextField();
		textoTelefono.setColumns(10);
		
		textoDireccion = new JTextField();
		textoDireccion.setColumns(10);
		
		textoCodPostal = new JTextField();
		textoCodPostal.setColumns(10);
		
		listaClientes = new JComboBox();
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblCodPostal)
								.addComponent(lblDireccion)
								.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(lblId, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblNombre, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(lblTelefono))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(textoTelefono, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
								.addComponent(textoCodPostal, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
								.addComponent(textoDireccion, GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
								.addComponent(textoNombre, GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
								.addComponent(textoId, GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE))
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
							.addComponent(listaClientes, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
							.addGap(103))))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addComponent(listaClientes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblId)
						.addComponent(textoId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre)
						.addComponent(textoNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTelefono)
						.addComponent(textoTelefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDireccion)
						.addComponent(textoDireccion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCodPostal)
						.addComponent(textoCodPostal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(64, Short.MAX_VALUE))
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
						clienteControlador.insertarCliente(textoId.getText(),textoNombre.getText(),textoDireccion.getText(),
						textoCodPostal.getText(),textoTelefono.getText());
						limpiarFormulario();
					}
				});
				btnInsertar.setActionCommand("Insertar");
				buttonPane.add(btnInsertar);
				getRootPane().setDefaultButton(btnInsertar);
			}
			{
				JButton btnCancelar = new JButton("Cancelar");
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						clienteControlador.cerrarFormularioCliente();
					}
				});
				btnCancelar.setActionCommand("Cancelar");
				buttonPane.add(btnCancelar);
			}
		}
	}
	protected void limpiarFormulario() {
		// TODO Auto-generated method stub
		textoId.setText(null);
		textoNombre.setText(null);
		textoDireccion.setText(null);
		textoCodPostal.setText(null);
		textoTelefono.setText(null);
	}
	public ClienteControlador getClienteControlador() {
		return clienteControlador;
	}

	public void setClienteControlador(ClienteControlador clienteControlador) {
		this.clienteControlador = clienteControlador;
	}
	
	
}
