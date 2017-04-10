package co.edu.udea.iw.dto;

/**
 * 
 * @author Jean.herrera
 *
 */
//Esta clase es para la ciudad (?)
public class Ciudad {
	
	private long codigo;
	private String nombre;
	private String codigoArea;
	
	public Long getCodigo(){
		return this.codigo;
	}
	
	public void setCodigo(Long codigo){
		this.codigo = codigo;	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigoArea() {
		return codigoArea;
	}

	public void setCodigoArea(String codigoArea) {
		this.codigoArea = codigoArea;
	}
}
