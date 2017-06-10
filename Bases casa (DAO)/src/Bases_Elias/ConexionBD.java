package Bases_Elias;

//PASO 1. Importar los paquetes necesarios
import java.sql.*;
import java.util.Scanner;

import javax.sql.DataSource;
// region="1' UNION SELECT first_name,email,salary FROM EMPLOYEES--";

public class ConexionBD {
	// Nombre driver JDBC y URL de Base de Datos
	static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";

	// Credenciales de la base de datos
	static final String USER = "hr";
	static final String PASS = "oracle";

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt=null;
		try {
			// PASO 2: Registrar driver JDBC oracle
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Class.forName("com.mysql.jdbc.Driver");

			// PASO 3: Abrir una conexion
			System.out.println("Conectando a la Base de Datos...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// PASO 4: Ejecutar una consulta
			System.out.println("Creando sentencia...");
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

			String sql;
			System.out.println("Introduce la region");
			String region = teclado.nextLine();
			sql = "SELECT * from countries where region_id='" + region + "'";
			ResultSet rs = stmt.executeQuery(sql);
			// 'OR 'A'='A
			// PASO 5: Extraer los datos del result set
			while (rs.next()) {
				// Recuperamos por nombre de columna
				String pais_id = rs.getString(1);
				int region_id = rs.getInt(3);
				String pais = rs.getString(2);

				// Display valores
				System.out.print("Region ID: " + region_id);
				System.out.print(" Pais " + pais);
				System.out.print(" Pais ID: " + pais_id);
				System.out.println();
			}

			// PASO 6: Limpiar el entorno
			rs.close();
			stmt.close();
			// conn.close();
			// CON SENTENCIAS PRECOMPILADAS
			pstmt = conn.prepareStatement("SELECT * FROM countries WHERE region_id = ?");
			pstmt.setString(1, region);
			ResultSet prs = pstmt.executeQuery();
			while (prs.next()) {
				// Recuperamos por nombre de columna
				String regions_id = prs.getString("region_id");
				String coutry_name = prs.getString("country_name");
				String country_id = prs.getString("country_id");

				// Display valores
				System.out.print("Region ID: " + regions_id);
				System.out.print(", Pais: " + coutry_name);
				System.out.print(", Pais ID : " + country_id);
				System.out.println();
			}

		} catch (SQLException se) {
			// Manejar errores de JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Manejar errores de Class.forName
			e.printStackTrace();
		} finally {
			// cerrar los recursos
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // no se hace nada
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // fin finally try
		} // fin try
		System.out.println("Adios!");
	}// fin main
}// fin