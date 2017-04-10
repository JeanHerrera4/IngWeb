/**
 * 
 */
package co.edu.udea.iw.dao;

import co.edu.udea.iw.dto.Ciudad;
import co.edu.udea.iw.dto.Usuario;
import co.edu.udea.iw.exception.MyException;

/**
 * @author sergio.llanos
 *
 */
public interface UsuarioDAO {

	public Usuario obtener(String login) throws MyException; 

}
