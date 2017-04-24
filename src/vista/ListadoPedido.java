package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.PedidoControlador;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.JList;

public class ListadoPedido extends JDialog {
	
	private PedidoControlador pedidoControlador;
	
	private final JPanel contentPanel = new JPanel();
	private JTable tablaListadoPedidos;
	private JTextField textFieldId;
	private JTextField textFieldNombre;
	private JTextField textFieldDireccion;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable tablaPedido;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the dialog.
	 */
	public ListadoPedido(GestorPedido gestorPedido,boolean modal) {
		super(gestorPedido,modal);
		setBounds(100, 100, 526, 408);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 41, 208, 124);
		contentPanel.add(scrollPane);
		
		tablaListadoPedidos = new JTable();
		scrollPane.setViewportView(tablaListadoPedidos);
		
		JLabel lblListadoPedidos = new JLabel("LISTADO PEDIDOS");
		lblListadoPedidos.setBounds(57, 11, 149, 14);
		contentPanel.add(lblListadoPedidos);
		
		JLabel lblCliente = new JLabel("CLIENTE");
		lblCliente.setBounds(391, 75, 46, 14);
		contentPanel.add(lblCliente);
		
		JLabel lblId = new JLabel("Id:");
		lblId.setBounds(328, 103, 33, 14);
		contentPanel.add(lblId);
		
		textFieldId = new JTextField();
		textFieldId.setBounds(371, 100, 86, 20);
		contentPanel.add(textFieldId);
		textFieldId.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(308, 134, 55, 14);
		contentPanel.add(lblNombre);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(371, 131, 86, 20);
		contentPanel.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(306, 173, 55, 14);
		contentPanel.add(lblDireccion);
		
		textFieldDireccion = new JTextField();
		textFieldDireccion.setBounds(371, 170, 86, 20);
		contentPanel.add(textFieldDireccion);
		textFieldDireccion.setColumns(10);
		
		JLabel lblCodPostal = new JLabel("CodPostal:");
		lblCodPostal.setBounds(306, 209, 55, 14);
		contentPanel.add(lblCodPostal);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(371, 206, 86, 20);
		contentPanel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(371, 248, 86, 20);
		contentPanel.add(textField_4);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(306, 251, 55, 14);
		contentPanel.add(lblTelefono);
		
		JLabel lblDetallesPedidoCliente = new JLabel("PEDIDO");
		lblDetallesPedidoCliente.setBounds(90, 186, 61, 14);
		contentPanel.add(lblDetallesPedidoCliente);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(34, 212, 185, 127);
		contentPanel.add(scrollPane_1);
		
		tablaPedido = new JTable();
		scrollPane_1.setViewportView(tablaPedido);
	}
	
	public PedidoControlador getPedidoControlador() {
		return pedidoControlador;
	}

	public void setPedidoControlador(PedidoControlador pedidoControlador) {
		this.pedidoControlador = pedidoControlador;
	}
}