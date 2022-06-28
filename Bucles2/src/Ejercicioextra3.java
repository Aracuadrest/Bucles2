import java.util.Scanner;

/**
 * Ingresa la cantidad de lineas para el triangulo de * Ej: 4
 *    *
 *   **
 *   ***
 *  ****
 * @author Araceli
 *
 */
public class Ejercicioextra3 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce un numero entero:");
		int num=entrada.nextInt();
		int i=1;
		int j=1;
		int f=1;
		
		 
		  j=num*2;
		  for(i=1;i<=j;i+=2) {
			  
			  System.out.printf("*");
		     for(f=1;f<i;f++) {
		    	 System.out.println("*");
		     }
		     System.out.println("\n");
		  }
		

		
		}
		
		

	
	}

