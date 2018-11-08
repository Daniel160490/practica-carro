/**
 * 
 */
package es.indra.carrocompra.means;

/**
 * @author daniel
 *
 */
public class Categoria {

	private int id;
	private String nombre;
	private Producto [] productos;
	
	
	
	/*------------------------------------------------------------------+
	 * 							CONSTUCTORES 							*
	 ------------------------------------------------------------------*/

	public Categoria() {
		super();
		
	}


	/**
	 * @param id
	 * @param nombre
	 * @param productos
	 */
	public Categoria(int id, String nombre, Producto[] productos) {
		super();
		this.id = id;
		this.nombre = nombre;
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
}
