/**
 * 
 */
package es.indra.carrocompra.beans;

import java.util.ArrayList;

/**
 * @author daniel
 *
 */
public class Producto extends Categoria {
	
	private int id;
	private String nombre;
	private String descripcion;
	private double precio;
	private int stock;
	private Categoria categoria;
	
	
	/**
	 * 
	 */
	public Producto() {
		super();
		
	}
	
	
	/**
	 * @param id
	 * @param nombre
	 * @param descripcion
	 * @param precio
	 * @param stock
	 */
	public Producto(int id, String nombre, String descripcion, double precio, int stock, Categoria categoria) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
		this.categoria = categoria;
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
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	
	
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}
	
	
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	/**
	 * @return the stock
	 */
	public int isStock() {
		return stock;
	}
	
	
	/**
	 * @param stock the stock to set
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}


	/**
	 * @return the categoria
	 */
	public Categoria getCategoria() {
		return categoria;
	}


	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio
				+ ", stock=" + stock + ", categoria=" + categoria + "]";
	}


	public void addProductoCliente(Producto producto) {
		
		
	}


	
	
}
