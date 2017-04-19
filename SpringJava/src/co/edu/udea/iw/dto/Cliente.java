/**
 * 
 */
package co.edu.udea.iw.dto;

import java.util.Date;
import java.util.Set;

/**
 * @author Sergio.llanos
 *  @version 1.0
 *
 */
public class Cliente {

	/*Atributos de la clase*/
	private String cedula;
	private String nombres;
	private String apellidos;
	private String email;
	private Usuario usuarioCrea;
	private Date fechaCreacion;
	private Usuario usuarioModifica;
	private Date fechaModificacion;
	private Boolean eliminado;	
	private Usuario usuarioElimina;
	private Date fechaEliminacion;
	private Set<Direccion> direcciones;
	

	
	/**
	 * @return the direcciones
	 */
	public Set<Direccion> getDirecciones() {
		return direcciones;
	}
	/**
	 * @param direcciones the direcciones to set
	 */
	public void setDirecciones(Set<Direccion> direcciones) {
		this.direcciones = direcciones;
	}
	/**
	 * @return the cedula
	 */
	public String getCedula() {
		return cedula;
	}
	/**
	 * @param cedula the cedula to set
	 */
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	/**
	 * @return the nombres
	 */
	public String getNombres() {
		return nombres;
	}
	/**
	 * @param nombres the nombres to set
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the usuarioCrea
	 */
	public Usuario getUsuarioCrea() {
		return usuarioCrea;
	}
	/**
	 * @param usuarioCrea the usuarioCrea to set
	 */
	public void setUsuarioCrea(Usuario usuarioCrea) {
		this.usuarioCrea = usuarioCrea;
	}
	/**
	 * @return the fechaCreacion
	 */
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	/**
	 * @return the usuarioModifica
	 */
	public Usuario getUsuarioModifica() {
		return usuarioModifica;
	}
	/**
	 * @param usuarioModifica the usuarioModifica to set
	 */
	public void setUsuarioModifica(Usuario usuarioModifica) {
		this.usuarioModifica = usuarioModifica;
	}
	/**
	 * @return the fechaModificacion
	 */
	public Date getFechaModificacion() {
		return fechaModificacion;
	}
	/**
	 * @param fechaModificacion the fechaModificacion to set
	 */
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	/**
	 * @return the eliminado
	 */
	public Boolean getEliminado() {
		return eliminado;
	}
	/**
	 * @param eliminado the eliminado to set
	 */
	public void setEliminado(Boolean eliminado) {
		this.eliminado = eliminado;
	}
	/**
	 * @return the usuarioElimina
	 */
	public Usuario getUsuarioElimina() {
		return usuarioElimina;
	}
	/**
	 * @param usuarioElimina the usuarioElimina to set
	 */
	public void setUsuarioElimina(Usuario usuarioElimina) {
		this.usuarioElimina = usuarioElimina;
	}
	/**
	 * @return the fechaEliminacion
	 */
	public Date getFechaEliminacion() {
		return fechaEliminacion;
	}
	/**
	 * @param fechaEliminacion the fechaEliminacion to set
	 */
	public void setFechaEliminacion(Date fechaEliminacion) {
		this.fechaEliminacion = fechaEliminacion;
	}
	
}

