package main;

import controlador.ClienteControlador;
import controlador.ProductoControlador;
import modelo.ClienteModelo;
import modelo.ProductoModelo;
import vista.BorradoCliente;
import vista.FormularioCliente;
import vista.FormularioProducto;
import vista.GestorCliente;
import vista.GestorProducto;
import vista.Principal;

public class Main {
	
	public static void main(String[] args) {
		//TODO ondorengo komentarioeta jartzen duena bete
		
		//kontroladore eta modeloen instantziak sortu
		ClienteControlador clienteControlador = new ClienteControlador();
		ProductoControlador productoControlador = new ProductoControlador();
				
		//lehioak sortu
		ClienteModelo clienteModelo = new ClienteModelo();
		ProductoModelo productoModelo = new ProductoModelo();
		
		//leihoei controladoreak ezarri
		Principal principal = new Principal();
		GestorCliente gestorCliente = new GestorCliente(principal,true);
		GestorProducto gestorProducto = new GestorProducto(principal,true);
		FormularioCliente formularioCliente = new FormularioCliente(gestorCliente,true);
		FormularioProducto formularioProducto = new FormularioProducto(gestorProducto,true);
		BorradoCliente borradoCliente = new BorradoCliente (gestorCliente,true);
		
		//controladoreei modelo eta lehioak ezarri
		principal.setClienteControlador(clienteControlador);
		principal.setProductoControlador(productoControlador);
		formularioCliente.setClienteControlador(clienteControlador);
		formularioProducto.setProductoControlador(productoControlador);
		gestorCliente.setClienteControlador(clienteControlador);
		gestorProducto.setProductoControlador(productoControlador);
		borradoCliente.setClienteControlador(clienteControlador);
		
		clienteControlador.setPrincipal(principal);
		clienteControlador.setGestorCliente(gestorCliente);
		clienteControlador.setFormularioCliente(formularioCliente);
		clienteControlador.setBorradoCliente(borradoCliente);
		
		
		
		principal.setVisible(true);
		
	}

}
