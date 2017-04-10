package co.edu.udea.iw.dao;

import java.util.List;
import co.edu.udea.exception.LaException;
import co.edu.udea.iw.dto.Ciudad;

/**
 * @author Jean.herrera
 * @version 1.0
 */

public interface CiudadDAO {
	//Entrega la lista completa de la base de datos ordenadas por su nombre
	public List<Ciudad> obtener() throws LaException;
	//Método para obtener una ciudad específica
	public Ciudad obtener(Long codigo) throws LaException; 

}
