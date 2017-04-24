package modelo;

public class DetallePedido {
	
	private int idPedido;
	private int idProducto;
	private int cantidad;
	private Producto producto;
		
	

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public DetallePedido() {
		super();
	}
	
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Producto getProducto() {
		return producto;
	}
	
}
