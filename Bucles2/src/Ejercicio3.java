import java.util.Scanner;

/**
 *  Pedir por teclado un número entero y hallar su inverso.
 * @author Araceli
 *
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca un número entero: ");
		int num=entrada.nextInt();
		float inverso=0.0f;
		
		while (num!=0) {
			inverso= 1 / (float)num;
			System.out.printf("El inverso es: %d",inverso);
			
		}
		

	}

}
