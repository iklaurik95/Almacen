package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ClienteControlador;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ListadoCliente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private JTable table_1;
	private JTextField textField;
	private JTable table_2;
	private ClienteControlador clienteControlador;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the dialog.
	 */
	public ListadoCliente(GestorCliente gestorCliente, boolean modal) {
		super(gestorCliente,modal);
		setBounds(100, 100, 491, 368);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 33, 193, 113);
		contentPanel.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				tableMouseClicked();
			}
		});
		scrollPane.setViewportView(table);
		
		JLabel lblListadoClientes = new JLabel("LISTADO CLIENTES");
		lblListadoClientes.setBounds(64, 11, 124, 14);
		contentPanel.add(lblListadoClientes);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(26, 200, 191, 92);
		contentPanel.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		
		JLabel lblPedidos = new JLabel("PEDIDOS");
		lblPedidos.setBounds(90, 175, 82, 14);
		contentPanel.add(lblPedidos);
		
		textField = new JTextField();
		textField.setBounds(320, 271, 107, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(264, 274, 52, 14);
		contentPanel.add(lblPrecio);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(307, 65, 120, 151);
		contentPanel.add(scrollPane_2);
		
		table_2 = new JTable();
		scrollPane_2.setViewportView(table_2);
		
		JLabel lblDetalles = new JLabel("DETALLES");
		lblDetalles.setBounds(329, 37, 98, 14);
		contentPanel.add(lblDetalles);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}
	
	protected void tableMouseClicked() {
		
		
		
	}

	public ClienteControlador getClienteControlador() {
		return clienteControlador;
	}

	public void setClienteControlador(ClienteControlador clienteControlador) {
		this.clienteControlador = clienteControlador;
	}

}
