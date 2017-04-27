package co.edu.udea.iw.ws;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.dto.ClienteJersey;
import co.edu.udea.iw.exception.MyException;
import co.edu.udea.iw.ln.ClienteLn;
import javassist.tools.rmi.RemoteException;

@Path("Cliente")
@Component
public class ClienteWs {
	
	@Autowired
	ClienteLn clienteLn;
	
	
	@POST
	@Produces(MediaType.TEXT_HTML)
	public void guardar(@QueryParam("identificacion")String cedula, 
			@QueryParam("nombre")String nombres, 
			@QueryParam("apellidos")String apellidos,
			@QueryParam("correo")String email,
			@QueryParam("usuarioCrea")String usuarioCrea){
		
		try{
			
			clienteLn.guardar(cedula, nombres, apellidos, email, usuarioCrea);
		}catch(MyException e){
			throw new RemoteException("Error creando el usuario");
		}
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<ClienteJersey> obtener() throws RemoteException{
		List<ClienteJersey> respuesta = new ArrayList<ClienteJersey>();
		
		try{
			for(Cliente cliente: clienteLn.obtener()){
				ClienteJersey clienteJersey = new ClienteJersey(
						cliente.getCedula(),
						cliente.getNombres(),
						cliente.getApellidos(),
						cliente.getEmail()
						);
				
				respuesta.add(clienteJersey);
				
			}
		}catch(MyException e){
			throw new RemoteException("Problema consultando cliente");
		}
		
		return respuesta;
	}

}
