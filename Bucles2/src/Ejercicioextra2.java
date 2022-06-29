import java.util.Scanner;

/**
 * Ingresa la cantidad de lineas para el triangulo de * inverso Ej: 4
 * ****
 * ***
 * **
 * *
 * @author Araceli
 *
 */
public class Ejercicioextra2 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce un numero entero:");
		int num=entrada.nextInt();
		int i;
		int j=1;
		
		for (i=num;i>=1;i--) {
			
			for (j=1;j<=i;j++) {
			System.out.print("*");
			
			}
			System.out.println();
		}
		

	}

}
