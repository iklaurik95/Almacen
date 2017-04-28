package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controlador.ClienteControlador;
import controlador.DetallePedidoControlador;
import modelo.Cliente;
import modelo.DetallePedido;
import modelo.Pedido;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class ListadoCliente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable tablaListadoClientes;
	private JTextField textField;
	private JTable tablaDetalles;
	private ClienteControlador clienteControlador;
	private JTable tablaPedidos;
	private DetallePedidoControlador detallePedidoControlador;

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
		scrollPane.setBounds(21, 33, 276, 131);
		contentPanel.add(scrollPane);
		
		tablaListadoClientes = new JTable();
		tablaListadoClientes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				tablaListadoClientesMouseClicked();
			}
		});
		scrollPane.setViewportView(tablaListadoClientes);
		
		JLabel lblListadoClientes = new JLabel("LISTADO CLIENTES");
		lblListadoClientes.setBounds(64, 11, 124, 14);
		contentPanel.add(lblListadoClientes);
		
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
		
		JTable tablaDetallesPedido = new JTable();
		scrollPane_2.setViewportView(tablaDetallesPedido);
		
		JLabel lblDetalles = new JLabel("DETALLES");
		lblDetalles.setBounds(329, 37, 98, 14);
		contentPanel.add(lblDetalles);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(21, 212, 193, 96);
		contentPanel.add(scrollPane_1);
		
		tablaPedidos = new JTable();
		tablaPedidos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				tablaPedidosMouseClicked();
			}
		});
		scrollPane_1.setViewportView(tablaPedidos);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}
	
	

	protected void tablaListadoClientesMouseClicked() {
		int lineaSeleccionada = this.tablaListadoClientes.getSelectedRow();
		
		String idCliente = (String)this.tablaListadoClientes.getModel().getValueAt(lineaSeleccionada, 0);
		
		this.clienteControlador.rellenarTablaPedido(idCliente);
	}
	
	protected void tablaPedidosMouseClicked() {
		// TODO Auto-generated method stub
		int lineaSeleccionada = this.tablaPedidos.getSelectedRow();
		
		int idPedido = (int) this.tablaPedidos.getModel().getValueAt(lineaSeleccionada, 0);
		
		this.detallePedidoControlador.rellenarTablaDetalle(idPedido);
	}

	public DetallePedidoControlador getDetallePedidoControlador() {
		return detallePedidoControlador;
	}



	public void setDetallePedidoControlador(DetallePedidoControlador detallePedidoControlador) {
		this.detallePedidoControlador = detallePedidoControlador;
	}



	public ClienteControlador getClienteControlador() {
		return clienteControlador;
	}

	public void setClienteControlador(ClienteControlador clienteControlador) {
		this.clienteControlador = clienteControlador;
	}
	
	public void rellenarTablaListadoCliente (ArrayList<Cliente> clientes){
		DefaultTableModel tablaModel = new DefaultTableModel();
		tablaModel.setColumnIdentifiers(new Object[] {"ID", "NOMBRE","DIRECCION","COD.POSTAL","TELEFONO"});
		for(Cliente cliente : clientes){
			tablaModel.addRow(new Object[] {cliente.getId(),cliente.getNombre(),cliente.getDireccion(),cliente.getCodPostal(),
			cliente.getTelefono()});
			}
				
		tablaListadoClientes.setModel(tablaModel);
	}
	
	
	public void rellenarTablaPedidoPorCliente(ArrayList<Pedido> pedidos) {
		// TODO Auto-generated method stub
		DefaultTableModel tableModel = new DefaultTableModel();
		tableModel.setColumnIdentifiers(new Object[] {"ID PEDIDO","FECHA"});
		 
		for(Pedido pedido:pedidos){
			tableModel.addRow(new Object[]{pedido.getId(),pedido.getFecha()});
		
			
		}
		tablaPedidos.setModel(tableModel);
	}	

	public void rellenarTablaDetallesPedido(ArrayList<DetallePedido> detallePedidos) {
		// TODO Auto-generated method stub
		DefaultTableModel tableModel = new DefaultTableModel();
		tableModel.setColumnIdentifiers(new Object[] {"NOMBRE","EXISTENCIAS","PRECIO"});
		
		for(DetallePedido detallePedido:detallePedidos){
			tableModel.addRow(new Object[] {detallePedido.getProducto().getNombre(),detallePedido.getProducto().getExistencias(),detallePedido.getProducto().getPrecio()});
		}
		
		tablaDetalles.setModel(tableModel);
	}
	
}
