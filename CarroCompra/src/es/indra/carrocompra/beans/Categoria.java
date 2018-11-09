/**
 * 
 */
package es.indra.carrocompra.beans;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author daniel
 *
 */
public class Categoria {

	private int id;
	private String nombre;
	private int totalProductos;
	private Producto [] productos;
	
	//Vector dinámico de Productos en las categorias.
    ArrayList<Producto> arrayProducto = new ArrayList();
	
	/*------------------------------------------------------------------+
	 * 							CONSTUCTORES 							*
	 ------------------------------------------------------------------*/

	public Categoria() {
		super();
		
	}


	/**
	 * @param id
	 * @param nombre
	 * @param totalProductos
	 * @param productos
	 */
	public Categoria(int id, String nombre, int totalProductos, Producto[] productos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.totalProductos = totalProductos;
		this.productos = productos;
	}

	/*----------------------------------------------------------------------+
	 * 							METODOS SET Y GET 							*
	 ----------------------------------------------------------------------*/

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
	 * @return the totalProductos
	 */
	public int getTotalProductos() {
		return totalProductos;
	}


	/**
	 * @param totalProductos the totalProductos to set
	 */
	public void setTotalProductos(int totalProductos) {
		this.totalProductos = totalProductos;
	}


	/**
	 * @return the productos
	 */
	public Producto[] getProductos() {
		return productos;
	}
	
	
	/**
	 * @param productos the productos to set
	 */
	public void setProductos(Producto[] productos) {
		this.productos = productos;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Categoria [id=" + id + ", nombre=" + nombre + ", totalProductos=" + totalProductos + ", productos="
				+ Arrays.toString(productos) + ", arrayProducto=" + arrayProducto + "]";
	}
	
	
}
