package co.edu.udea.iw.dao.impl;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;
import co.edu.udea.exception.LaException;
import co.edu.udea.iw.dao.CiudadDAO;
import co.edu.udea.iw.dto.Ciudad;

public class CiudadDAOImplTest {

	//Se hace el test del método a obtener 
	@Test
	public void testObtener1() {
		CiudadDAO ciudadDAO = null;
		List<Ciudad> lista = null;
		
		try{
			ciudadDAO = new CiudadDAOImpl();
			lista = ciudadDAO.obtener();
			assertTrue(lista.size()>0);
		}catch(LaException e){
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	//@Test
	public void testObtener() {
		CiudadDAO ciudadDAO = null;
		Ciudad ciudad = null;
		
		try{
			ciudadDAO = new CiudadDAOImpl();
			ciudad = ciudadDAO.obtener(1L); //La L para el casting a Long
			assertTrue(ciudad!=null);
		}catch(LaException e){
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

}
