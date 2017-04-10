import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 * @author Jean.herrera
 *
 */

public class Classe {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		consultarCiudades();
		
	}
	
	//Definición del método
	public static void consultarCiudades(){
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Jeanpis","root","root");
			ps = con.prepareStatement("Select * From ciudades");
			rs = ps.executeQuery();
			
			while(rs.next()){
				System.out.println(rs.getString("codigo") + ": " + rs.getString("Nombre"));
			}
		  }catch(ClassNotFoundException e){
			  e.printStackTrace();
		  }catch(SQLException e){
			  e.printStackTrace();
		  }finally{
			  try{
			  rs.close();
			  ps.close();
			  con.close();
			  }catch(SQLException e){
				  e.printStackTrace();
			  }
		  }
		}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub Jean
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Jeanpis","root","root");
		PreparedStatement ps = con.prepareStatement("Select * From ciudades");
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()){
			System.out.println(rs.getString("codigo") + ": " + rs.getString("Nombre"));
		}
	  }catch(ClassNotFoundException e){
		  e.printStackTrace();
	  }catch(SQLException e){
		  e.printStackTrace();
	  }

	}*/

}
