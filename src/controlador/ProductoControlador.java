package controlador;

import modelo.ProductoModelo;
import vista.FormularioProducto;
import vista.GestorProducto;
import vista.Principal;

public class ProductoControlador {
	
	private Principal principal;
	private ProductoModelo productoModelo;
	private FormularioProducto formularioProducto;
	private GestorProducto gestorProducto;
	public Principal getPrincipal() {
		return principal;
	}
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}
	public ProductoModelo getProductoModelo() {
		return productoModelo;
	}
	public void setProductoModelo(ProductoModelo productoModelo) {
		this.productoModelo = productoModelo;
	}
	public FormularioProducto getFormularioProducto() {
		return formularioProducto;
	}
	public void setFormularioProducto(FormularioProducto formularioProducto) {
		this.formularioProducto = formularioProducto;
	}
	public GestorProducto getGestorProducto() {
		return gestorProducto;
	}
	public void setGestorProducto(GestorProducto gestorProducto) {
		this.gestorProducto = gestorProducto;
	}
	
	
	
	
	
	

}
