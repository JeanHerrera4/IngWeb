package co.edu.udea.iw.dao.impl.test;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.iw.dao.CiudadDAO;
import co.edu.udea.iw.dao.ClienteDAO;
import co.edu.udea.iw.dao.impl.ClienteDAOImpl;
import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.dto.Rol;
import co.edu.udea.iw.dto.Usuario;
import co.edu.udea.iw.exception.MyException;

/**
 * @author Jean.Herrera
 * @version 1.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(locations="classpath:configuratioSpring.xml")

public class ClienteDAOImplTest {
	
	@Autowired
	ClienteDAO clienteDAO;

	@Test
	//Prueba que se realiza para demostrar que la lista retorna al menos 1 elemento
	public void testObtener() {
		//ClienteDAO clienteDAO = null;
		List<Cliente> resultado = null; //Se crea la lista de clientes
		
		try {
			//clienteDAO = new ClienteDAOImpl();
			resultado = clienteDAO.obtener(); //Con este metodo se obtienen las ciudades
			
			for(Cliente cliente: resultado) {
				System.out.println(new StringBuffer(cliente.getNombres()).append(cliente.getApellidos()));
			}
			
			assertTrue(resultado.size() > 0);
		} catch(MyException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	//Método para Guardar un Cliente
	public void testGuardar(){
		
		Cliente cliente = null;
		//ClienteDAO clienteDao = null;
		Usuario usuario = null;
		try{
			
			cliente = new Cliente();
			cliente.setCedula("723462");
			cliente.setNombres("Jean Carlos");
			cliente.setApellidos(" Herrera Meza");
			cliente.setEmail("Jeanherrera@gmail.com");
			
			
			usuario = new Usuario();
			usuario.setLogin("elver"); //Este usuario ya se encuentra en la BD, esto para poder entrar
			cliente.setUsuarioCrea(usuario);
			cliente.setFechaCreacion(new Date(Calendar.getInstance().getTimeInMillis()));
			clienteDAO = new ClienteDAOImpl();
			clienteDAO.guardar(cliente);
		}catch(MyException e){
			e.printStackTrace();
			
		}
	}


}
