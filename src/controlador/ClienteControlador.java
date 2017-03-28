 package controlador;

import modelo.Cliente;
import modelo.ClienteModelo;
import vista.FormularioCliente;
import vista.GestorCliente;
import vista.Principal;


public class ClienteControlador {
		
	private Principal principal;
	private ClienteModelo clienteModelo;
	private FormularioCliente clienteFormulario;
	private GestorCliente gestorCliente;
	
	
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
	public FormularioCliente getClienteFormulario() {
		return clienteFormulario;
	}
	public void setClienteFormulario(FormularioCliente clienteFormulario) {
		this.clienteFormulario = clienteFormulario;
	}
	public GestorCliente getGestorCliente() {
		return gestorCliente;
	}
	public void setGestorCliente(GestorCliente gestorCliente) {
		this.gestorCliente = gestorCliente;
	}
	public void abrirFormularioCliente() {
		// TODO Auto-generated method stub
		this.clienteFormulario.setVisible(true);
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
		this.clienteFormulario.dispose();
	}
}
