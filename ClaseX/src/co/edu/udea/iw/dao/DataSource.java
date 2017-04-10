package co.edu.udea.iw.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import co.edu.udea.exception.LaException;

/**
 * 
 * @author Jean.herrera
 * @version 1.0
 *@description Entrega conexiones activas de la BD 
 */

public class DataSource {
	
	private static Connection connection; // //Creamos la conexión con la Base de Datos (singleton)
	//private static Connection 
	
	public static Connection getConnection() throws LaException{
		try{
			if(connection == null || connection.isClosed()){
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Jeanpis","root","root");
			}
		}
		//Connection con = null;
		 catch(ClassNotFoundException e){
			  throw new LaException("Driver no encontrado",e);
		   }catch(SQLException e){
			   throw new LaException("No puede establecer conexiÃ³n",e);
		   }
		return connection;
   }

}
