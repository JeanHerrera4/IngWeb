package co.edu.udea.iw.ln;

import java.util.Date;
import java.util.List;

import co.edu.udea.iw.dao.ClienteDAO;
import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.dto.Usuario;
import co.edu.udea.iw.exception.MyException;
import co.edu.udea.iw.dao.UsuarioDAO;

public class ClienteLn {
	
	private ClienteDAO ClienteDAO;
	private UsuarioDAO UsuarioDAO;
	
	/**
	 * @return the clienteDAO
	 */
	public ClienteDAO getClienteDAO() {
		return ClienteDAO;
	}

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

	/**
	 * @param clienteDAO the clienteDAO to set
	 */
	public void setClienteDAO(ClienteDAO clienteDAO) {
		ClienteDAO = clienteDAO;
	}

	public List<Cliente> obtener() throws MyException{
		
		return ClienteDAO.obtener();
	}
	
	public void guardar(String cedula, String nombres, String apellidos, 
			String email, String usuarioCrea) throws MyException{
		
		if(cedula == null || "".equals(cedula)){
			throw new MyException("La cédula no puede estar vacía");
		}
		if(nombres == null || "".equals(nombres)){
			throw new MyException("El nombre no puede estar vacío");
		}
		if(apellidos == null || "".equals(apellidos)){
			throw new MyException("El apellido no puede estar vacío");
		}
		if(email == null || "".equals(email)){
			throw new MyException("El email no puede estar vacío");
		}
		if(usuarioCrea == null || "".equals(usuarioCrea)){
			throw new MyException("El usuario no puede estar vacío");
		}
		
		
		Usuario usuario = UsuarioDAO.obtener(usuarioCrea);
		if(usuario == null){
			throw new MyException("UsuarioCrea no existe en el sistema");
		}
		
		Cliente cliente = new Cliente();
		cliente.setCedula(cedula);
		cliente.setNombres(nombres);
		cliente.setApellidos(apellidos);
		cliente.setEmail(email);
		cliente.setUsuarioCrea(usuario);
		cliente.setFechaCreacion(new Date());
		cliente.setEliminado(Boolean.FALSE);
		
		ClienteDAO.guardar(cliente);

		
	}

}
