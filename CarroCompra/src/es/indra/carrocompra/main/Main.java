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
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Categoria categorias = new Categoria();
		Producto p = new Producto();
		Sistema sistema = new Sistema();
		
		p.setId(10);
		p.setNombre("Coca-Ccola"); 
		p.setDescripcion("Producto liquido");
		
		
		
		
		
		//* * cidigo comentado por Joshua ***
		//Map<String, List<Producto>> productosGenerados = new HashMap<>();
		
		//productosGenerados.put("08/11/2018", generarProductos("","",1,1, p));
		
		
		/*
		 * Llamada al menu principal de la practica
		 */
		
		sistema.menuPrincipal();
		

	}

}
