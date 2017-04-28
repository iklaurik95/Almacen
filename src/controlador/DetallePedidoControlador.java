package controlador;

import java.util.ArrayList;

import modelo.DetallePedido;
import modelo.DetallePedidoModelo;
import modelo.Producto;
import modelo.ProductoModelo;
import vista.ListadoCliente;

public class DetallePedidoControlador {
	
	private DetallePedidoModelo detallePedidoModelo;
	private ProductoModelo productoModelo;
	private ListadoCliente listadoCliente;
	
	
	public void rellenarTablaDetalle(int idPedido) {
		// TODO Auto-generated method stub
		//obtener detalles de pedido
		ArrayList<DetallePedido> detallePedidos = this.detallePedidoModelo.selectPorPedido(idPedido);
		//rellenar producto a cada pedido 
		for(DetallePedido detallePedido: detallePedidos){
			Producto producto=this.productoModelo.select(detallePedido.getProducto().getNombre());
		}
				//pintar detalles en la tabla(nombre,existencias,precio)
		this.listadoCliente.rellenarTablaDetallesPedido(detallePedidos);
	}


	public DetallePedidoModelo getDetallePedidoModelo() {
		return detallePedidoModelo;
	}


	public void setDetallePedidoModelo(DetallePedidoModelo detallePedidoModelo) {
		this.detallePedidoModelo = detallePedidoModelo;
	}


	public ProductoModelo getProductoModelo() {
		return productoModelo;
	}


	public void setProductoModelo(ProductoModelo productoModelo) {
		this.productoModelo = productoModelo;
	}


	public ListadoCliente getListadoCliente() {
		return listadoCliente;
	}


	public void setListadoCliente(ListadoCliente listadoCliente) {
		this.listadoCliente = listadoCliente;
	}
}
