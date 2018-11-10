/**
 * 
 */
package es.indra.carrocompra.sistema;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import es.indra.carrocompra.beans.Categoria;
import es.indra.carrocompra.beans.Cliente;
import es.indra.carrocompra.beans.Producto;
import es.indra.carrocompra.services.ReadFile;



/**
 * @author daniel
 * Clase Sistema que va a contener los metodos principales de la practica
 * Metodo aumentarStock
 * Metodo disminuirStock
 * Metodo menuPrincipal
 */
public class Sistema {

	ArrayList<Producto> productos = new ArrayList();
	public int totalProductos;
	public void setTotalProductos(int totalProductos){this.totalProductos=totalProductos;}
	public int getTotalProductos(){return totalProductos;}
	
	
	/*
	 * Metodo que va a aumentar el stock de los productos
	 */
	public void aumentarStock(Producto nuevoProducto) {
		this.productos.add(nuevoProducto);
		this.setTotalProductos(this.getTotalProductos()+1);
		
	}
	
	/*
	 * Metodo que va a disminuir el stock de los productos
	 */
	public void disminuirStock(Producto nuevoProducto) {
		this.productos.remove(nuevoProducto);
        this.setTotalProductos(this.getTotalProductos()-1);
	}
	
	public void addProductoCliente(Producto nuevoProd) {
		
		this.productos.add(nuevoProd);
		this.setTotalProductos(this.getTotalProductos()+1);
	}
	/*
	 * Metodo para comprar un producto seleccionado de una lista
	 * Metodo modificado joshua
	 */
	
	
	public void comprarProducto() {
	
		
		int encontradoID = 0;
		int IDaux;
        int encontrado = 0;
        //variable inicializada en 0 por joshua
        int idProdAux = 0;
        //-------------------------------------
        
        
		//Busco el producto por id
        for(int i=0;i<this.totalProductos;i++){
            if(this.productos.get(i).getId() == (idProdAux)){
                encontradoID = i;
            }
        }
        this.productos.get(encontrado).addProductoCliente(this.productos.get(encontradoID));
        
        
	}
	
	/*
	 * Metodo que contiene el menu principal de la practica
	 * En este menu se realizan llamadas a los diferentes metodos 
	 */
	
	//---------------------------------------------------------------------------------------------------------
	public void menuPrincipal() {
		
		Scanner entrada1 = new Scanner(System.in);
        Producto productos = new Producto();
        char opcion;
        char continuar;
        int id = 0, stock = 0;
        String nombre = null, descripcion = null;
        Categoria categoria = null;
        double precio = 0;
        //** objeto de readfile con los productos 
        ReadFile rfal = new ReadFile();
        //--------
        
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
	                	
	                	/*
	                	 * Esto aumentaria en 1 el producto seleccionado
	                	 */
	                	Producto prodAux = new Producto(id,nombre,descripcion,0,0,categoria);
                        aumentarStock(prodAux);
	                }
	                break;
	                
	                case '2':
	                {
	                	
	                	//Mostrar la lista de productos para decir los que se quieren disminuir
	                	
	                	/*
	                	 * Esto disminuira en 1 el producto seleccionado
	                	 */
	                	Producto prodAux = new Producto(id,nombre,descripcion,0,0,categoria);
                        disminuirStock(prodAux);
                        
                        
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
                System.out.println("\t\t|           CATEGORÃ�AS DE PRODUCTOS                |");
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
            		System.out.println("------------------------------------------------");
            		//System.out.println("id Alimentacion, Opcion:" + opcion);
            		System.out.println("------------------------------------------------");
            		System.out.println("Productos de alimentacion");
            		
            		System.out.println("------------------------------------------------");
            	}
            		break;
            	case '2':
            	{
            		//PERFUMERIA
            		//Mostrar la lista de productos que pertenecen a PERFUMERIA
            		System.out.println("------------------------------------------------");
            		//System.out.println("id Alimentacion, Opcion:" + opcion);
            		System.out.println("------------------------------------------------");
            		System.out.println("Productos de alimentacion");
            		
            		System.out.println("------------------------------------------------");
            	}
            		break;
            	case '3':
            	{
            		//LIMPIEZA
            		//Mostrar la lista de productos que pertenecen a LIMPIEZA
            		System.out.println("------------------------------------------------");
            		//System.out.println("id Alimentacion, Opcion:" + opcion);
            		System.out.println("------------------------------------------------");
            		System.out.println("Productos de alimentacion");
            		
            		System.out.println("------------------------------------------------");
            	}
            		break;
            	}
            }
            	break;
            }
            
            // codigo implementado joshua
            List<String> productoss = rfal.generarProductos(opcion);

            for (int i = 0; i < productoss.size(); i++) {
                System.out.println(productoss.get(i));

			}
            System.out.println("------------------------------------------------");
            //-----------
            System.out.println("Â¿Quiere continuar con el Programa [Y]Si, [N] No?");
            opcion=entrada1.next().charAt(0);
    		
        	
        }while(opcion != 'n');
        
        System.out.println("\t\t************************");
        System.out.println("\t\t*** FIN DEL PROGRAMA ***");
        System.out.println("\t\t************************");
	}
}
