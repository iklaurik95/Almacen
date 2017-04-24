 package controlador;

import java.util.ArrayList;

import modelo.Cliente;
import modelo.ClienteModelo;
import vista.BorradoCliente;
import vista.FormularioCliente;
import vista.GestorCliente;
import vista.Principal;


public class ClienteControlador {
		
	private Principal principal;
	private ClienteModelo clienteModelo;
	private FormularioCliente formularioCliente;
	private GestorCliente gestorCliente;
	private BorradoCliente borradoCliente;
	
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
		//Cliente cliente = new Cliente(id,nombre,direccion,codPostal,telefono);
		//clienteModelo.insert(cliente);
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
	public void eliminarCliente() {
		// TODO Auto-generated method stub
		//ArrayList<Cliente> clientes = clienteModelo.delete();
		
		
	}
	
	
}
	
	