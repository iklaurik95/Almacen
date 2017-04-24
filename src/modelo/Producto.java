
package modelo;

import java.util.ArrayList;

public class Producto {
	//TODO crear atributos getters setters y constructor
		private int existencias;
		private int id;
		private String nombre;
		private double precio;
		private String proveedor;
		private ArrayList<DetallePedido> detallePedidos;
		
		public Producto() {
			super();
			
		}
		
		public int getExistencias() {
			return existencias;
		}
		
		public void setExistencias(int existencias) {
			this.existencias = existencias;
		}
		
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		
		public String getNombre() {
			return nombre;
		}
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public double getPrecio() {
			return precio;
		}
		
		public void setPrecio(double precio) {
			this.precio = precio;
		}
		
		public String getProveedor() {
			return proveedor;
		}
		
		public void setProveedor(String proveedor) {
			this.proveedor = proveedor;
		}

		public ArrayList<DetallePedido> getDetallePedidos() {
			return detallePedidos;
		}

		public void setDetallePedidos(ArrayList<DetallePedido> detallePedidos) {
			this.detallePedidos = detallePedidos;
		}

}
