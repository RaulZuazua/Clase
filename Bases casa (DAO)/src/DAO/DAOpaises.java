package DAO;

import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;

public class DAOpaises extends Conexion {

	
	//TODO: METODO INSERTAR
	
	
	public  void insertar(Pais pais) {
		
		
		conectar();
		PreparedStatement pst = null;
		try {
			
			pst = (PreparedStatement) this.conexion.prepareStatement("INSERT INTO COUNTRIES values(pais_id?, pais_nombre?, region_id?)");
		
			pst.setString(1, pais.getPais_id());
			pst.setString(2, pais.getNombre_pais());
			pst.setInt(3, pais.getRegion_id());
			pst.executeUpdate();
			
		} catch (SQLException e) {
			
			JOptionPane.showMessageDialog(null, "Se ha producido un error en el metodo Insertar");
			e.printStackTrace();
			
		}finally {
			
			cerrarConexion();
		}
		
	}
	
	
	
	
	//TODO: METODO ELIMINAR
	
	
	public  void eliminar (Pais pais){
		
		
		conectar();
		PreparedStatement pst = null;
		
		try {
			
			pst = (PreparedStatement) this.conexion.prepareStatement("DELETE FROM COUNTRIES WHERE PAIS_ID=?");
		
			pst.setString(1, pais.getPais_id());
			pst.executeUpdate();
			
		} catch (SQLException e) {
			
			JOptionPane.showMessageDialog(null, "Se ha producido un error en el metodo Eliminar");
			e.printStackTrace();
			
		}finally {
			
			cerrarConexion();
		}
		
		
	}
	
	
	
	
	
	//TODO: METODO MODIFICAR
	
	
	public void MODIFICAR(Pais pais) {

		conectar();
		PreparedStatement pst = null;

		try {

			pst = (PreparedStatement) this.conexion.prepareStatement("UPDATE COUNTRIES SET ");

			pst.setString(1, pais.getPais_id());
			pst.executeUpdate();

		} catch (SQLException e) {

			JOptionPane.showMessageDialog(null, "Se ha producido un error en el metodo Modificar");
			e.printStackTrace();

		} finally {

			cerrarConexion();
		}

	}
	
	
	
	
	
	
	public  ArrayList<Pais> listar(){
		
		ArrayList<Pais> lista =new ArrayList();
		java.sql.PreparedStatement pst = null;
		conectar();
		
		try{
			
			
			
			pst = conexion.prepareStatement("SELECT * FROM COUNTRIES");
			
			ResultSet resul = pst.executeQuery();
			
			while(resul.next()){
				
				Pais pais= new Pais(); 
				pais.setPais_id(resul.getString("COUNTRY_ID"));
				pais.setNombre_pais(resul.getString("COUNTRY_NAME"));
				pais.setRegion_id(resul.getInt("REGION_ID"));
				lista.add(pais);
				
			}
			
		}catch (Exception e) {
			
			JOptionPane.showMessageDialog(null, "Se ha producido un error en el metodo Listar");
			e.printStackTrace();
		
		}finally {
			
			cerrarConexion();
		}
		
		
		return lista;
		

	}
	
	
	
	
	
	public ArrayList<Pais> Consulta_Paises(String nombre_pais) {

		ArrayList<Pais> lista = new ArrayList();
		java.sql.PreparedStatement pst = null;
		conectar();

		try {
			

			pst = conexion.prepareStatement("SELECT * FROM COUNTRIES WHERE COUNTRY_NAME=?");
			
			pst.setString(1,nombre_pais );
			ResultSet resul = pst.executeQuery();
			
			while (resul.next()) {

				Pais pais = new Pais();
				pais.setPais_id(resul.getString("COUNTRY_ID"));
				pais.setNombre_pais(resul.getString("COUNTRY_NAME"));
				pais.setRegion_id(resul.getInt("REGION_ID"));
				lista.add(pais);

			}

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Se ha producido un errorRRRRRRRRRRRRRRRR en la Consulta");
			e.printStackTrace();

		} finally {

			cerrarConexion();
		}

		return lista;

	}
	
	
	
	
	
	
	
	
	
	
	
}
