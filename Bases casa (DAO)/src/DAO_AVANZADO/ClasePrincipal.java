package DAO_AVANZADO;

import java.util.ArrayList;

public class ClasePrincipal {

	public static void main(String[] args) {
		
		ArrayList<Pais> lista=new ArrayList<>();
		DAOpaises DAO= new DAOpaises();
		
		lista=DAO.listar();
		
		
		System.out.println("Pais_ID       Nombre_Pais       Region_ID      ");
		
		for (int i = 0; i < lista.size(); i++) {
			
			
			System.out.print(lista.get(i).toString() + " \n");
			
		}
		
		
		
	}

}
