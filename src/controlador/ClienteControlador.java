 package controlador;

import java.util.ArrayList;

import modelo.Cliente;
import modelo.ClienteModelo;
import modelo.DetallePedido;
import modelo.DetallePedidoModelo;
import modelo.Pedido;
import modelo.PedidoModelo;
import vista.BorradoCliente;
import vista.FormularioCliente;
import vista.GestorCliente;
import vista.ListadoCliente;
import vista.Principal;


public class ClienteControlador {
		
	private Principal principal;
	private ClienteModelo clienteModelo;
	private FormularioCliente formularioCliente;
	private GestorCliente gestorCliente;
	private BorradoCliente borradoCliente;
	private ListadoCliente listadoCliente;
	private PedidoModelo pedidoModelo;

	
	public PedidoModelo getPedidoModelo() {
		return pedidoModelo;
	}
	public void setPedidoModelo(PedidoModelo pedidoModelo) {
		this.pedidoModelo = pedidoModelo;
	}
	public BorradoCliente getBorradoCliente() {
		return borradoCliente;
	}
	public void setBorradoCliente(BorradoCliente borradoCliente) {
		this.borradoCliente = borradoCliente;
	}
	public Principal getPrincipal() {
		return principal;
	}
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}
	public ClienteModelo getClienteModelo() {
		return clienteModelo;
	}
	public void setClienteModelo(ClienteModelo clienteModelo) {
		this.clienteModelo = clienteModelo;
	}
	
	public FormularioCliente getFormularioCliente() {
		return formularioCliente;
	}
	public void setFormularioCliente(FormularioCliente formularioCliente) {
		this.formularioCliente = formularioCliente;
	}
	
	public GestorCliente getGestorCliente() {
		return gestorCliente;
	}
	public void setGestorCliente(GestorCliente gestorCliente) {
		this.gestorCliente = gestorCliente;
	}
	public void abrirFormularioCliente() {
		// TODO Auto-generated method stub
		this.formularioCliente.setVisible(true);
	}
	public void insertarCliente(String id, String nombre, String direccion, String codPostal, String telefono) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente(id,nombre,direccion,codPostal,telefono);
		clienteModelo.insert(cliente);
	}
	public void abrirGestorCliente() {
		// TODO Auto-generated method stub
		this.gestorCliente.setVisible(true);
	}
	public void cerrarFormularioCliente() {
		// TODO Auto-generated method stub
		this.formularioCliente.dispose();
	}
	public void abrirBorradoCliente() {
		// TODO Auto-generated method stub
		this.borradoCliente.setVisible(true);
	}
	public void rellenarBorradoCliente(String idCliente) {
		// TODO Auto-generated method stub
		Cliente cliente = clienteModelo.select(idCliente);
		this.borradoCliente.rellenarDatosBorradoCliente(cliente);
	}
	public void eliminarCliente(String idCliente) {
		// TODO Auto-generated method stub
		this.clienteModelo.delete(idCliente);
	}
	
	public ListadoCliente getListadoCliente() {
		return listadoCliente;
	}
	public void setListadoCliente(ListadoCliente listadoCliente) {
		this.listadoCliente = listadoCliente;
	}
	public void abrirListadoCliente() {
		// TODO Auto-generated method stub
		ArrayList<Cliente> clientes = this.clienteModelo.selectAll();
		listadoCliente.rellenarTablaListadoCliente(clientes);
		
		this.listadoCliente.setVisible(true);
	}
	public void rellenarTablaPedido(String idCliente) {
		// TODO Auto-generated method stub
		ArrayList<Pedido> pedidos = this.pedidoModelo.selectPorCliente(idCliente);
		
		listadoCliente.rellenarTablaPedidoPorCliente(pedidos);
	}
	
}
	
	