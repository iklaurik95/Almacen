package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import controlador.PedidoControlador;
import modelo.DetallePedido;
import modelo.Pedido;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.JList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ListadoPedido extends JDialog {
	
	private PedidoControlador pedidoControlador;
	
	private final JPanel contentPanel = new JPanel();
	private JTable tablaListadoPedido;
	private JTextField textFieldId;
	private JTextField textFieldNombre;
	private JTextField textFieldDireccion;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable tablaDetallePedido;

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
		
		tablaListadoPedido = new JTable();
		tablaListadoPedido.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				mouseClickedTablaListadoPedido();
				}
		});
		scrollPane.setViewportView(tablaListadoPedido);
		
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
		
		tablaDetallePedido = new JTable();
		scrollPane_1.setViewportView(tablaDetallePedido);
	}
	
	protected void mouseClickedTablaListadoPedido() {
		// TODO Auto-generated method stub
		int lineaSeleccionada = this.tablaListadoPedido.getSelectedRow();
		
		int idPedido = (int)this.tablaListadoPedido.getModel().getValueAt(lineaSeleccionada,0);
		String idCliente = (String)this.tablaListadoPedido.getModel().getValueAt(lineaSeleccionada,1);
		
		this.pedidoControlador.detallesPedidoYCliente(idPedido, idCliente);
	}

	public PedidoControlador getPedidoControlador() {
		return pedidoControlador;
	}

	public void setPedidoControlador(PedidoControlador pedidoControlador) {
		this.pedidoControlador = pedidoControlador;
	}
	
	public void rellenarTablaListadoPedido(ArrayList<Pedido> pedidos) {
		// TODO Auto-generated method stub
		DefaultTableModel tablaModel = new DefaultTableModel();
		tablaModel.setColumnIdentifiers(new Object[] {"ID", "ID CLIENTE","FECHA"});
		for(Pedido pedido : pedidos){
			tablaModel.addRow(new Object[] {pedido.getId(),pedido.getIdCliente(),pedido.getFecha()});
			}
				
		tablaListadoPedido.setModel(tablaModel);
		
		TableRowSorter<DefaultTableModel> modeloOrdenado = new TableRowSorter<DefaultTableModel>(tablaModel);
		tablaListadoPedido.setRowSorter(modeloOrdenado);
	}

	
	public void rellenarTablaDetallePedidosPorPedido(ArrayList<DetallePedido> detallePedidos) {
		// TODO Auto-generated method stub
		DefaultTableModel tablaModel = new DefaultTableModel();
		tablaModel.setColumnIdentifiers(new Object [] {"ID PRODUCTO", "CANTIDAD"});
		for(DetallePedido detallePedido: detallePedidos){
			tablaModel.addRow(new Object[] {detallePedido.getIdProducto(),detallePedido.getCantidad()});
		}
		
		tablaDetallePedido.setModel(tablaModel);
		TableRowSorter<DefaultTableModel> modeloOrdenado = new TableRowSorter<DefaultTableModel>(tablaModel);
		tablaDetallePedido.setRowSorter(modeloOrdenado);	
	}

	
	
}
