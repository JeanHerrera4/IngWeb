package co.edu.udea.iw.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.edu.udea.iw.exception.MyException;
import co.edu.udea.iw.ln.UsuarioLn;

@Path("usuario")
@Component
public class UsuarioWs {
	
	@Autowired
	UsuarioLn usuarioLn;
	
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String autenticar(@QueryParam("login")String login, @QueryParam("pws")String pws){
				
		try{
			usuarioLn.validar(login, pws);
		}catch(MyException e){
			return e.getMessage();
		}
		return "";
	}
}
