
package co.edu.udea.iw.dao;

import java.util.List;

import co.edu.udea.iw.dto.Ciudad;
import co.edu.udea.iw.exception.MyException;

/**
 * @author sergio.llanos
 * @version 1.0
 * 
 */
public interface CiudadDAO {

	

	// Obtiene lista completa de las ciudades de la bd 
	//@throws MyException
		public List<Ciudad> obtener() throws MyException;
		
	// Obtiene una ciudad segun el codigo que mandemos como parametro
	//@throws MyException
		public Ciudad obtener(Long codigo) throws MyException; 

public void guardar(Ciudad ciudad) throws MyException; 

}