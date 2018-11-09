/**
 * 
 */
package es.indra.carrocompra.sistema;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import es.indra.carrocompra.beans.Categoria;
import es.indra.carrocompra.beans.Cliente;
import es.indra.carrocompra.beans.Producto;



/**
 * @author daniel
 * Clase Sistema que va a contener los metodos principales de la practica
 * Metodo aumentarStock
 * Metodo disminuirStock
 * Metodo menuPrincipal
 */
public class Sistema {

	/*
	 * Metodo que va a aumentar el stock de los productos
	 */
	public void aumentarStock() {
		
	}
	
	/*
	 * Metodo que va a disminuir el stock de los productos
	 */
	public void disminuirStock() {
		
	}
	
	
	
	
	/*
	 * @brief Modulo que muestra una lista de productos de una categoria
	 * @return Devuelve la lista de productos de una categoria.
	 */
	public void mostrarListaProductos(){
	        
	      //HACEMOS UN METODO PARA CADA CATEGORIA?¿? NO SE :(
	}
	
	/*
	 * Metodo que contiene el menu principal de la practica
	 * En este menu se realizan llamadas a los diferentes metodos 
	 */
	public void menuPrincipal() {
		
		Scanner entrada1 = new Scanner(System.in);
        Producto productos = new Producto();
        char opcion;
        char continuar;
        
        
        // ---  INICIALIZACION DE CLIENTE
        Cliente cliente = new Cliente();
        cliente.setNombre("Daniel");
		cliente.setApellidos("Garcia");
		cliente.setDireccion("Calle Castellon");
		cliente.setTelefono(639981209);
		// ---  INICIALIZACION DE CLIENTE
        
        System.out.println("\t\t+--------------------------------------------------+");
        System.out.println("\t\t|     -- BIENVENIDOS AL SISTEMA DE COMPRA --       |");
        System.out.println("\t\t+--------------------------------------------------+");
        
        do {
        	
        	System.out.println("\t\t+--------------------------------------------------+");
            System.out.println("\t\t|                -- MENU SISTEMA --                |");
            System.out.println("\t\t+--------------------------------------------------+");
            System.out.println("\t\t|                                                  |");
            System.out.println("\t\t|  1) EMPRESA                   				   |");
            System.out.println("\t\t|  2) CLIENTE                                      |");
            System.out.println("\t\t+--------------------------------------------------+");
            System.out.println("Pulse 'n' para Salir");
            System.out.println("SELECCIONE UNA OPCION: ");

            opcion= entrada1.next().charAt(0);
            
            switch(opcion) {
            case '1':
            	//EMPRESA
            {
            
            	System.out.println("\t\t+--------------------------------------------------+");
                System.out.println("\t\t|                -- MENU EMPRESA --                |");
                System.out.println("\t\t+--------------------------------------------------+");
                System.out.println("\t\t|                           					   |");
                System.out.println("\t\t|  1) AUMENTAR STOCK                               |");
                System.out.println("\t\t|  2) DISMINUIR STOCK               			   |");
                System.out.println("\t\t|  3) GUARDAR HISTORIAL                            |");
                System.out.println("\t\t|                                                  |");
                System.out.println("\t\t+--------------------------------------------------+");
                System.out.println("Pulse 'n' para Salir");
                System.out.println("SELECCIONE UNA OPCION: ");
                opcion= entrada1.next().charAt(0);
                switch(opcion){
                
	                case '1':
	                {
	                	//Mostrar la lista de productos para decir los que se quieren aumentar
	                }
	                break;
	                
	                case '2':
	                {
	                	//Mostrar la lista de productos para decir los que se quieren disminuir
	                }
	                break;
	                
	                case '3':
	                {
	                	//Guardar el historial de compras
	                }
	                break;
                }
                
            }
            	break;
            case '2':
            	//CLIENTE
            {
            	System.out.println("\t\t+--------------------------------------------------+");
                System.out.println("\t\t|                -- MENU CLIENTE --                |");
                System.out.println("\t\t+--------------------------------------------------+");
                System.out.println("\t\t|               DATOS DEL CLIENTE                  |");
                System.out.println("\t\t| NOMBRE: " + cliente.getNombre() + "  			     	   |");
                System.out.println("\t\t| APELLIDO: "+ cliente.getApellidos() +"      			   |");
                System.out.println("\t\t| DIRECCION: "+ cliente.getDireccion()+"                       |");
                System.out.println("\t\t| TELEFONO: "+ cliente.getTelefono()+"                              |");
                System.out.println("\t\t|                                                  |");
                System.out.println("\t\t|                                                  |");
                System.out.println("\t\t|           CATEGORÍAS DE PRODUCTOS                |");
                System.out.println("\t\t|                                                  |");
                System.out.println("\t\t|  1) ALIMENTACION                                 |");
                System.out.println("\t\t|  2) PERFUMERIA                                   |");
                System.out.println("\t\t|  3) LIMPIEZA                                     |");
                System.out.println("\t\t|                                                  |");
                System.out.println("\t\t+--------------------------------------------------+");
                System.out.println("Pulse 'n' para Salir");
                System.out.println("SELECCIONE UNA OPCION: ");
                opcion= entrada1.next().charAt(0);
            	
                switch(opcion) {
            	case '1':
            	{
            		//ALIMENTACION
            		//Mostrar la lista de productos que pertenecen a ALIMENTACION
            	}
            		break;
            	case '2':
            	{
            		//PERFUMERIA
            		//Mostrar la lista de productos que pertenecen a PERFUMERIA
            	}
            		break;
            	case '3':
            	{
            		//LIMPIEZA
            		//Mostrar la lista de productos que pertenecen a LIMPIEZA
            	}
            		break;
            	}
            }
            	break;
            }
            
            
            System.out.println("¿Quiere continuar con el Programa [Y]Si, [N] No?");
            opcion=entrada1.next().charAt(0);
        	
        }while(opcion != 'n');
        
        System.out.println("\t\t************************");
        System.out.println("\t\t*** FIN DEL PROGRAMA ***");
        System.out.println("\t\t************************");
	}
}
