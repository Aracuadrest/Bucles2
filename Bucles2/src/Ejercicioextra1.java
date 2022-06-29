import java.util.Scanner;

/**
 * Ingresa la cantidad de lineas para el triangulo de * Ej: 4
 * *
 * **
 * ***
 * ****
 * @author Araceli
 *
 */
public class Ejercicioextra1 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce un numero entero:");
		int fila=entrada.nextInt();
		
		int j=1;
		
		for (int i=1;i<=fila;i++) {
			
			for (j=1;j<=i;j++) {
			System.out.print("*");
			
			}
			System.out.println();
		}
		

	}

}
