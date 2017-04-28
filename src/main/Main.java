package main;

import controlador.ClienteControlador;
import controlador.DetallePedidoControlador;
import controlador.PedidoControlador;
import controlador.ProductoControlador;
import modelo.ClienteModelo;
import modelo.DetallePedidoModelo;
import modelo.PedidoModelo;
import modelo.ProductoModelo;
import vista.BorradoCliente;
import vista.FormularioCliente;
import vista.FormularioProducto;
import vista.GestorCliente;
import vista.GestorPedido;
import vista.GestorProducto;
import vista.ListadoCliente;
import vista.ListadoPedido;
import vista.Principal;

public class Main {
	
	public static void main(String[] args) {
		//TODO ondorengo komentarioeta jartzen duena bete
		
		//kontroladore eta modeloen instantziak sortu
		ClienteControlador clienteControlador = new ClienteControlador();
		ProductoControlador productoControlador = new ProductoControlador();
		PedidoControlador pedidoControlador = new PedidoControlador();
		DetallePedidoControlador detallePedidoControlador = new DetallePedidoControlador();
				
		//lehioak sortu
		ClienteModelo clienteModelo = new ClienteModelo();
		ProductoModelo productoModelo = new ProductoModelo();
		PedidoModelo pedidoModelo = new PedidoModelo();
		DetallePedidoModelo detallePedidoModelo = new DetallePedidoModelo();
		
		//leihoei controladoreak ezarri
		Principal principal = new Principal();
		GestorCliente gestorCliente = new GestorCliente(principal,true);
		GestorProducto gestorProducto = new GestorProducto(principal,true);
		GestorPedido gestorPedido = new GestorPedido(principal,true);
		FormularioCliente formularioCliente = new FormularioCliente(gestorCliente,true);
		FormularioProducto formularioProducto = new FormularioProducto(gestorProducto,true);
		BorradoCliente borradoCliente = new BorradoCliente (gestorCliente,true);
		ListadoPedido listadoPedido = new ListadoPedido(gestorPedido, true);
		ListadoCliente listadoCliente = new ListadoCliente(gestorCliente,true);
		
		//controladoreei modelo eta lehioak ezarri
		principal.setClienteControlador(clienteControlador);
		principal.setProductoControlador(productoControlador);
		principal.setPedidoControlador(pedidoControlador);
		formularioCliente.setClienteControlador(clienteControlador);
		formularioProducto.setProductoControlador(productoControlador);
		gestorCliente.setClienteControlador(clienteControlador);
		gestorProducto.setProductoControlador(productoControlador);
		gestorPedido.setPedidoControlador(pedidoControlador);
		borradoCliente.setClienteControlador(clienteControlador);
		listadoPedido.setPedidoControlador(pedidoControlador);
		listadoCliente.setClienteControlador(clienteControlador);
		listadoCliente.setDetallePedidoControlador(detallePedidoControlador);
		
		clienteControlador.setPrincipal(principal);
		clienteControlador.setGestorCliente(gestorCliente);
		clienteControlador.setFormularioCliente(formularioCliente);
		clienteControlador.setBorradoCliente(borradoCliente);
		clienteControlador.setClienteModelo(clienteModelo);
		clienteControlador.setListadoCliente(listadoCliente);
		clienteControlador.setPedidoModelo(pedidoModelo);
		
		productoControlador.setPrincipal(principal);
		productoControlador.setFormularioProducto(formularioProducto);
		productoControlador.setGestorProducto(gestorProducto);
		productoControlador.setProductoModelo(productoModelo);
		
		pedidoControlador.setPrincipal(principal);
		pedidoControlador.setGestorPedido(gestorPedido);
		pedidoControlador.setListadoPedido(listadoPedido);
		pedidoControlador.setPedidoModelo(pedidoModelo);
		pedidoControlador.setDetallePedidoModelo(detallePedidoModelo);
		
		detallePedidoControlador.setListadoCliente(listadoCliente);
		detallePedidoControlador.setDetallePedidoModelo(detallePedidoModelo);
		detallePedidoControlador.setProductoModelo(productoModelo);
		
		principal.setVisible(true);
		
	}

}
