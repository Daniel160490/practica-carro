/**
 * 
 */
package es.indra.carrocompra.beans;

import java.util.Arrays;

/**
 * @author daniel
 *
 */
public class Cliente {
	
	
	private int id;
	private String nombre;
	private String apellidos;
	private String direccion;
	private int telefono;
	private Producto producto [];
	
	
	
	/**
	 * 
	 */
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param nombre
	 * @param apellidos
	 * @param direccion
	 * @param telefono
	 * @param producto
	 */
	public Cliente(int id, String nombre, String apellidos, String direccion, int telefono, Producto[] producto) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = telefono;
		this.producto = producto;
	}
	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	public int getTelefono() {
		return telefono;
	}
	
	
	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
	/**
	 * @return the producto
	 */
	public Producto[] getProducto() {
		return producto;
	}
	
	
	/**
	 * @param producto the producto to set
	 */
	public void setProducto(Producto[] producto) {
		this.producto = producto;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", producto=" + Arrays.toString(producto) + "]";
	}
	
	

}
