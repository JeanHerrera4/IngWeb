/**
 * 
 */
package co.edu.udea.iw.dao;

import java.util.List;

import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.exception.MyException;

/**
 * @author Sergio.llanos
 * @version 1.0
 */
public interface ClienteDAO {
	/**
	 * Lista de clientes ordenados por su fecha de creacion
	 * @return Lista de clientes
	 * @throws MyException 
	 * 
	 */
	public List<Cliente> obtener() throws MyException;
	
	/**
	 * Crea un cliente en la base de datos
	 * @param cliente
	 * @throws MyException
	 */
	public void guardar(Cliente cliente) throws MyException;
	
	public Cliente obtener(String cedula) throws MyException;
}
