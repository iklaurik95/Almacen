package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PedidoModelo extends Conector{
	
	public ArrayList<Pedido> selectAll(){
		
		ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
		try{
			Statement st = this.conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from pedidos");
			while(rs.next()){
				Pedido pedido =  new Pedido();
				pedido.setId(rs.getInt("id"));
				pedido.setIdCliente(rs.getString("idCliente"));
				pedido.setFecha(rs.getDate("fecha"));
				
				pedidos.add(pedido);
						
			}
			return pedidos;
		}catch (SQLException e){
			e.printStackTrace();
		}
		return null;
	}
}
