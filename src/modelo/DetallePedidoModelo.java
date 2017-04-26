package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DetallePedidoModelo extends Conector{
	
	public  ArrayList<DetallePedido> selectPorPedido (int idPedido) {
		
		ArrayList<DetallePedido> detallePedidos = new ArrayList<DetallePedido>();
		
			Statement st;
			try {
				st = this.conexion.createStatement();
				ResultSet rs = st.executeQuery("SELECT * FROM detallespedidos WHERE idPedido='" + idPedido + "'");
				
				while (rs.next()){
					DetallePedido detallePedido = new DetallePedido();
					
					detallePedido.setIdPedido(rs.getInt("idPedido"));
					detallePedido.setIdProducto(rs.getInt("idProducto"));
					detallePedido.setCantidad(rs.getInt("cantidad"));
					
					detallePedidos.add(detallePedido);
					
				}
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return detallePedidos;

	}
	
	public  ArrayList<DetallePedido> selectPorCliente (String idCliente){
		
		ArrayList<DetallePedido> detallePedidos = new ArrayList<DetallePedido>();
		
		Statement st;
		
		try {
			st = this.conexion.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM detallespedidos WHERE id='" + idCliente + "'");
			
			while(rs.next()){
				DetallePedido detallePedido = new DetallePedido();
				
				detallePedido.setIdPedido(rs.getInt("idPedido"));
				detallePedido.setIdProducto(rs.getInt("idProducto"));
				detallePedido.setCantidad(rs.getInt("cantidad"));
				
				detallePedidos.add(detallePedido);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return detallePedidos;
			
		
	}
	
}