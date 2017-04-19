package co.edu.udea.iw.ln.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.exception.MyException;
import co.edu.udea.iw.ln.ClienteLn;

/**
 * @author Jean.Herrera
 * @version 1.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(locations="classpath:configuratioSpring.xml")

public class ClienteLnTest {
	
	@Autowired
	private ClienteLn clienteLn;


	/**
	 * Test method for {@link co.edu.udea.iw.ln.test.ClienteLn#obtener()}.
	 * Probar que trae al menos una ciudad
	 */
	
	@Test
	public void testObtener() {
		List<Cliente> resultado = null;
		
		try {
			clienteLn.guardar("1234", "Jean", "Herrera", "Jean@mail.com", "elver");
			resultado = clienteLn.obtener(); 
			assertTrue(resultado.size() > 0);			
		} catch(MyException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

}
