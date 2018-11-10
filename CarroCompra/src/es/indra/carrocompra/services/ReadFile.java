package es.indra.carrocompra.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
	public List<String> generarProductos(char entrada) {
		//System.out.println("entrada del menu:" + entrada);
		List<String> catalimentos = new ArrayList<>();
		
		//int opcionfi = Integer.parseInt(String.valueOf(entrada));
		
		//Path path = Paths.get("C:/Users/Joshua/Desktop/Java/Aplicacioncarritocompra/cursojava/categoriaalimento.txt");
		try {
			if (entrada == '1') {
				Path path = Paths.get("C:/Users/Joshua/Desktop/Java/Aplicacioncarritocompra/CursoJava/Nueva carpeta/categoriaalimentacion.txt");
				catalimentos = Files.readAllLines(path);
				System.out.println("Alimentacion");
				
			} else if (entrada == '2') {
				Path path = Paths.get("C:/Users/Joshua/Desktop/Java/Aplicacioncarritocompra/CursoJava/categoriaperfume.txt");
				catalimentos = Files.readAllLines(path);	
				System.out.println("perfume:");

			} else if (entrada == '3') {
				Path path = Paths.get("C:/Users/Joshua/Desktop/Java/Aplicacioncarritocompra/CursoJava/categorialimpieza.txt");
				catalimentos = Files.readAllLines(path);	
				System.out.println("limpieza:");
				} else {
					System.out.println("No has introducido una opcion correcta");
				}
			
			
		} catch (IOException e) {
			System.out.println("Fallo al leer el carchivo00" + e);
		} finally {
			System.out.println("------------------------------------------------");
		}	
		
		return catalimentos;
	}

}
