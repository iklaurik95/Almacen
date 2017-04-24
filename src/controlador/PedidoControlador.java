package controlador;

import modelo.PedidoModelo;
import vista.GestorPedido;
import vista.ListadoPedido;
import vista.Principal;

public class PedidoControlador {
	
	private Principal principal;
	private PedidoModelo pedidoModelo;
	private GestorPedido gestorPedido;
	private ListadoPedido listadoPedido;
	public Principal getPrincipal() {
		return principal;
	}
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}
	public PedidoModelo getPedidoModelo() {
		return pedidoModelo;
	}
	public void setPedidoModelo(PedidoModelo pedidoModelo) {
		this.pedidoModelo = pedidoModelo;
	}
	public GestorPedido getGestorPedido() {
		return gestorPedido;
	}
	public void setGestorPedido(GestorPedido gestorPedido) {
		this.gestorPedido = gestorPedido;
	}
	public ListadoPedido getListadoPedido() {
		return listadoPedido;
	}
	public void setListadoPedido(ListadoPedido listadoPedido) {
		this.listadoPedido = listadoPedido;
	}
	public void abrirGestorPedido() {
		// TODO Auto-generated method stub
		this.gestorPedido.setVisible(true);
	}
	public void abrirListadoPedido() {
		// TODO Auto-generated method stub
		
		
		this.listadoPedido.setVisible(true);
	}
	
	
}
