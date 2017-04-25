 package modelo;


import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;



public class ClienteModelo extends Conector{
	
	public ArrayList<Cliente> selectAll(){
		
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		try{
			Statement st = this.conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from clientes");
			while(rs.next()){
				clientes.add(new Cliente(rs.getString("id"),rs.getString("nombre"),rs.getString("direccion"),rs.getString("codPostal"),rs.getString("telefono")));
			}
		}catch (SQLException e){
			e.printStackTrace();
		}
		return clientes;
	}
	

	public Cliente select(String idCliente) {
		try {
			Statement st = this.conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from clientes where id='" + idCliente + "'");
			rs.next();
			Cliente cliente = new Cliente((idCliente), rs.getString("nombre"), rs.getString("direccion"),rs.getString("codPostal"), rs.getString("telefono"));
			return cliente;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void update(Cliente cliente) {
		
	}
	
	public void insert(Cliente cliente){
		Statement st;
		try {
			st = super.getConexion().createStatement();
			System.out.println("INSERT INTO socios (id,nombre,direccion,codPostal,telefono) " 
			+ "VALUES ('" + cliente.getId() + "','" + cliente.getNombre() + "','" + cliente.getDireccion() + "','" + cliente.getCodPostal() + "','" + cliente.getTelefono() + "')");
			
			st.execute("INSERT INTO socios (id,nombre,direccion,codPostal,telefono) " + "VALUES ('" + cliente.getId() + "','"
			+ cliente.getNombre() + "','" + cliente.getNombre() + "','"	+ cliente.getCodPostal() + "','" + cliente.getTelefono() + "')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void delete(String idCliente) {
		try {
			Statement st = super.getConexion().createStatement();
			st.execute("DELETE FROM clientes " + "WHERE id= ('" + idCliente + "')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	}
