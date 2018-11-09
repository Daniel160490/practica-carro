/**
 * 
 */
package es.indra.carrocompra.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import es.indra.carrocompra.beans.Categoria;
import es.indra.carrocompra.beans.Cliente;
import es.indra.carrocompra.beans.Producto;
import es.indra.carrocompra.sistema.Sistema;


/**
 * @author daniel
 *
 */
public class Main {
	
	/*
	 * 
	 */
	private static List<Producto> generarProductos(String nombre, double precio, String descripcion, Categoria cat){
		List<Producto> productos = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			Producto prod = new Producto();
			prod.setId(i);
			prod.setNombre(nombre);
			prod.setDescripcion(descripcion);
			
			char c1 = (char)new Random().nextInt(50);
			char c2 = (char)new Random().nextInt(50);
			
			prod.setPrecio(precio);
			prod.setDescripcion("" + new Random().nextInt(100));
			prod.setCategoria(cat);
			//prod.setVuelo(p.getVuelos().get(new Random().nextInt(p.getVuelos().size())));
			
			productos.add(prod);
		}
		
		return productos;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Categoria categorias = new Categoria();
		Producto p = new Producto();
		Sistema sistema = new Sistema();
		
		categorias.setNombre("Alimentacion");
		categorias.setNombre("Perfumeria");
		categorias.setNombre("Limpieza");
		
		
		
		p.setId(10);
		p.setNombre("Coca-Ccola"); 
		p.setDescripcion("Producto liquido");
		
	
		Map<String, List<Producto>> productosGenerados = new HashMap<>();
		
		//productosGenerados.put("08/11/2018", generarProductos("","",1,1, p));
		
		
		/*
		 * Llamada al menu principal de la practica
		 */
		
		sistema.menuPrincipal();
		

	}

}
