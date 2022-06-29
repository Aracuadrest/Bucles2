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
		
		
	for(f=1;f<=num*2;f=+2) {	 
		for (i=num;i>=1;i++) {
			
			for (j=1;j<=i;j++) {
			System.out.printf("*");
			
			}
			System.out.println("");
		}
		System.out.println("");


		
		}
		
		
	}
	
	}

