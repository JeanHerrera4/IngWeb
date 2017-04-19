package co.edu.udea.iw.ln;

import co.edu.udea.iw.dto.Usuario;
import co.edu.udea.iw.exception.MyException;
import co.edu.udea.iw.dao.UsuarioDAO;

public class UsuarioLn {
	
	private UsuarioDAO UsuarioDAO;
	

	/**
	 * @return the usuarioDAO
	 */
	public UsuarioDAO getUsuarioDAO() {
		return UsuarioDAO;
	}

	/**
	 * @param usuarioDAO the usuarioDAO to set
	 */
	public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
		UsuarioDAO = usuarioDAO;
	}
	
	public void validar(String login, String password) throws MyException{
		
		if(login == null || "".equals(login)){
			throw new MyException("El login no puede estar vacío");
		}
		if(password == null || "".equals(password)){
			throw new MyException("El nombre no puede estar vacío");
		}		
		
		Usuario usuario = UsuarioDAO.obtener(login);
		
		if(usuario == null){
			throw new MyException("El usuario es incorrecto");
		}
		
		if(!password.equals(usuario.getContrasena())){
			throw new MyException("La contraseña es incorrecta");
		}
	}

}
