/**
 * 
 */
package co.edu.udea.iw.dto;

import java.io.Serializable;

/**
 * @author sergio.llanos
 * @version 1.0
 */
public class DireccionId implements Serializable {
	private long codigo;
	private Cliente cliente;
	
	/**
	 * @return the codigo
	 */
	public long getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}
	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
