package modelo;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
	private int id;
	private String idCliente;
	private String codPostal;
	private Date fecha;
	private Cliente cliente;
	private ArrayList<DetallePedido> detallePedidos;
	
	
	public Pedido() {
		super();
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}


	public String getCodPostal() {
		return codPostal;
	}
	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<DetallePedido> getDetallePedidos() {
		return detallePedidos;
	}

	public void setDetallePedido(ArrayList<DetallePedido> detallePedidos) {
		this.detallePedidos = detallePedidos;
	}
	
	
}
