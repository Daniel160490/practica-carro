/**
 * 
 */
package es.indra.carrocompra.sistema;

import java.util.Scanner;

import es.indra.carrocompra.means.Producto;

/**
 * @author daniel
 *
 */
public class Sistema {

	
	public void menuPrincipal() {
		
		Scanner entrada1 = new Scanner(System.in);
        Producto productos = new Producto();
        char opcion;
        char continuar;
        
        
        
        do {
        	
        	System.out.println("\t\t+--------------------------------------------------+");
            System.out.println("\t\t|                -- MENU SISTEMA --                |");
            System.out.println("\t\t+--------------------------------------------------+");
            System.out.println("\t\t|                                                  |");
            System.out.println("\t\t|  1) EMPRESA                   				   |");
            System.out.println("\t\t|  2) CLIENTE                  					   |");
            System.out.println("\t\t+--------------------------------------------------+");
            System.out.println("Pulse 'n' para Salir");
            System.out.println("SELECCIONE UNA OPCION: ");

            opcion= entrada1.next().charAt(0);
            
            switch(opcion) {
            case '1':
            	//EMPRESA
            {
            	
            }
            	break;
            case '2':
            	//CLIENTE
            {
            	System.out.println("\t\t+--------------------------------------------------+");
                System.out.println("\t\t|                -- MENU CLIENTE --                |");
                System.out.println("\t\t+--------------------------------------------------+");
                System.out.println("\t\t|           CATEGORÍAS DE PRODUCTOS                |");
                System.out.println("\t\t|                           					   |");
                System.out.println("\t\t|  1) ALIMENTACION                				   |");
                System.out.println("\t\t|  2) PERFUMERIA               					   |");
                System.out.println("\t\t|  3) LIMPIEZA               					   |");
                System.out.println("\t\t|                           					   |");
                System.out.println("\t\t+--------------------------------------------------+");
                System.out.println("Pulse 'n' para Salir");
                System.out.println("SELECCIONE UNA OPCION: ");
                opcion= entrada1.next().charAt(0);
            	
                switch(opcion) {
            	case '1':
            	{
            		//ALIMENTACION
            	}
            		break;
            	case '2':
            	{
            		//PERFUMERIA
            	}
            		break;
            	case '3':
            	{
            		//LIMPIEZA
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
