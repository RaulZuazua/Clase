package DAO_AVANZADO;

import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;

public class Conexion {
	
	static java.sql.Connection conexion;
	
	//:TODO JDBC driver , nombre y base de datos a la que conectarnos
	
	private final String driver_oracle="oracle.jdbc.driver.OracleDriver";
	private final String db_url= "jdbc:oracle:thin:@localhost:1521:xe";
	
	
	//:TODO Credenciales Base de datos
	
	private final String USER="HR";
	private final String PASS="oracle";
	
	
	
	//TODO: CONECTAR
	
	public void conectar(){
		
		try {
			
			conexion =DriverManager.getConnection(db_url, USER, PASS);
			Class.forName(driver_oracle);
			
			
			
		} catch (Exception e) {
			
			JOptionPane.showMessageDialog(null, "Error en la conexion");
			e.printStackTrace();
		}
		
		
	}
	
	
	//:TODO CERRAR CONEXION
	
	public void cerrarConexion(){
		
		if (conexion != null){
			
			try {
				
				if(!conexion.isClosed()){
					
					conexion.close();
					
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	
	
	
	
	
}
