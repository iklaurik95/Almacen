package controlador;

import java.util.ArrayList;

import modelo.DetallePedido;
import modelo.DetallePedidoModelo;
import modelo.Pedido;
import modelo.PedidoModelo;
import vista.GestorPedido;
import vista.ListadoPedido;
import vista.Principal;

public class PedidoControlador {
	
	private Principal principal;
	private PedidoModelo pedidoModelo;
	private GestorPedido gestorPedido;
	private ListadoPedido listadoPedido;
	private DetallePedidoModelo detallePedidoModelo;
	
	public Principal getPrincipal() {
		return principal;
	}
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}
	public PedidoModelo getPedidoModelo() {
		return pedidoModelo;
	}
	public DetallePedidoModelo getDetallePedidoModelo() {
		return detallePedidoModelo;
	}
	public void setDetallePedidoModelo(DetallePedidoModelo detallePedidoModelo) {
		this.detallePedidoModelo = detallePedidoModelo;
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
		
		ArrayList<Pedido> pedidos = this.pedidoModelo.selectAll();
		listadoPedido.rellenarTablaListadoPedido(pedidos);
		
		this.listadoPedido.setVisible(true);
		
	}
	public void detallesPedidoYCliente(int idPedido, String idCliente) {
		// TODO Auto-generated method stub
		
		//idPedidoarekin detallePedido lortu
		ArrayList<DetallePedido> detallePedidos = this.detallePedidoModelo.selectPorPedido(idPedido);
		listadoPedido.rellenarTablaDetallePedidos(detallePedidos);
		
		//idCliente detallePedido lortu
	}
	
	
}
