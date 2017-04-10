/**
 * 
 */
package co.edu.udea.iw.dto;

/**
 * @author sergio.llanos
 * @version 1.0
 */
public class Ciudad {

	//Atributos de la base de datos
	private Long codigo;
	private String Nombre;
	private String CodigoArea;
	
	/**
	 * @return the codigo
	 */
	public Long getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return Nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	/**
	 * @return the codigoArea
	 */
	public String getCodigoArea() {
		return CodigoArea;
	}
	/**
	 * @param codigoArea the codigoArea to set
	 */
	public void setCodigoArea(String codigoArea) {
		CodigoArea = codigoArea;
	}
	
}
