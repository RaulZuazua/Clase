package Examen;

import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;

public class DAO extends Conexion {

	
	//TODO: METODO INSERTAR
	
	
	public  void insertar(Pais pais) {
		
		
		conectar();
		java.sql.PreparedStatement pst = null;
		
		try {
			
			pst =conexion.prepareStatement("INSERT INTO COUNTRIES values(?, ?, ?)");
		
			pst.setString(1, pais.getPais_id());
			pst.setString(2, pais.getNombre_pais());
			pst.setInt(3, pais.getRegion_id());
			pst.executeUpdate();
			
		
		}catch (SQLIntegrityConstraintViolationException e3) {
			
			JOptionPane.showMessageDialog(null, "Error de integridad referencial, el campo clave ya existe");
		
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
		java.sql.PreparedStatement pst = null;
		
		try {
			
			pst =conexion.prepareStatement("DELETE FROM COUNTRIES WHERE COUNTRY_ID=?");
		
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
		java.sql.PreparedStatement pst = null;

		try {

			pst = conexion.prepareStatement("UPDATE COUNTRIES SET COUNTRY_NAME = ?, REGION_ID= ? WHERE COUNTRY_ID=? ");

			pst.setString(1, pais.getNombre_pais());
			pst.setInt(2, pais.getRegion_id());
			pst.setString(3, pais.getPais_id());
			pst.executeUpdate();

		} catch (SQLException e) {

			JOptionPane.showMessageDialog(null, "Se ha producido un error en el metodo Modificar");
			e.printStackTrace();

		} finally {

			cerrarConexion();
		}

	}
	
	
	
	//:TODO METODO LISTAR TODO
	
	
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
	
	
	
	//TODO: METODO CONSULTAR PAISES
	
	
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
	
	
	
	
	//TODO: CONSULTAR PAIS POR ID
	
	
	
	public Pais Consulta_PAIS_ID(String pais_id) {

		Pais pais= new Pais();
		java.sql.PreparedStatement pst = null;
		conectar();

		try {
			

			pst = conexion.prepareStatement("SELECT * FROM COUNTRIES WHERE COUNTRY_ID=?");
			
			pst.setString(1,pais_id );
			ResultSet resul = pst.executeQuery();
			
			while (resul.next()) {

				
				pais.setPais_id(resul.getString("COUNTRY_ID"));
				pais.setNombre_pais(resul.getString("COUNTRY_NAME"));
				pais.setRegion_id(resul.getInt("REGION_ID"));
				

			}

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Se ha producido un errorRRRRRRRRRRRRRRRR en la Consulta");
			e.printStackTrace();

		} finally {

			cerrarConexion();
		}

		return pais;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
