package co.edu.udea.iw.dto;

public class Direccion {

	private DireccionId id;
	private String direccion;
	private String telefono;
	private Ciudad ciudad;
	private Boolean preferida;
	
	/**
	 * @return the id
	 */
	public DireccionId getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(DireccionId id) {
		this.id = id;
	}
	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	/**
	 * @return the ciudad
	 */
	public Ciudad getCiudad() {
		return ciudad;
	}
	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
	/**
	 * @return the preferida
	 */
	public Boolean getPreferida() {
		return preferida;
	}
	/**
	 * @param preferida the preferida to set
	 */
	public void setPreferida(Boolean preferida) {
		this.preferida = preferida;
	}
	
	
}
