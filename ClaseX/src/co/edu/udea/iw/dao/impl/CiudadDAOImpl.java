package co.edu.udea.iw.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.edu.udea.exception.LaException;
import co.edu.udea.iw.dao.CiudadDAO;
import co.edu.udea.iw.dao.DataSource;
import co.edu.udea.iw.dto.Ciudad;

/**
 * @author Jean.herrera
 *
 */
public class CiudadDAOImpl implements CiudadDAO{
		
	public List<Ciudad> obtener() throws LaException{
	
		PreparedStatement ps = null; //Se realiza la consulta
		Connection con = null; //Se realiza la conexión a la base de datos
		ResultSet rs = null; //Datos obtenidos de la consulta realizada
		List<Ciudad> lista = new ArrayList<Ciudad>();
		try{
			con = DataSource.getConnection();
			ps = con.prepareStatement("Select * From ciudades");
			rs = ps.executeQuery();
			while(rs.next()){ //Se traen los datos mientras exista un dato siguiente
				Ciudad ciudad = new Ciudad();
				ciudad.setCodigo(rs.getLong("Codigo"));
				ciudad.setNombre(rs.getString("Nombre"));
				ciudad.setCodigoArea(rs.getString("CodigoArea"));
				lista.add(ciudad);
			}
		}catch(SQLException e){
			throw new LaException("Error consultando",e);
		}finally{
			try{
				if(rs != null)
					rs.close();
				if(ps != null)
					ps.close();
				if(con != null)
					con.close();
			}catch(SQLException e){
				throw new LaException("Error cerrando",e);
			}
		}
		return lista;
	}
	
	//Obtener una ciudad segÃºn el cÃ³digo de la misma
	public Ciudad obtener(Long codigo) throws LaException{
		
		PreparedStatement ps = null; //Se realiza la consulta
		Connection con = null; // Se realiza la conexión a la base de datos
		ResultSet rs = null; // Datos obtenidos de la consulta
		Ciudad ciudad = null;
		
		try{
			con = DataSource.getConnection();
			ps = con.prepareStatement("Select * From ciudades Where codigo = ?");
			ps.setLong(1, codigo); //Con esto evito SQL Inyection
			rs = ps.executeQuery();
			while(rs.next()){
				ciudad = new Ciudad();
				ciudad.setCodigo(rs.getLong("Codigo"));
				ciudad.setNombre(rs.getString("Nombre"));
				ciudad.setCodigoArea(rs.getString("CodigoArea"));
			}
		}catch(SQLException e){
			throw new LaException("Error consultando",e);
		}finally{
			try{
				if(rs != null)
					rs.close();
				if(ps != null)
					ps.close();
				if(con != null)
					con.close();
			}catch(SQLException e){
				throw new LaException("Error cerrando",e);
			}
		}
		return ciudad;
	}

}
